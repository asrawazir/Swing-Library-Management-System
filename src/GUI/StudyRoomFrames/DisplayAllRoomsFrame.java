package GUI.StudyRoomFrames;

import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        String[][] data = {
                {"101", "Available", "null"},
                {"102", "Available", "null"},
                {"103", "Available", "null"},
                {"104", "Available", "null"},
                {"105", "Available", "null"},
                {"106", "Available", "null"},
                {"107", "Available", "null"},
                {"108", "Available", "null"},

            data[i][0]= r.getRoomNumber();;
            data[i][1]=r.getIsReserved()?"Reserved":"Available";
            data[i][2]=r.getIsReserved()?r.getReservedByMemberID():"-";

        };

        JTable table = new JTable(data, column);
        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(100, 150, 500, 150);
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