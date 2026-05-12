package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayAllMembers implements ActionListener {

    CreateFrame dmFrame;
    CreateLabel dmLabel;
    CreateBackButton dmBackButton;
    CreateExitButton dmExitButton;
    ArrayListsManager alm = ArrayListsManager.instance;

    JTable dmTable;
    JScrollPane dmScrollPane;

    public DisplayAllMembers(){
        dmFrame = new CreateFrame();
        dmLabel = new CreateLabel("Display Members");
        dmBackButton = new CreateBackButton();
        dmExitButton = new CreateExitButton();

        ArrayList<Member> members = alm.getMembersList();

        String [] headings = {"Member Id" , "Name" , "Phone" , " Email"};

        String [][] data = new String[members.size()][4];

        for(int i = 0; i < members.size(); i++){
            data[i][0] = members.get(i).getId();
            data[i][1] = members.get(i).getName();
            data[i][2] = members.get(i).getPhone();
            data[i][3] = members.get(i).getEmail();
        }

        dmTable = new JTable(data,headings);
        dmTable.setBackground(new Color(15,22,40));
        dmTable.setForeground(Color.WHITE);
        dmTable.setSelectionBackground(new Color(0,120,215));
        dmTable.setSelectionForeground(Color.white);
        dmTable.setGridColor(new Color(40,60,90));
        dmTable.setRowHeight(20);

        dmTable.getTableHeader().setBackground(new Color(10,15,35));
        dmTable.getTableHeader().setForeground(Color.CYAN);
        dmTable.getTableHeader().setFont(new Font("Inter",Font.BOLD,14));

        dmScrollPane = new JScrollPane(dmTable);
        dmScrollPane.setBounds(70,100,560,270);

        dmBackButton.addActionListener(this);

        dmFrame.add(dmLabel);
        dmFrame.add(dmScrollPane);
        dmFrame.add(dmBackButton);
        dmFrame.add(dmExitButton);

        dmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == dmBackButton){
            dmFrame.dispose();
            new MemberHomeFrame();
        }

    }
}
