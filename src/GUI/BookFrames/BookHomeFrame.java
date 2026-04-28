package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;

public class BookHomeFrame {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Add a Book");
    JButton button1 = new JButton("Add Book");
    JButton button2 = new JButton("Remove Book");
    JButton button3 = new JButton("Search Book by ID");
    JButton button4 = new JButton("Search Book by Author");
    JButton button5 = new JButton("Display Available Books");
    JButton button6 = new JButton("Issue Book");
    JButton button7 = new JButton("Return Book");
    JButton button8 = new JButton("Show Issued Books");

    public BookHomeFrame(){

        bhFrame.add(label);
        bhFrame.setVisible(true);
    }
}
