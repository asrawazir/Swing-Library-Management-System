package GUI.BookFrames;

import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBook implements ActionListener {

    //creating a basic frame using pre-defined class
    CreateFrame ibFrame = new CreateFrame();

    //Creating main label holding the header
    CreateLabel label = new CreateLabel("Issue a Book");

    //Creating labels to hold the text on frame
    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();
    JLabel dateLabel = new JLabel();

    //Creating text fields to receive user input on frame
    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();
    JTextField dateTextField = new JTextField();

    //Creating back button, submit button and exit button using pre-defined classes
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Issue");

    //Default Constructor
    public IssueBook(){

        //Defining the text for JLabel objects
        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");
        dateLabel.setText("Enter Issue Date: ");

        //setting bounds of the JLabel objects
        memberIdLabel.setBounds(10,50,680,30);
        bookIdLabel.setBounds(10,120,680,30);
        dateLabel.setBounds(10,190,680,30);

        //defining font properties and background color for JLabel objects
        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setBackground(Color.LIGHT_GRAY);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setBackground(Color.LIGHT_GRAY);
        dateLabel.setFont(new Font("Inter",Font.BOLD,14));
        dateLabel.setBackground(Color.LIGHT_GRAY);

        //Defining location, font and color properties of text fields
        memberIdTextField.setBounds(10,80,670,30);
        memberIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        memberIdTextField.setForeground(Color.BLACK);
        memberIdTextField.setBackground(Color.WHITE);
        memberIdTextField.setCaretColor(Color.BLACK);
        //================================================================
        bookIdTextField.setBounds(10,150,670,30);
        bookIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        bookIdTextField.setForeground(Color.BLACK);
        bookIdTextField.setBackground(Color.WHITE);
        bookIdTextField.setCaretColor(Color.BLACK);
        //================================================================
        dateTextField.setBounds(10,220,670,30);
        dateTextField.setFont(new Font("Inter",Font.PLAIN,14));
        dateTextField.setForeground(Color.BLACK);
        dateTextField.setBackground(Color.WHITE);
        dateTextField.setCaretColor(Color.BLACK);
        //================================================================

        //Adding action listener method to buttons defined in the frame
        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        //Adding label objects to the frame
        ibFrame.add(label);
        ibFrame.add(memberIdLabel);
        ibFrame.add(bookIdLabel);
        ibFrame.add(dateLabel);

        //Adding text field object to the frame
        ibFrame.add(memberIdTextField);
        ibFrame.add(bookIdTextField);
        ibFrame.add(dateTextField);

        //Adding submit buttons for the frame
        ibFrame.add(submitButton);
        ibFrame.add(backButton);
        ibFrame.add(exitButton);

        //Setting the visibility of frame to be true
        ibFrame.setVisible(true);
    }

    //Overriding actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e){

        //processing the input received through back button
        if (e.getSource()==backButton){
            ibFrame.dispose();
            new BookHomeFrame();
        }
        //processing the input received through submit button
        if (e.getSource()==submitButton){
            String bookId = bookIdTextField.getText();
            String memberId = memberIdTextField.getText();
            String date = dateTextField.getText();

            new CreateDialogBox("Success", "Book Issued Successfully");
        }
    }
}
