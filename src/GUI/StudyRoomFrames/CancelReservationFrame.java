package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;

public class CancelReservationFrame {
    CreateFrame frame;
    CreateBackButton button;
    CreateExitButton exitButton;
    CreateLabel label;
    JLabel roomLabel=new JLabel();
    JLabel memberIDLabel =new JLabel();

    JTextField roomField=new JTextField();
    JTextField memberField=new JTextField();

    public CancelReservationFrame(){
        frame=new CreateFrame();
        button=new CreateBackButton();
        exitButton=new CreateExitButton();
        label=new CreateLabel("Cancel Reservation");

        roomLabel.setText("Enter Room Number:");
        memberIDLabel.setText("Enter Member ID:");

        roomLabel.setBounds(10,120,680,30);
        memberIDLabel.setBounds(10,190,680,30);

        roomLabel.setFont( new Font("Inter", Font.BOLD,14));
        roomLabel.setBackground(Color.lightGray);

        memberIDLabel.setFont(new Font("Inter", Font.BOLD,14));
        memberIDLabel.setBackground(Color.lightGray);

        roomField.setBounds(10,150,670,30);
        memberField.setBounds(10,220,670,30);

        roomField.setFont(new Font("Inter", Font.PLAIN,14));
        memberField.setFont(new Font("Inter", Font.PLAIN,14));

        frame.add(label);
        frame.add(roomLabel);
        frame.add(roomField);
        frame.add(memberIDLabel);
        frame.add(memberField);
        frame.add(button);
        frame.add(exitButton);

        frame.setVisible(true);

    }
}
