package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByAuthor implements ActionListener {
    CreateFrame sbaFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public SearchBookByAuthor(){

        backButton.addActionListener(this);

        sbaFrame.add(backButton);
        sbaFrame.add(exitButton);
        sbaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbaFrame.dispose();
            new SearchBook();
        }
    }
}
