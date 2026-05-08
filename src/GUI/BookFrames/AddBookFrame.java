package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame implements ActionListener {

    ArrayListsManager alm = ArrayListsManager.instance;

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
    public AddBookFrame(){

        //Setting the text of the JLabel objects
        idLabel.setText("Enter Book ID : ");
        titleLabel.setText("Enter Book Title : ");
        authorLabel.setText("Enter Author Name : ");
        quantityLabel.setText("Enter Total Quantity : ");

        //setting bounds of the JLabel objects
        idLabel.setBounds(10,90,680,25);
        titleLabel.setBounds(10,150,680,25);
        authorLabel.setBounds(10,210,680,25);
        quantityLabel.setBounds(10,270,680,25);

        //defining font properties and background color of JLabel objects
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Inter",Font.BOLD,14));
        titleLabel.setForeground(Color.WHITE);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setForeground(Color.WHITE);
        quantityLabel.setFont(new Font("Inter",Font.BOLD,14));
        quantityLabel.setForeground(Color.WHITE);

        //defining the location of Text Fields
        idTextField.setBounds(10,120,670,30);
        titleTextField.setBounds(10,180,670,30);
        authorTextField.setBounds(10,240,670,30);
        quantityTextField.setBounds(10,300,670,30);

        //Defining the font and color properties of text fields
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(new Color(10,20,35));
        idTextField.setCaretColor(Color.BLACK);
        //================================================================
        titleTextField.setFont(new Font("Inter",Font.PLAIN,14));
        titleTextField.setForeground(Color.BLACK);
        titleTextField.setBackground(new Color(10,20,35));
        titleTextField.setCaretColor(Color.BLACK);
        //================================================================
        authorTextField.setFont(new Font("Inter",Font.PLAIN,14));
        authorTextField.setForeground(Color.BLACK);
        authorTextField.setBackground(new Color(10,20,35));
        authorTextField.setCaretColor(Color.BLACK);
        //================================================================
        quantityTextField.setFont(new Font("Inter",Font.PLAIN,14));
        quantityTextField.setForeground(Color.BLACK);
        quantityTextField.setBackground(new Color(10,20,35));
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

            Book book = new Book(id,title,author,quantity);
            alm.addBook(book);

            new CreateDialogBox("Success","Book Added Successfully");
        }
    }
}
