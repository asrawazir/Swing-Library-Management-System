package GUI.StudyRoomFrames;

import Code.ArrayListsManager;
import Code.StudyRoom;
import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelReservationFrame implements ActionListener {

    ArrayListsManager aa=ArrayListsManager.instance;
    CreateFrame frame;
    CreateBackButton button;
    CreateLabel label;
    JLabel roomLabel=new JLabel();
    JLabel memberIDLabel =new JLabel();
     CreateSubmitButton submitButton;
    JTextField roomField=new JTextField();
    JTextField memberField=new JTextField();
    CreateExitButton exitButton;

    public CancelReservationFrame(){
        frame=new CreateFrame();
        button=new CreateBackButton();
        exitButton=new CreateExitButton();
        label=new CreateLabel("Cancel Reservation");
        submitButton=new CreateSubmitButton("Submit");


        button.addActionListener(this);
        submitButton.addActionListener(this);
        exitButton.addActionListener(this);

        roomLabel.setText("Enter Room Number:");
        memberIDLabel.setText("Enter Member ID:");

        roomLabel.setBounds(10,120,680,30);
        memberIDLabel.setBounds(10,190,680,30);

        roomLabel.setFont( new Font("Inter", Font.BOLD,14));
        roomLabel.setForeground(Color.white);

        memberIDLabel.setFont(new Font("Inter", Font.BOLD,14));
        memberIDLabel.setBackground(Color.lightGray);

        roomField.setBounds(10,150,670,30);
        memberField.setBounds(10,220,670,30);

        roomField.setFont(new Font("Inter", Font.PLAIN,14));
        memberField.setFont(new Font("Inter", Font.PLAIN,14));
        roomField.setBackground(new Color(10,20,35));
        roomField.setForeground(Color.white);
        


        frame.add(label);
        frame.add(roomLabel);
        frame.add(roomField);
        frame.add(memberIDLabel);
        frame.add(memberField);
        frame.add(button);
        frame.add(exitButton);


        frame.add(submitButton);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            frame.dispose();
            new StudyRoomHomeFrame();
        }

        if (e.getSource() == submitButton) {
            String roomNumber = roomField.getText();
            String memberID = memberField.getText();

             String result = aa.cancelReservation(roomNumber, memberID);
           new CreateDialogBox("Cancel Reservation",result);

        }

    }
}
