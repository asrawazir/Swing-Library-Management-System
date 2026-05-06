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
        snSubmitButton = new CreateSubmitButton("Search",560, 110);
        snBackButton = new CreateBackButton();
        snExitButton = new CreateExitButton();

        snNameLabel = new JLabel();
        snNameTextField = new JTextField();

        snNameLabel.setText("Enter Member Name : ");
        snNameLabel.setBounds(10,80,530,30);
        snNameLabel.setFont(new Font("Inter",Font.BOLD,14));
        snNameLabel.setBackground(Color.LIGHT_GRAY);

        snNameTextField.setBounds(10,120,530,30);
        snNameTextField.setFont(new Font("Inter",Font.PLAIN,14));
        snNameTextField.setForeground(Color.BLACK);
        snNameTextField.setBackground(Color.WHITE);
        snNameTextField.setCaretColor(Color.BLACK);

        members = alm.getMembersList();

        snBackButton.addActionListener(this);
        snSubmitButton.addActionListener(this);

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

                    JPanel foundMemberPanel = new JPanel();
                    foundMemberPanel.setBackground(Color.white);
                    foundMemberPanel.setBounds(170,160, 350,170);
                    foundMemberPanel.setLayout(null);

                    JLabel foundMemberNameLabel = new JLabel("Name: " + foundMember.getName());
                    JLabel foundMemberIdLabel = new JLabel("Id: " + foundMember.getId());
                    JLabel foundMemberPhoneLabel = new JLabel("Phone: " + foundMember.getPhone());
                    JLabel foundMemberEmailLabel = new JLabel("Email: " + foundMember.getEmail());

                    foundMemberNameLabel.setFont(new Font("Inter",Font.BOLD,15));
                    foundMemberIdLabel.setFont(new Font("Inter",Font.BOLD,15));
                    foundMemberPhoneLabel.setFont(new Font("Inter",Font.BOLD,15));
                    foundMemberEmailLabel.setFont(new Font("Inter",Font.BOLD,15));

                    foundMemberIdLabel.setBounds(70, 20, 200, 30);
                    foundMemberNameLabel.setBounds(70, 50, 200, 30);
                    foundMemberPhoneLabel.setBounds(70, 80, 200, 30);
                    foundMemberEmailLabel.setBounds(70, 110, 200, 30);

                    foundMemberPanel.add(foundMemberNameLabel);
                    foundMemberPanel.add(foundMemberIdLabel);
                    foundMemberPanel.add(foundMemberPhoneLabel);
                    foundMemberPanel.add(foundMemberEmailLabel);

                    snFrame.add(foundMemberPanel);

                    found = true;
                    break;
                }
            }
            if(!found){
                JLabel notFoundLabel = new JLabel("Member not found");
                notFoundLabel.setFont(new Font("Inter",Font.BOLD,25));
                notFoundLabel.setBounds(250,200,300,40);
                snFrame.add(notFoundLabel);
                snFrame.repaint();
                snFrame.revalidate();
            }

            snFrame.revalidate();
            snFrame.repaint();
        }
    }
}
