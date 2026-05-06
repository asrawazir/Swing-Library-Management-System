package GUI;
//Importing custom GUI helper classes
import GUI.AdditionalClasses.*;
import GUI.BookFrames.BookHomeFrame;
import GUI.MemberFrames.MemberHomeFrame;
import GUI.StudyRoomFrames.StudyRoomHomeFrame;

//Importing swing and awt libraries for GUI components and event handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Main Home frame class that serves as a menu for lms
public class HomeFrame implements ActionListener {

    //Declaring frame and GUI components
    CreateFrame frame;
    CreateLabel label;
    CreateExitButton exitButton;
    CreateBackButton backButton;
    FrameButtons button1;
    FrameButtons button2;
    FrameButtons button3;

    //Constructor to initialize and design the Home Frame
    public HomeFrame(){

        //creating main application window
        frame=new CreateFrame();

        //creating title label
        label=new CreateLabel("Library Management System");

        backButton = new CreateBackButton();

        //creating exit button
        exitButton=new CreateExitButton();

        //creating navigation buttons with titles and labels
        button1=new FrameButtons(" Book Menu",70,150);
        button2=new FrameButtons(" Member Menu",260,150);
        button3=new FrameButtons(" Room Menu",455,150);

        //registering action listeners for buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        backButton.addActionListener(this);

        //adding components to frame
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(exitButton);

        //making the frame visible to user
        frame.setVisible(true);

    }
    //Overriding the action performed method for action listener interface
    @Override
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

        if(e.getSource() == backButton){
            frame.dispose();
            new MainFrame();
        }
    }
}
