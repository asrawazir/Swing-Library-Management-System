package GUI.MemberFrames;

import Code.ArrayListsManager;
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

    public ViewIssuedBooks() {

        ibFrame = new CreateFrame();
        ibLabel = new CreateLabel("Books Issued to Member");
        ibBackButton = new CreateBackButton();
        ibExitButton = new CreateExitButton();
        ibSubmitButton = new CreateSubmitButton("Search",560,110);

        ibIdLabel = new JLabel();
        ibIdTextField = new JTextField();

        ibIdLabel.setText("Enter Member ID: ");
        ibIdLabel.setBounds(10, 80, 530, 30);
        ibIdLabel.setFont(new Font("Inter", Font.BOLD, 14));
        ibIdLabel.setBackground(new Color(10,20,35));
        ibIdLabel.setForeground(Color.WHITE);

        ibIdTextField.setBounds(10, 120, 530, 30);
        ibIdTextField.setFont(new Font("Inter", Font.PLAIN, 14));
        ibIdTextField.setForeground(Color.WHITE);
        ibIdTextField.setBackground(new Color(10,20,35));
        ibIdTextField.setCaretColor(Color.CYAN);

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

        ibScrollPane = new JScrollPane(ibBooksTable);
        ibScrollPane.setBounds(10, 210, 670, 300);
        ibScrollPane.getViewport().setBackground(Color.WHITE);

        ibBackButton.addActionListener(this);

        ibSubmitButton.addActionListener(this);

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

        if (e.getSource() == ibSubmitButton) {
            String searchId = ibIdTextField.getText().trim();

            if (searchId.isEmpty()) {
                new CreateDialogBox("Error", "Please enter a Member ID.");
                return;
            }

            ibTableModel.setRowCount(0);

            ArrayList<IssuedBook> issuedBooksList = alm.viewBooksByMemberId(searchId);

            if (issuedBooksList.isEmpty()) {
                new CreateDialogBox("No Results", "No books found for Member ID: " + searchId);
            } else {
                for (IssuedBook ib : issuedBooksList) {
                    Object[] rowData = {
                            ib.getBook().getID(),
                            ib.getBook().getTitle(),
                            ib.getDate()
                    };
                    ibTableModel.addRow(rowData);
                }
            }
        }
    }
}
