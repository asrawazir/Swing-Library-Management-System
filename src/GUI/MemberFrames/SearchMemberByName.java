package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SearchMemberByName implements ActionListener {
    CreateFrame snFrame;
    CreateLabel snLabel;
    CreateSubmitButton snSubmitButton;
    CreateBackButton snBackButton;
    CreateExitButton snExitButton;
    JLabel snIdLabel;
    JTextField snIdTextField;

    public SearchMemberByName(){

        snFrame = new CreateFrame();
        snLabel = new CreateLabel("Search Member By Name");
        snSubmitButton = new CreateSubmitButton("Search");
        snBackButton = new CreateBackButton();
        snExitButton = new CreateExitButton();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
