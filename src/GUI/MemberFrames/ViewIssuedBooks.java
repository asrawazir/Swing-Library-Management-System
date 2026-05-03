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

    JLabel ibIdLabel;
    JTextField ibIdTextField;

    JTable ibBooksTable;
    DefaultTableModel ibTableModel;
    JScrollPane ibScrollPane;

    public ViewIssuedBooks(){

        ibFrame = new CreateFrame();
        ibLabel = new CreateLabel("Books Issued to Member");
        ibBackButton = new CreateBackButton();
        ibExitButton = new CreateExitButton();
        ibSubmitButton = new CreateSubmitButton("Search");

        ibIdLabel = new JLabel();
        ibIdTextField = new JTextField();

        ibScrollPane = new JScrollPane(ibBooksTable);

        ibIdLabel.setText("Enter Member ID: ");
        ibIdLabel.setBounds(10, 120, 680, 30);
        ibIdLabel.setFont(new Font("Inter", Font.BOLD, 14));

        ibIdTextField.setBounds(10, 160, 450, 30);
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
            String mId = ibIdTextField.getText();
            ibTableModel.setRowCount(0);

            boolean found = false;

            if (!found && !mId.isEmpty()) {
                JOptionPane.showMessageDialog(ibFrame, "No records found for this Member ID.");
            }
        }
    }
}
