package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class RemoveBook {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Remove Book");
    public RemoveBook(){

        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
}
