package GUI.StudyRoomFrames;

import Code.ArrayListsManager;
import Code.StudyRoom;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayAllRoomsFrame implements ActionListener {
    CreateFrame frame;
    CreateLabel label;
    CreateBackButton backButton;

    CreateExitButton exitButton;
    ArrayListsManager aa=ArrayListsManager.instance;
    ArrayList<StudyRoom>roomList=aa.getRooms();

    public DisplayAllRoomsFrame() {
        frame = new CreateFrame();
        label = new CreateLabel("Display All Rooms");
        backButton = new CreateBackButton();
        exitButton = new CreateExitButton();

        backButton.addActionListener(this);
        exitButton.addActionListener(this);
        String[] column = {"Room Number","Status","Reserved By"};

        String[][] data = new String[roomList.size()][3];
        for(int i=0;i<roomList.size();i++){
            StudyRoom r=roomList.get(i);

            data[i][0]= r.getRoomNumber();;
            data[i][1]=r.getIsReserved()?"Reserved":"Available";
            data[i][2]=r.getIsReserved()?r.getReservedByMemberID():"-";
        }
        JTable table = new JTable(data, column);
        table.setBackground(new Color(15,22,40));
        table.setForeground(Color.white);
        table.setSelectionBackground(new Color(0,120,215));


        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(100, 100, 500, 170);
        frame.add(label);
        frame.add(backButton);
        frame.add(exitButton);

        frame.add(scrollPane);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton) {
            frame.dispose();
            new StudyRoomHomeFrame();
        }
    }
}