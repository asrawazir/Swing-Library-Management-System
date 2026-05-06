package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.IssuedBook;
import GUI.AdditionalClasses.*;

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
