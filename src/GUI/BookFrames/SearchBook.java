package GUI.BookFrames;

import GUI.AdditionalClasses.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBook implements ActionListener {

    CreateFrame sbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Search Book");
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    FrameButtons button1 = new FrameButtons("Search by ID",120,150);
    FrameButtons button2 = new FrameButtons("Search by Author",380,150);

    public SearchBook(){

        button1.addActionListener(this);
        button2.addActionListener(this);

        backButton.addActionListener(this);

        sbFrame.add(button1);
        sbFrame.add(button2);
        sbFrame.add(exitButton);
        sbFrame.add(backButton);
        sbFrame.add(label);
        sbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbFrame.dispose();
            new BookHomeFrame();
        }

        if (e.getSource()==button1){
            sbFrame.dispose();
            new SearchBookByID();
        }

        if (e.getSource()==button2){
            sbFrame.dispose();
            new SearchBookByAuthor();
        }
    }
}
