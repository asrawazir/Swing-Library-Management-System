package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class IssueBook {
    CreateFrame ibFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issue a Book");
    public IssueBook(){

        ibFrame.add(label);
        ibFrame.setVisible(true);
    }
}
