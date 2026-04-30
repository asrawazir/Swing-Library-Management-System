package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;

public class IssueBook {
    CreateFrame ibFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issue a Book");

    JLabel memberIdLabel = new JLabel();
    JLabel bookIdLabel = new JLabel();

    JTextField memberIdTextField = new JTextField();
    JTextField bookIdTextField = new JTextField();

    public IssueBook(){

        ibFrame.add(label);
        ibFrame.setVisible(true);
    }
}
