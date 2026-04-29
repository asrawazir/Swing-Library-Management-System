package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.FrameButtons;

import javax.swing.*;

public class BookHomeFrame {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Books Management System");
    FrameButtons button1 = new FrameButtons("Add Book",60,100);
    FrameButtons button2 = new FrameButtons("Remove Book",260,100);
    FrameButtons button3 = new FrameButtons("Search Book",460,100);
    FrameButtons button4 = new FrameButtons("Display Books",60,200);
    FrameButtons button5 = new FrameButtons("Issue Book",260,200);
    FrameButtons button6 = new FrameButtons("Return Book",460,200);
    FrameButtons button7 = new FrameButtons("Show Issued Books",260,300);

    public BookHomeFrame(){

        bhFrame.add(button1);
        bhFrame.add(button2);
        bhFrame.add(button3);
        bhFrame.add(button4);
        bhFrame.add(button5);
        bhFrame.add(button6);
        bhFrame.add(button7);
        bhFrame.add(label);
        bhFrame.setVisible(true);
    }
}
