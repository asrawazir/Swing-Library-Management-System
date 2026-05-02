package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMemberById implements ActionListener {

    CreateFrame siFrame;
    CreateLabel siLabel;
    CreateSubmitButton siSubmitButton;
    CreateBackButton siBackButton;
    CreateExitButton siExitButton;
    JLabel siIdLabel;
    JTextField siIdTextField;

    public SearchMemberById(){

        siFrame = new CreateFrame();
        siLabel = new CreateLabel("Search Member By ID");
        siSubmitButton = new CreateSubmitButton("Search");
        siBackButton = new CreateBackButton();
        siExitButton = new CreateExitButton();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
