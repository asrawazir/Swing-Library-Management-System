package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByID implements ActionListener {
    CreateFrame sbiFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public SearchBookByID(){

        sbiFrame.add(backButton);
        sbiFrame.add(exitButton);
        sbiFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
