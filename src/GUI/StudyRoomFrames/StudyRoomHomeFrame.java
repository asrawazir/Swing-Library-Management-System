package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.*;
import GUI.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudyRoomHomeFrame implements ActionListener  {
       CreateFrame frame;
       CreateBackButton button;
       FrameButtons button1;
       FrameButtons button2;
       FrameButtons button3;
       FrameButtons button4;
       CreateLabel label;
       CreateExitButton exitButton;

   public  StudyRoomHomeFrame(){
       frame =new CreateFrame();
       button=new CreateBackButton();
       label=new CreateLabel("StudyRoom Management ");
       exitButton=new CreateExitButton();


       button1=new FrameButtons("Display Rooms",100,150);
       button2=new FrameButtons("Reserve Room",300,150);
       button3=new FrameButtons("Cancel Reservation",100,220);
       button4=new FrameButtons("Check Reservation Status",300,220);

       button.addActionListener(this);
       exitButton.addActionListener(this);

       button1.setFocusable(false);
       button2.setFocusable(false);
       button3.setFocusable(false);
       button4.setFocusable(false);

       button1.addActionListener(this);
       button2.addActionListener(this);
       button3.addActionListener(this);
       button4.addActionListener(this);

        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button);
        frame.add(exitButton);

        frame.setVisible(true);

       }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            frame.dispose();
            new DisplayAllRoomsFrame();

        }
        if(e.getSource()==button2){
            frame.dispose();
            new ReserveRoomFrame();
        }
        if(e.getSource()==button3){
            frame.dispose();
            new CancelReservationFrame();
        }

        if(e.getSource()==button4){
            frame.dispose();
            new CheckReservationFrame();

        }
        if(e.getSource()==button){
            frame.dispose();
            new HomeFrame();
        }


   }
       }
