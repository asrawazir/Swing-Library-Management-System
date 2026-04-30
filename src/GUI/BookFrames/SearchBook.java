package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class SearchBook {

    CreateFrame sbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Search Book");
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public SearchBook(){

        sbFrame.add(exitButton);
        sbFrame.add(backButton);
        sbFrame.add(label);
        sbFrame.setVisible(true);
    }
}
