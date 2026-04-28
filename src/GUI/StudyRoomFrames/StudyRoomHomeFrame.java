package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudyRoomHomeFrame  {
       CreateFrame frame;
       CreateBackButton button;
       JButton button1=new JButton();
       JButton button2=new JButton();
       JButton button3=new JButton();
       JLabel l1=new JLabel("STUDY ROOM MANAGEMENT");

//default constructor
   public  StudyRoomHomeFrame(){
       frame =new CreateFrame();
       frame.setTitle("StudyRoomHomeFrame");
       button=new CreateBackButton();

        l1.setBounds(150,30,400,40);
        l1.setFont(new Font("Bookman Old Style",Font.BOLD,25));
        l1.setHorizontalAlignment(SwingConstants.CENTER);


        button1.setBounds(200,100,250,40);
        button2.setBounds(200,170,250,40);
        button3.setBounds(200,240,250,40);


        button1.setText("Display Rooms");
        button2.setText("Reserve Rooms");
        button3.setText("Cancel Reservation");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);




        frame.add(l1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button);



       frame.setVisible(true);

   }
       }
