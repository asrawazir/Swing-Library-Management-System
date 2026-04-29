package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;
import GUI.AdditionalClasses.FrameButtons;

import javax.swing.*;

public class BookHomeFrame {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Books Management System");
    FrameButtons button1 = new FrameButtons("Add Book",20,20);
    FrameButtons button2 = new FrameButtons("Remove Book",30,30);
    FrameButtons button3 = new FrameButtons("Search Book",40,40);
    FrameButtons button5 = new FrameButtons("Display Available Books",50,50);
    FrameButtons button6 = new FrameButtons("Issue Book",60,60);
    FrameButtons button7 = new FrameButtons("Return Book",70,70);
    FrameButtons button8 = new FrameButtons("Show Issued Books",80,80);

    public BookHomeFrame(){

        bhFrame.add(label);
        bhFrame.setVisible(true);
    }
}
