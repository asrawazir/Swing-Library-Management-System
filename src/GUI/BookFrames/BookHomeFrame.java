package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class BookHomeFrame {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Add a Book");

    public BookHomeFrame(){

        bhFrame.add(label);
        bhFrame.setVisible(true);
    }
}
