package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Book;
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

    ArrayList<Member> members;

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

        members = alm.getMembersList();

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

        if (e.getSource() == siBackButton){
            siFrame.dispose();
            new SearchMember();
        }

        if(e.getSource() == siSubmitButton){
            String id = siIdTextField.getText();
            boolean found = false;
            for (int i = 0; i < members.size();i++) {
                if (members.get(i).getId().equalsIgnoreCase(id)) {
                    Member foundMember = members.get(i);
                    JLabel foundMemberIdLabel = new JLabel("Id: " + foundMember.getId());
                    JLabel foundMemberNameLabel = new JLabel("Name: " + foundMember.getName());
                    JLabel foundMemberPhoneLabel = new JLabel("Phone: " + foundMember.getPhone());
                    JLabel foundMemberEmailLabel = new JLabel("Email: " + foundMember.getEmail());

                    foundMemberIdLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberNameLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberPhoneLabel.setFont(new Font("Inter",Font.PLAIN,15));
                    foundMemberEmailLabel.setFont(new Font("Inter",Font.PLAIN,15));

                    foundMemberIdLabel.setBounds(100,200,300,40);
                    foundMemberNameLabel.setBounds(100,230,300,40);
                    foundMemberPhoneLabel.setBounds(100,260,300,40);
                    foundMemberEmailLabel.setBounds(100,290,300,40);

                    siFrame.add(foundMemberIdLabel);
                    siFrame.add(foundMemberNameLabel);
                    siFrame.add(foundMemberPhoneLabel);
                    siFrame.add(foundMemberEmailLabel);

                    found = true;
                    break;
                }
            }
            if(!found){
                JLabel notFoundLabel = new JLabel("Member not found");
                notFoundLabel.setFont(new Font("Inter",Font.BOLD,25));
                notFoundLabel.setBounds(250,200,300,40);
                siFrame.add(notFoundLabel);
                siFrame.repaint();
                siFrame.revalidate();
            }
        }
    }
}
