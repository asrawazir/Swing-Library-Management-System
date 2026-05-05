package GUI.MemberFrames;

import Code.ArrayListsManager;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class DisplayAllMembers implements ActionListener {

    CreateFrame dmFrame;
    CreateLabel dmLabel;
    CreateBackButton dmBackButton;
    CreateExitButton dmExitButton;
    ArrayListsManager alm = ArrayListsManager.instance;

    public DisplayAllMembers(){
        dmFrame = new CreateFrame();
        dmLabel = new CreateLabel("Display Members");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
