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

    ArrayList<Member> members;

    public SearchMemberById(){

        siFrame = new CreateFrame();
        siLabel = new CreateLabel("Search Member By ID");
        siSubmitButton = new CreateSubmitButton("Search" ,560, 110);
        siBackButton = new CreateBackButton();
        siExitButton = new CreateExitButton();

        siIdLabel = new JLabel();
        siIdTextField = new JTextField();

        siIdLabel.setText("Enter Member ID : ");
        siIdLabel.setBounds(10,90,530,30);
        siIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        siIdLabel.setBackground(new Color(10,20,35));
        siIdLabel.setForeground(Color.WHITE);

        siIdTextField.setBounds(10,130,530,30);
        siIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        siIdTextField.setForeground(Color.WHITE);
        siIdTextField.setBackground(new Color(10,20,35));
        siIdTextField.setCaretColor(Color.CYAN);

        members = alm.getMembersList();

        siBackButton.addActionListener(this);
        siSubmitButton.addActionListener(this);

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
            ArrayList<Member> foundMembers = new ArrayList<>();

            for(int i = 0; i <members.size(); i++){
                if(members.get(i).getId().equalsIgnoreCase(id)){
                    foundMembers.add(members.get(i));
                }
            }
            if (foundMembers.isEmpty()) {
                JLabel notFoundLabel = new JLabel("Member not found");
                notFoundLabel.setFont(new Font("Inter", Font.BOLD, 25));
                notFoundLabel.setBounds(230, 200, 300, 40);
                siFrame.add(notFoundLabel);
            }

            else {
                String[] headers = {"ID", "Name", "Phone", "Email"};
                String[][] data = new String[foundMembers.size()][4];

                for (int i = 0; i < foundMembers.size(); i++) {
                    data[i][0] = foundMembers.get(i).getId();
                    data[i][1] = foundMembers.get(i).getName();
                    data[i][2] = foundMembers.get(i).getPhone();
                    data[i][3] = foundMembers.get(i).getEmail();
                }

                JTable table = new JTable(data, headers);
                table.setBackground(new Color(10, 20, 35));
                table.setForeground(Color.white);
            }

        }
    }
}
