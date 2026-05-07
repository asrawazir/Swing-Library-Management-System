package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

import javax.swing.*;
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

        backButton.addActionListener(this);

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
