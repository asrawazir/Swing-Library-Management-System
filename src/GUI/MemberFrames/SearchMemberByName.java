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
    JLabel snNameLabel;
    JTextField snNameTextField;

    public SearchMemberByName(){

        snFrame = new CreateFrame();
        snLabel = new CreateLabel("Search Member By Name");
        snSubmitButton = new CreateSubmitButton("Search");
        snBackButton = new CreateBackButton();
        snExitButton = new CreateExitButton();

        snNameLabel = new JLabel();
        snNameTextField = new JTextField();

        snNameLabel.setText("Enter Member Name : ");
        snNameLabel.setBounds(10,120,680,30);
        snNameLabel.setFont(new Font("Inter",Font.BOLD,14));
        snNameLabel.setBackground(Color.LIGHT_GRAY);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
