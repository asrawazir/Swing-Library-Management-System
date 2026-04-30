package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;

public class SearchBookByAuthor {
    CreateFrame sbaFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public SearchBookByAuthor(){

        sbaFrame.add(backButton);
        sbaFrame.add(exitButton);
        sbaFrame.setVisible(true);
    }
}
