package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;

public class SearchBookByID {
    CreateFrame sbiFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public SearchBookByID(){

        sbiFrame.add(backButton);
        sbiFrame.add(exitButton);
        sbiFrame.setVisible(true);
    }
}
