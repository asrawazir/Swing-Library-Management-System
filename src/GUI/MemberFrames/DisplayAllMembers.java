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
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
