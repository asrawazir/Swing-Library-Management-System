package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReturnBookFrame implements ActionListener {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Return Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    ArrayListsManager alm = ArrayListsManager.instance;

    CreateSubmitButton submitButton = new CreateSubmitButton("Return");

    public ReturnBookFrame(){

        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");

        memberIdLabel.setBounds(10,150,680,25);
        bookIdLabel.setBounds(10,210,680,25);

        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setForeground(Color.WHITE);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setForeground(Color.WHITE);

        memberIdTextField.setBounds(10,180,670,30);
        memberIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(new Color(10,20,35));
        memberIdTextField.setCaretColor(Color.WHITE);

        bookIdTextField.setBounds(10,240,670,30);
        bookIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        bookIdTextField.setForeground(Color.WHITE);
        bookIdTextField.setBackground(new Color(10,20,35));
        bookIdTextField.setCaretColor(Color.WHITE);

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
            String memberId = memberIdTextField.getText();
            String bookId = bookIdTextField.getText();
            ArrayList<IssuedBook> issuedBooks = alm.getIssuedBooksList();
            new CreateDialogBox("Success", "Book Returned Successfully");
        }
    }
}
