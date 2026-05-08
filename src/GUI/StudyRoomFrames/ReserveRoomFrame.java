package GUI.StudyRoomFrames;

import Code.ArrayListsManager;
import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ReserveRoomFrame implements ActionListener {
    ArrayListsManager aa=ArrayListsManager.instance;
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
        submitButton=new CreateSubmitButton("Reserve");

        backButton.addActionListener(this);
        exitButton.addActionListener(this);
        submitButton.addActionListener(this);

        roomLabel.setText("Enter Room Number:");
        memberIDLabel.setText("Enter Member ID:");

        roomLabel.setBounds(10, 120, 680, 25);
        memberIDLabel.setBounds(10, 190, 680, 25);

        roomLabel.setFont(new Font("Inter", Font.BOLD, 14));
        roomLabel.setForeground(Color.white);

        memberIDLabel.setFont(new Font("Inter", Font.BOLD, 14));
        memberIDLabel.setForeground(Color.white);

        roomField.setBounds(10, 150, 670, 30);
        memberField.setBounds(10, 220, 670, 30);

        roomField.setFont(new Font("Inter", Font.PLAIN, 14));
        memberField.setFont(new Font("Inter", Font.PLAIN, 14));

        roomField.setBackground(new Color(10,20,35));
        roomField.setForeground(Color.white);
        roomField.setCaretColor(Color.cyan);
        roomField.setBorder(BorderFactory.createLineBorder(new Color(0, 180, 255), 1));

        memberField.setBackground(new Color(10,20,35));
        memberField.setForeground(Color.white);
        memberField.setCaretColor(Color.cyan);
        memberField.setBorder(BorderFactory.createLineBorder(new Color(0, 180, 255), 1));

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

        if(e.getSource()==submitButton){
            String roomNumber = roomField.getText();
            String memberID = memberField.getText();

            String result = aa.reserveRoom(roomNumber, memberID);
            new CreateDialogBox("Room Reservation ",result);

        }

    }
}
