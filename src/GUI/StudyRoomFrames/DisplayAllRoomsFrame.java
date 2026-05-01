package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DisplayAllRoomsFrame  {
    CreateFrame frame;
    CreateLabel label;
    CreateBackButton backButton;

    CreateExitButton exitButton;

   public  DisplayAllRoomsFrame(){
       frame=new CreateFrame();
       label=new CreateLabel("Display All Rooms");
       backButton=new CreateBackButton();
      exitButton=new CreateExitButton();

      String[] column={"Room Number","Status","Reserved By"};

      String [][]data={
              {"101","Available","null"},
              {"102","Available","null"},
              {"103","Available","null"},
              {"104","Available","null"}
      };

      JTable table=new JTable(data,column);
      JScrollPane scrollPane=new JScrollPane(table);

      scrollPane.setBounds(100,150,500,90);
      frame.add(label);
      frame.add(backButton);
      frame.add(exitButton);

      frame.add(scrollPane);

      frame.setVisible(true);




    }
}
