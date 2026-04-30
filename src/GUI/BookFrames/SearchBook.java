package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class SearchBook {

    CreateFrame sbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Search Book");
    public SearchBook(){

        sbFrame.add(label);
        sbFrame.setVisible(true);
    }
}
