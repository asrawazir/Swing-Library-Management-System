package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class ReturnBook {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Return Book");
    public ReturnBook(){

        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
}
