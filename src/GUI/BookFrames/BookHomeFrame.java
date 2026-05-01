package GUI.BookFrames;

import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookHomeFrame implements ActionListener {
    CreateFrame bhFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Books Management System");

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    FrameButtons button1 = new FrameButtons("Add Book",60,100);
    FrameButtons button2 = new FrameButtons("Remove Book",260,100);
    FrameButtons button3 = new FrameButtons("Search Book",460,100);
    FrameButtons button4 = new FrameButtons("Display Books",60,200);
    FrameButtons button5 = new FrameButtons("Issue Book",260,200);
    FrameButtons button6 = new FrameButtons("Return Book",460,200);
    FrameButtons button7 = new FrameButtons("Show Issued Books",260,300);

    public BookHomeFrame(){

        bhFrame.add(backButton);
        bhFrame.add(exitButton);

        backButton.addActionListener(this);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

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

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            bhFrame.dispose();
            new HomeFrame();
        }
        if (e.getSource()==button1){
            bhFrame.dispose();
            new AddBook();
        }
        if (e.getSource()==button2){
            bhFrame.dispose();
            new RemoveBook();
        }

        if (e.getSource()==button3){
            bhFrame.dispose();
            new SearchBook();
        }

        if (e.getSource()==button4){
            bhFrame.dispose();;
            new DisplayBooks();
        }

        if (e.getSource()==button5){
            bhFrame.dispose();;
            new IssueBook();
        }

        if (e.getSource()==button6){
            bhFrame.dispose();
            new ReturnBook();
        }

        if (e.getSource()==button7){
            bhFrame.dispose();
            new ShowIssuedBooks();
        }
    }
}
