package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBookFrame implements ActionListener {

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

    ArrayListsManager alm = ArrayListsManager.instance;

    //Creating back button, submit button and exit button using pre-defined classes
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Issue");

    //Default Constructor
    public IssueBookFrame(){

        //Defining the text for JLabel objects
        memberIdLabel.setText("Enter Member ID : ");
        bookIdLabel.setText("Enter Book ID : ");
        dateLabel.setText("Enter Issue Date: ");

        //setting bounds of the JLabel objects
        memberIdLabel.setBounds(10,90,680,25);
        bookIdLabel.setBounds(10,150,680,25);
        dateLabel.setBounds(10,210,680,25);

        //defining font properties and background color for JLabel objects
        memberIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        memberIdLabel.setForeground(Color.WHITE);
        bookIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        bookIdLabel.setForeground(Color.WHITE);
        dateLabel.setFont(new Font("Inter",Font.BOLD,14));
        dateLabel.setForeground(Color.WHITE);

        //Defining location, font and color properties of text fields
        memberIdTextField.setBounds(10,120,670,30);
        memberIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        memberIdTextField.setForeground(Color.WHITE);
        memberIdTextField.setBackground(Color.WHITE);
        memberIdTextField.setCaretColor(Color.WHITE);
        //================================================================
        bookIdTextField.setBounds(10,180,670,30);
        bookIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        bookIdTextField.setForeground(Color.WHITE);
        bookIdTextField.setBackground(Color.WHITE);
        bookIdTextField.setCaretColor(Color.WHITE);
        //================================================================
        dateTextField.setBounds(10,240,670,30);
        dateTextField.setFont(new Font("Inter",Font.PLAIN,14));
        dateTextField.setForeground(Color.WHITE);
        dateTextField.setBackground(Color.WHITE);
        dateTextField.setCaretColor(Color.WHITE);
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
            IssuedBook iB = alm.findIssueBook(bookId,memberId,date);
            alm.addIssuedBook(iB);
            new CreateDialogBox("Success", "Book Issued Successfully");
        }
    }
}
