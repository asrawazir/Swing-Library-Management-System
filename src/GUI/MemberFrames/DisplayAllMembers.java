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


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
