package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class SearchMemberByName implements ActionListener {
    ArrayListsManager alm = ArrayListsManager.instance;

    CreateFrame snFrame;
    CreateLabel snLabel;
    CreateSubmitButton snSubmitButton;
    CreateBackButton snBackButton;
    CreateExitButton snExitButton;
    JLabel snNameLabel;
    JTextField snNameTextField;

    ArrayList<Member> members;

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

        snNameTextField.setBounds(10,160,670,30);
        snNameTextField.setFont(new Font("Inter",Font.PLAIN,14));
        snNameTextField.setForeground(Color.BLACK);
        snNameTextField.setBackground(Color.WHITE);
        snNameTextField.setCaretColor(Color.BLACK);

        members = alm.getMembersList();

        snBackButton.addActionListener(this);

        snFrame.add(snLabel);
        snFrame.add(snSubmitButton);
        snFrame.add(snBackButton);
        snFrame.add(snExitButton);

        snFrame.add(snNameLabel);
        snFrame.add(snNameTextField);

        snFrame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == snBackButton){
            snFrame.dispose();
            new SearchMember();
        }

        if(e.getSource() == snSubmitButton){
            String name = snNameTextField.getText();
            boolean found = false;
            for (int i = 0; i < members.size();i++) {
                if (members.get(i).getName().equalsIgnoreCase(name)) {
                    Member foundMember = members.get(i);

                    JLabel foundMemberNameLabel = new JLabel("Name: " + foundMember.getName());
                    JLabel foundMemberIdLabel = new JLabel("Id: " + foundMember.getId());
                    JLabel foundMemberPhoneLabel = new JLabel("Phone: " + foundMember.getPhone());
                    JLabel foundMemberEmailLabel = new JLabel("Email: " + foundMember.getEmail());

                    foundMemberNameLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberIdLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberPhoneLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberEmailLabel.setFont(new Font("Inter",Font.PLAIN,15));

                    foundMemberNameLabel.setBounds(100,230,300,40);
                    foundMemberIdLabel.setBounds(100,200,300,40);
                    foundMemberPhoneLabel.setBounds(100,260,300,40);
                    foundMemberEmailLabel.setBounds(100,290,300,40);
        }
    }
}
