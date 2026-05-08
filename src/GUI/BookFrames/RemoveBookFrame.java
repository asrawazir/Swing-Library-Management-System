package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveBookFrame implements ActionListener {

    //Creating a frame from pre-defined CreateFrame class
    CreateFrame rbFrame = new CreateFrame();

    //Creating a main label
    CreateLabel label = new CreateLabel("Remove Book");

    //Creating a label and text field to receive book id
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();

    ArrayListsManager alm = ArrayListsManager.instance;
    ArrayList<Book> books = alm.getBooksList();

    //Creating exit button, back button and submit button using pre-defined classes
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Remove");

    public RemoveBookFrame(){

        //Defining the properties for idLabel
        idLabel.setText("Enter Book ID : ");
        idLabel.setBounds(10,150,680,25);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.WHITE);

        //Defining the properties for idTextField
        idTextField.setBounds(10,180,670,30);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(Color.WHITE);
        idTextField.setCaretColor(Color.BLACK);



        //Adding action listeners to the buttons
        backButton.addActionListener(this);
        submitButton.addActionListener(this);

        //Adding labels to the frame
        rbFrame.add(label);
        rbFrame.add(idLabel);

        //Adding text field to the frame
        rbFrame.add(idTextField);

        //Adding buttons to the frame
        rbFrame.add(submitButton);
        rbFrame.add(backButton);
        rbFrame.add(exitButton);

        //Making the frame visible
        rbFrame.setVisible(true);
    }

    //Overriding actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e){

        //Defining the action for back button
        if (e.getSource()==backButton){
            rbFrame.dispose();
            new BookHomeFrame();
        }
        //Defining the action for submit button
        if (e.getSource()==submitButton){
            String id = idTextField.getText();
            for (int i =0; i<books.size();i++){
                if (books.get(i).getID().equalsIgnoreCase(id)){
                    alm.removeBook(books.get(i));
                }
            }

            new CreateDialogBox("Success","Book Removed Successfully");
        }
    }
}