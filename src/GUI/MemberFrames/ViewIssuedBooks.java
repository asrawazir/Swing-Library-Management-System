package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Book;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewIssuedBooks implements ActionListener {

    ArrayListsManager alm = ArrayListsManager.instance;

    CreateFrame ibFrame;
    CreateLabel ibLabel;
    CreateBackButton ibBackButton;
    CreateExitButton ibExitButton;
    CreateSubmitButton ibSubmitButton;

    JLabel ibIdLabel;
    JTextField ibIdTextField;

    JTable ibBooksTable;
    DefaultTableModel ibTableModel;
    JScrollPane ibScrollPane;

    ArrayList<IssuedBook> issuedBooks;

    public ViewIssuedBooks(){

        ibFrame = new CreateFrame();
        ibLabel = new CreateLabel("Books Issued to Member");
        ibBackButton = new CreateBackButton();
        ibExitButton = new CreateExitButton();
        ibSubmitButton = new CreateSubmitButton("Search");
        ibSubmitButton.setBounds(470, 160, 210, 30);

        ibIdLabel = new JLabel();
        ibIdTextField = new JTextField();

        ibScrollPane = new JScrollPane(ibBooksTable);

        issuedBooks = alm.getIssuedBooksList();

        ibIdLabel.setText("Enter Member ID: ");
        ibIdLabel.setBounds(10,80,530,30);
        ibIdLabel.setFont(new Font("Inter", Font.BOLD, 14));

        ibIdTextField.setBounds(10,120,530,30);
        ibIdTextField.setFont(new Font("Inter", Font.PLAIN, 14));

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

        ibScrollPane.setBounds(10, 210, 670, 300);

        ibBackButton.addActionListener(this);

        ibFrame.add(ibLabel);
        ibFrame.add(ibSubmitButton);
        ibFrame.add(ibBackButton);
        ibFrame.add(ibExitButton);
        ibFrame.add(ibIdLabel);
        ibFrame.add(ibIdTextField);
        ibFrame.add(ibScrollPane);

        ibFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ibBackButton) {
            ibFrame.dispose();
            new MemberHomeFrame();
        }

        if(e.getSource() == ibSubmitButton){
            String searchId = ibIdTextField.getText().trim();

            if (searchId.isEmpty()) {
                new CreateDialogBox("Error", "Member ID required");
                return;
            }

            ibTableModel.setRowCount(0);
        }
    }
}
