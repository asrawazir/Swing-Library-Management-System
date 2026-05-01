package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import javax.swing.*;

public class MemberHomeFrame implements ActionListener {

    CreateFrame mhFrame;
    CreateLabel mhLabel;
    FrameButtons button1;
    FrameButtons button2;
    FrameButtons button3;
    FrameButtons button4;
    FrameButtons button5;
    CreateBackButton mhBackButton;
    CreateExitButton mhExitButton;

    public MemberHomeFrame(){

        mhFrame = new CreateFrame();
        mhLabel = new CreateLabel("Member Home Frame");

        button1 = new FrameButtons("Register Member",60,120);
        button2 = new FrameButtons("Search Member", 260,120);
        button3 = new FrameButtons("View Issued Books", 460,120);
        button4 = new FrameButtons("Remove Member", 160,220);
        button5 = new FrameButtons("Display All", 360,220);

        mhBackButton = new CreateBackButton();
        mhExitButton = new CreateExitButton();

        mhFrame.add(mhLabel);
        mhFrame.add(mhBackButton);
        mhFrame.add(mhExitButton);

        mhFrame.add(button1);
        mhFrame.add(button2);
        mhFrame.add(button3);
        mhFrame.add(button4);
        mhFrame.add(button5);

        mhFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button1){
            mhFrame.dispose();
            new RegisterMember();
        }

        if(e.getSource() == button2){
            mhFrame.dispose();
            new SeachMember();
        }

        if(e.getSource() == button3) {
            mhFrame.dispose();
            new ViewIssuedBooks();
        }
    }
}
