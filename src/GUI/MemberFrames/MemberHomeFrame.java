package GUI.MemberFrames;

import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    //default constructor
    public MemberHomeFrame(){

        mhFrame = new CreateFrame();
        mhLabel = new CreateLabel("Member Home Frame");

        button1 = new FrameButtons("Register Member",60,150);
        button2 = new FrameButtons("Search Member", 260,150);
        button3 = new FrameButtons("View Issued Books", 460,150);
        button4 = new FrameButtons("Remove Member", 160,250);
        button5 = new FrameButtons("Display All", 360,250);

        mhBackButton = new CreateBackButton();
        mhExitButton = new CreateExitButton();

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        mhBackButton.addActionListener(this);

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

        if(e.getSource() == mhBackButton){
            mhFrame.dispose();
            new HomeFrame();
        }

        if(e.getSource() == button1){
            mhFrame.dispose();
            new RegisterMember();
        }

        if(e.getSource() == button2){
            mhFrame.dispose();
            new SearchMember();
        }

        if(e.getSource() == button3) {
            mhFrame.dispose();
            new ViewIssuedBooks();
        }

        if(e.getSource() == button4){
            mhFrame.dispose();
            new RemoveMember();
        }

        if(e.getSource() == button5){
            mhFrame.dispose();
            new DisplayAllMembersFrame();
        }

    }
}
