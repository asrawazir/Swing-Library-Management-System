package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;

public class BookHomeFrame {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Add a Book");
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();

    public BookHomeFrame(){

        bhFrame.add(label);
        bhFrame.setVisible(true);
    }
}
