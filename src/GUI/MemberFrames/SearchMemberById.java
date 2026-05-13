package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
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

    JTable table = null;
    JLabel notFoundLabel = null;
    JTableHeader tableHeader = null;

    ArrayList<Member> members;

    public SearchMemberById(){

        siFrame = new CreateFrame();
        siLabel = new CreateLabel("Search Member By ID");
        siSubmitButton = new CreateSubmitButton("Search" ,560, 120);
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
            if (table != null) {
                siFrame.remove(table);
                siFrame.remove(tableHeader);
                table = null;
                tableHeader = null;
            }

            String id = siIdTextField.getText();
            Member foundMember = null;

            for(int i = 0; i < members.size(); i++){
                if(members.get(i).getId().equalsIgnoreCase(id)){
                    foundMember = members.get(i);
                    break;
                }
            }
            if (foundMember == null) {
                JLabel notFoundLabel = new JLabel("Member not found");
                notFoundLabel.setFont(new Font("Inter", Font.BOLD, 25));
                notFoundLabel.setForeground(Color.WHITE);
                notFoundLabel.setBounds(230, 200, 300, 40);
                siFrame.add(notFoundLabel);
            }

            else {
                String[] headers = {"  Field", "Member Details"};
                String[][] data = {
                        {"  ID", foundMember.getId()},
                        {"  Name", foundMember.getName()},
                        {"  Phone", foundMember.getPhone()},
                        {"  Email", foundMember.getEmail()}
                };

                JTable table = new JTable(data, headers);
                table.setBackground(new Color(10, 20, 35));
                table.setForeground(Color.white);
                table.setRowHeight(25);
                table.setGridColor(Color.GRAY);

                table.setBounds(120, 210, 460, 100);

                table.getTableHeader().setBounds(120, 190, 460, 20);
                table.getTableHeader().setBackground(new Color(20, 40, 60));
                table.getTableHeader().setForeground(Color.WHITE);

                siFrame.add(table.getTableHeader());
                siFrame.add(table);
            }
            siFrame.revalidate();
            siFrame.repaint();

        }
    }
}
