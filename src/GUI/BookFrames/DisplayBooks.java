package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class DisplayBooks {
    CreateFrame dbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Display Books");
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public DisplayBooks(){

        dbFrame.add(backButton);
        dbFrame.add(exitButton);
        dbFrame.add(label);
        dbFrame.setVisible(true);
    }
}
