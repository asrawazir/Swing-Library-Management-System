package GUI.StudyRoomFrames;

import Code.ArrayListsManager;
import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckReservationFrame implements ActionListener {
    CreateFrame frame;
    CreateLabel label;
    JLabel jLabel;
    CreateBackButton backButton;

    JTextField textField=new JTextField();
    CreateSubmitButton submitButton;
    CreateExitButton exitButton;


    ArrayListsManager aa=ArrayListsManager.instance;

    public CheckReservationFrame(){
        frame=new CreateFrame();
        label=new CreateLabel("Check Reservation Status");
        jLabel=new JLabel("Enter room number :");
        backButton=new CreateBackButton();
        exitButton=new CreateExitButton();


        submitButton=new CreateSubmitButton("Check");

        backButton.addActionListener(this);
        textField.addActionListener(this);
        submitButton.addActionListener(this);
        exitButton.addActionListener(this);


         jLabel.setBounds(10,160,680,30);
         jLabel.setFont(new Font("Inter", Font.BOLD,14));
         jLabel.setBackground(Color.lightGray);

         textField.setBounds(10,190,670,30);
         textField.setFont(new Font("Inter", Font.PLAIN,14));


        frame.add(label);
        frame.add(jLabel);
        frame.add(textField);
        frame.add(backButton);
        frame.add(exitButton);

        frame.add(submitButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton) {
            frame.dispose();
            new StudyRoomHomeFrame();
        }

        if(e.getSource()==submitButton){
            String roomNumber = textField.getText();
            String result = aa.checkReservationStatus(roomNumber);
            new CreateDialogBox("Check Reservation",result);

        }

    }

}

