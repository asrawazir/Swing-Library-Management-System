package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;

public class ReturnBook {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Return Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    public ReturnBook(){

        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");

        memberIdLabel.setBounds(10,120,680,30);
        bookIdLabel.setBounds(10,190,680,30);

        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setBackground(Color.LIGHT_GRAY);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setBackground(Color.LIGHT_GRAY);


        rbFrame.add(memberIdLabel);
        rbFrame.add(bookIdLabel);
        rbFrame.add(backButton);
        rbFrame.add(exitButton);
        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
}
