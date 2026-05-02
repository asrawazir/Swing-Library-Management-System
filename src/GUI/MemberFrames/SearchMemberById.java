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

        siIdLabel = new JLabel("Enter Member ID to search: ");
        siIdTextField = new JTextField();

        siFrame.add(siLabel);
        siFrame.add(siSubmitButton);
        siFrame.add(siBackButton);
        siFrame.add(siExitButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
