package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBook implements ActionListener {
    CreateFrame ibFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issue a Book");

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public IssueBook(){

        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");

        memberIdLabel.setBounds(10,120,680,30);
        bookIdLabel.setBounds(10,190,680,30);

        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setBackground(Color.LIGHT_GRAY);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setBackground(Color.LIGHT_GRAY);

        memberIdTextField.setBounds(10,150,670,30);
        memberIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        memberIdTextField.setForeground(Color.BLACK);
        memberIdTextField.setBackground(Color.WHITE);
        memberIdTextField.setCaretColor(Color.BLACK);

        bookIdTextField.setBounds(10,220,670,30);
        bookIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        bookIdTextField.setForeground(Color.BLACK);
        bookIdTextField.setBackground(Color.WHITE);
        bookIdTextField.setCaretColor(Color.BLACK);

        ibFrame.add(backButton);
        ibFrame.add(exitButton);
        ibFrame.add(memberIdTextField);
        ibFrame.add(bookIdTextField);
        ibFrame.add(memberIdLabel);
        ibFrame.add(bookIdLabel);
        ibFrame.add(label);
        ibFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            ibFrame.dispose();
            new BookHomeFrame();
        }
    }
}
