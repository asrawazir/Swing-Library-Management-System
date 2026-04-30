package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ReserveRoomFrame implements ActionListener {
    CreateFrame frame;
    CreateBackButton backButton;
    CreateLabel label;
    CreateExitButton exitButton;
    JLabel roomLabel = new JLabel();
    JLabel memberIDLabel = new JLabel();
    JTextField roomField = new JTextField();
    JTextField memberField = new JTextField();
    CreateSubmitButton submitButton;

    public ReserveRoomFrame() {
        frame = new CreateFrame();
        backButton = new CreateBackButton();
        label = new CreateLabel("Reserve Room");
        exitButton = new CreateExitButton();
        submitButton=new CreateSubmitButton("Reserve Room");

        backButton.addActionListener(this);
        exitButton.addActionListener(this);
        submitButton.addActionListener(this);

        roomLabel.setText("Enter Room Number:");
        memberIDLabel.setText("Enter Member ID:");

        roomLabel.setBounds(10, 120, 680, 30);
        memberIDLabel.setBounds(10, 190, 680, 30);

        roomLabel.setFont(new Font("Inter", Font.BOLD, 14));
        roomLabel.setBackground(Color.lightGray);

        memberIDLabel.setFont(new Font("Inter", Font.BOLD, 14));
        memberIDLabel.setBackground(Color.lightGray);

        roomField.setBounds(10, 150, 670, 30);
        memberField.setBounds(10, 220, 670, 30);

        roomField.setFont(new Font("Inter", Font.PLAIN, 14));
        memberField.setFont(new Font("Inter", Font.PLAIN, 14));

        frame.add(label);
        frame.add(roomLabel);
        frame.add(roomField);
        frame.add(memberIDLabel);
        frame.add(memberField);
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


    }
}
