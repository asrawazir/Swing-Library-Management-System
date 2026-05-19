package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.FileManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReturnBookFrame implements ActionListener {

    //Creating a Frame
    CreateFrame rbFrame = new CreateFrame();

    //Defining labels for the frame
    CreateLabel label = new CreateLabel("Return Book");
    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    //Defining text fields for the frame
    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    //Creating button objects for the frame
    CreateSubmitButton submitButton = new CreateSubmitButton("Return");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    //Creating an instance object of ArrayLists Manager
    ArrayListsManager alm = ArrayListsManager.instance;

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

        //Adding actionListener to the buttons
        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        //Adding components to the frame
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
        //Processing back button
        if (e.getSource()==backButton){
            rbFrame.dispose();
            new BookHomeFrame();
        }

        //Processing submit button
        if (e.getSource()==submitButton)
        {
            //Receiving data from fields
            String memberId = memberIdTextField.getText().trim();
            String bookId = bookIdTextField.getText().trim();

            //Checking the received data by calling a method ArrayListsManager class
            String result = alm.returnBook(bookId, memberId);

            if(result.equals("Book returned successfully"))
            {
                //Creating an object of FileManager class
                FileManager fm = new FileManager();
                //Updating the data in files after returning a book
                fm.saveBooksDataToFile();
                fm.saveIssuedBooksDataToFile();

                //Creating DialogBox object
                new CreateDialogBox("Success", result);
            }
            else
            {
                new CreateDialogBox("Error", result);
            }
        }
    }
}
