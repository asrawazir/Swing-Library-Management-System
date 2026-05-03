package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewIssuedBooks implements ActionListener {

    CreateFrame ibFrame;
    CreateLabel ibLabel;
    CreateBackButton ibBackButton;
    CreateExitButton ibExitButton;
    CreateSubmitButton ibSubmitButton;

    JLabel ibNameLabel;
    JTextField ibNameTextField;

    JTable ibBooksTable;
    DefaultTableModel ibBableModel;
    JScrollPane ibScrollPane;

    public ViewIssuedBooks(){

        ibFrame = new CreateFrame();
        ibLabel = new CreateLabel("Books Issued to Member");
        ibBackButton = new CreateBackButton();
        ibExitButton = new CreateExitButton();
        ibSubmitButton = new CreateSubmitButton("Search");

        ibNameLabel = new JLabel();
        ibNameTextField = new JTextField();

        ibNameLabel.setText("Enter Member ID: ");
        ibNameLabel.setBounds(10, 120, 680, 30);
        ibNameLabel.setFont(new Font("Inter", Font.BOLD, 14));

        ibNameTextField.setBounds(10, 160, 450, 30);
        ibNameTextField.setFont(new Font("Inter", Font.PLAIN, 14));

        String[] columns = {"Book ID", "Book Title", "Issue Date"};
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
