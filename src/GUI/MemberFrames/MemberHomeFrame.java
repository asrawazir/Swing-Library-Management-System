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
    FrameButtons buttons5;
    CreateBackButton mhBackButton;
    CreateExitButton mhExitButton;

    public MemberHomeFrame(){

        mhFrame = new CreateFrame();
        mhLabel = new CreateLabel("Member Home Frame");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
