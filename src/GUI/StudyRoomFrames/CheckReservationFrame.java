package GUI.StudyRoomFrames;

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



    public CheckReservationFrame(){
        frame=new CreateFrame();
        label=new CreateLabel("Check Reservation Status");
        jLabel=new JLabel("Enter room number :");
        backButton=new CreateBackButton();

        submitButton=new CreateSubmitButton("Submit");

        backButton.addActionListener(this);
        textField.addActionListener(this);
        submitButton.addActionListener(this);

         jLabel.setBounds(10,190,680,30);
         jLabel.setFont(new Font("Inter", Font.BOLD,14));
         jLabel.setBackground(Color.lightGray);

         textField.setBounds(10,220,670,30);
         textField.setFont(new Font("Inter", Font.PLAIN,14));


        frame.add(label);
        frame.add(jLabel);
        frame.add(textField);
        frame.add(backButton);

        frame.add(submitButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton) {
            frame.dispose();
            new StudyRoomHomeFrame();
        }


    }

}

