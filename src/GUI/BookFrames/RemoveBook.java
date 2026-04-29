package GUI.BookFrames;

import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class RemoveBook {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Remove Book");
    CreateExitButton exitButton = new CreateExitButton();
    public RemoveBook(){

        rbFrame.add(exitButton);
        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
}
