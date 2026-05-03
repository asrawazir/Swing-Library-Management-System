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
    DefaultTableModel ibTableModel;
    JScrollPane ibScrollPane;

    public ViewIssuedBooks(){

        ibFrame = new CreateFrame();
        ibLabel = new CreateLabel("Books Issued to Member");
        ibBackButton = new CreateBackButton();
        ibExitButton = new CreateExitButton();
        ibSubmitButton = new CreateSubmitButton("Search");

        ibNameLabel = new JLabel();
        ibNameTextField = new JTextField();

        ibScrollPane = new JScrollPane(ibBooksTable);

        ibNameLabel.setText("Enter Member ID: ");
        ibNameLabel.setBounds(10, 120, 680, 30);
        ibNameLabel.setFont(new Font("Inter", Font.BOLD, 14));

        ibNameTextField.setBounds(10, 160, 450, 30);
        ibNameTextField.setFont(new Font("Inter", Font.PLAIN, 14));

        String[] columns = {"Book ID", "Book Title", "Issue Date"};

        ibTableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ibBooksTable = new JTable(ibTableModel);
        ibBooksTable.getTableHeader().setFont(new Font("Inter", Font.BOLD, 13));
        ibBooksTable.setFont(new Font("Inter", Font.PLAIN, 13));
        ibBooksTable.setRowHeight(25);

        scrollPane.setBounds(10, 210, 670, 300);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
