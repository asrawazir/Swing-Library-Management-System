package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;

public class AddBook {
    CreateFrame abFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Add a Book");

    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    JTextField idTextField = new JTextField();
    JTextField titleTextField = new JTextField();
    JTextField authorTextField = new JTextField();
    JTextField quantityTextField = new JTextField();

    public AddBook(){

        idLabel.setText("Enter Book ID : ");
        titleLabel.setText("Enter Book Title : ");
        authorLabel.setText("Enter Author Name : ");
        quantityLabel.setText("Enter Total Quantity : ");

        idLabel.setBounds(10,50,680,30);
        titleLabel.setBounds(10,120,680,30);
        authorLabel.setBounds(10,190,680,30);
        quantityLabel.setBounds(10,260,680,30);

        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setBackground(Color.LIGHT_GRAY);
        titleLabel.setFont(new Font("Inter",Font.BOLD,14));
        titleLabel.setBackground(Color.LIGHT_GRAY);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setBackground(Color.LIGHT_GRAY);
        quantityLabel.setFont(new Font("Inter",Font.BOLD,14));
        quantityLabel.setBackground(Color.LIGHT_GRAY);

        idTextField.setBounds(10,80,670,30);
        titleTextField.setBounds(10,150,670,30);
        authorTextField.setBounds(10,220,670,30);
        quantityTextField.setBounds(10,290,670,30);


        abFrame.add(idLabel);
        abFrame.add(titleLabel);
        abFrame.add(authorLabel);
        abFrame.add(quantityLabel);

        abFrame.add(label);
        abFrame.setVisible(true);
    }
}
