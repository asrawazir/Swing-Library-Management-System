package GUI.BookFrames;

import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnBookFrame implements ActionListener {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Return Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    CreateSubmitButton submitButton = new CreateSubmitButton("Return");

    public ReturnBookFrame(){

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

        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        rbFrame.add(submitButton);
        rbFrame.add(memberIdTextField);
        rbFrame.add(bookIdTextField);
        rbFrame.add(memberIdLabel);
        rbFrame.add(bookIdLabel);
        rbFrame.add(backButton);
        rbFrame.add(exitButton);
        rbFrame.add(label);
        rbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            rbFrame.dispose();
            new BookHomeFrame();
        }

        if (e.getSource()==submitButton){
            new CreateDialogBox("Success", "Book Returned Successfully");
        }
    }
}
