package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchMemberById implements ActionListener {

    ArrayListsManager alm = ArrayListsManager.instance;

    CreateFrame siFrame;
    CreateLabel siLabel;
    CreateSubmitButton siSubmitButton;
    CreateBackButton siBackButton;
    CreateExitButton siExitButton;
    JLabel siIdLabel;
    JTextField siIdTextField;

    ArrayList<Member> member;

    public SearchMemberById(){

        siFrame = new CreateFrame();
        siLabel = new CreateLabel("Search Member By ID");
        siSubmitButton = new CreateSubmitButton("Search");
        siBackButton = new CreateBackButton();
        siExitButton = new CreateExitButton();

        siIdLabel = new JLabel();
        siIdTextField = new JTextField();

        siIdLabel.setText("Enter Member ID : ");
        siIdLabel.setBounds(10,120,680,30);
        siIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        siIdLabel.setBackground(Color.LIGHT_GRAY);

        siIdTextField.setBounds(10,160,670,30);
        siIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        siIdTextField.setForeground(Color.BLACK);
        siIdTextField.setBackground(Color.WHITE);
        siIdTextField.setCaretColor(Color.BLACK);

        siBackButton.addActionListener(this);
        siFrame.add(siLabel);
        siFrame.add(siSubmitButton);
        siFrame.add(siBackButton);
        siFrame.add(siExitButton);

        siFrame.add(siIdLabel);
        siFrame.add(siIdTextField);

        siFrame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==siBackButton){
            siFrame.dispose();
            new SearchMember();
        }

    }
}
