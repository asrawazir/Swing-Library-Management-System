package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;

public class IssueBook {
    CreateFrame ibFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issue a Book");

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    public IssueBook(){

        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");

        memberIdLabel.setBounds(10,120,680,30);
        bookIdLabel.setBounds(10,190,680,30);

        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setBackground(Color.LIGHT_GRAY);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setBackground(Color.LIGHT_GRAY);

        ibFrame.add(memberIdLabel);
        ibFrame.add(bookIdLabel);
        ibFrame.add(label);
        ibFrame.setVisible(true);
    }
}
