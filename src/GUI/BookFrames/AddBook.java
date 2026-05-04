package GUI.BookFrames;

import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBook implements ActionListener {

    //creating a basic frame using pre-defined class
    CreateFrame abFrame = new CreateFrame();

    //Creating main label holding the header
    CreateLabel label = new CreateLabel("Add a Book");

    //Creating labels to hold the text on frame
    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    //Creating text fields to receive user input on frame
    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField authorTextField = new JTextField();
    JTextField quantityTextField = new JTextField();

    //Creating back button, submit button and exit button using pre-defined classes
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton =new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Add");

    //Default Constructor
    public AddBook(){

        //Setting the text of the JLabel objects
        idLabel.setText("Enter Book ID : ");
        titleLabel.setText("Enter Book Title : ");
        authorLabel.setText("Enter Author Name : ");
        quantityLabel.setText("Enter Total Quantity : ");

        //setting bounds of the JLabel objects
        idLabel.setBounds(10,50,680,30);
        titleLabel.setBounds(10,120,680,30);
        authorLabel.setBounds(10,190,680,30);
        quantityLabel.setBounds(10,260,680,30);

        //defining font properties and background color of JLabel objects
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setBackground(Color.LIGHT_GRAY);
        titleLabel.setFont(new Font("Inter",Font.BOLD,14));
        titleLabel.setBackground(Color.LIGHT_GRAY);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setBackground(Color.LIGHT_GRAY);
        quantityLabel.setFont(new Font("Inter",Font.BOLD,14));
        quantityLabel.setBackground(Color.LIGHT_GRAY);

        //defining the location of Text Fields
        idTextField.setBounds(10,80,670,30);
        titleTextField.setBounds(10,150,670,30);
        authorTextField.setBounds(10,220,670,30);
        quantityTextField.setBounds(10,290,670,30);

        //Defining the font and color properties of text fields
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(Color.WHITE);
        idTextField.setCaretColor(Color.BLACK);
        //================================================================
        titleTextField.setFont(new Font("Inter",Font.PLAIN,14));
        titleTextField.setForeground(Color.BLACK);
        titleTextField.setBackground(Color.WHITE);
        titleTextField.setCaretColor(Color.BLACK);
        //================================================================
        authorTextField.setFont(new Font("Inter",Font.PLAIN,14));
        authorTextField.setForeground(Color.BLACK);
        authorTextField.setBackground(Color.WHITE);
        authorTextField.setCaretColor(Color.BLACK);
        //================================================================
        quantityTextField.setFont(new Font("Inter",Font.PLAIN,14));
        quantityTextField.setForeground(Color.BLACK);
        quantityTextField.setBackground(Color.WHITE);
        quantityTextField.setCaretColor(Color.BLACK);
        //================================================================

        //Adding the labels to the frame
        abFrame.add(label);
        abFrame.add(idLabel);
        abFrame.add(titleLabel);
        abFrame.add(authorLabel);
        abFrame.add(quantityLabel);

        //Adding the text fields to the frame
        abFrame.add(idTextField);
        abFrame.add(titleTextField);
        abFrame.add(authorTextField);
        abFrame.add(quantityTextField);

        //Adding action listener method to the buttons defined
        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        //Adding buttons to the frame
        abFrame.add(backButton);
        abFrame.add(exitButton);
        abFrame.add(submitButton);

        //making the frame visible
        abFrame.setVisible(true);
    }

    //Overriding actionPerformed method of ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e){

        //processing the input received via back button
        if (e.getSource()==backButton){
            abFrame.dispose();
            new BookHomeFrame();
        }

        //processing the press on submit button
        if (e.getSource()==submitButton){
            String id = idTextField.getText();
            String title = titleTextField.getText();
            String author = authorTextField.getText();
            String quantity = quantityTextField.getText();
            new CreateDialogBox("Success","Book Added Successfully");
        }
    }
}
