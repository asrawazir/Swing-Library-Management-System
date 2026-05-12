package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShowIssuedBooksFrame implements ActionListener {
    CreateFrame siFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issued Books");

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    ArrayListsManager alm = ArrayListsManager.instance;

    public ShowIssuedBooksFrame(){

        ArrayList<IssuedBook> issuedBooks = alm.getIssuedBooksList();

        String[] headers = {"Member Id","Book Id","Book Title","Issue Date"};
        String[][] data = new String[issuedBooks.size()][4];

        for (int i = 0; i < issuedBooks.size(); i++){
            data[i][0] = issuedBooks.get(i).getMember().getId();
            data[i][1] = issuedBooks.get(i).getBook().getID();
            data[i][2] = issuedBooks.get(i).getBook().getTitle();
            data[i][3] = issuedBooks.get(i).getDate();
        }

        JTable table = new JTable(data,headers);
        table.setBackground(new Color(10,20,35));
        table.setForeground(Color.white);
        table.setSelectionBackground(new Color(0,120,215));
        table.setSelectionForeground(Color.white);
        table.setGridColor(new Color(40,60,90));
        table.setRowHeight(20);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(210);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getTableHeader().setBackground(new Color(10,15,35));
        table.getTableHeader().setForeground(Color.CYAN);
        table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70,120,560,250);

        backButton.addActionListener(this);

        siFrame.add(scrollPane);
        siFrame.add(backButton);
        siFrame.add(exitButton);
        siFrame.add(label);
        siFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            siFrame.dispose();
            new BookHomeFrame();
        }
    }
}
