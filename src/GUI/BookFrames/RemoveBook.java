package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class RemoveBook {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Remove Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    public RemoveBook(){

        rbFrame.add(backButton);
        rbFrame.add(exitButton);
        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
}
