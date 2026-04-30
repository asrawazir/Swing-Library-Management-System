package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class DisplayBooks {
    CreateFrame dbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Display Books");

    public DisplayBooks(){

        dbFrame.add(label);
        dbFrame.setVisible(true);
    }
}
