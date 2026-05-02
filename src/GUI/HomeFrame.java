package GUI;
import GUI.AdditionalClasses.*;
import GUI.BookFrames.BookHomeFrame;
import GUI.MemberFrames.MemberHomeFrame;
import GUI.StudyRoomFrames.StudyRoomHomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {
    CreateFrame frame;
    CreateLabel label;
    CreateExitButton exitButton;
    FrameButtons button1;
    FrameButtons button2;
    FrameButtons button3;

    public HomeFrame(){
        frame=new CreateFrame();
        label=new CreateLabel("Library Management System");
        exitButton=new CreateExitButton();
        button1=new FrameButtons(" Book Menu",70,150);
        button2=new FrameButtons(" Member Menu",260,150);
        button3=new FrameButtons(" Room Menu",455,150);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(exitButton);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button1){
            frame.dispose();
            new BookHomeFrame();
        }
        if(e.getSource()==button2){
            frame.dispose();
            new MemberHomeFrame();

        }
        if(e.getSource()==button3){
            frame.dispose();
            new StudyRoomHomeFrame();
        }
    }
}
