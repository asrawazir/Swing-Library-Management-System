package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.JTableHeader;

public class SearchMemberByName implements ActionListener {
    ArrayListsManager alm = ArrayListsManager.instance;

    CreateFrame snFrame;
    CreateLabel snLabel;
    CreateSubmitButton snSubmitButton;
    CreateBackButton snBackButton;
    CreateExitButton snExitButton;
    JLabel snNameLabel;
    JTextField snNameTextField;

    JTable table = null;
    JLabel notFoundLabel = null;
    JTableHeader tableHeader = null;

    ArrayList<Member> members;

    public SearchMemberByName(){

        snFrame = new CreateFrame();
        snLabel = new CreateLabel("Search Member By Name");
        snSubmitButton = new CreateSubmitButton("Search",560, 120);
        snBackButton = new CreateBackButton();
        snExitButton = new CreateExitButton();

        snNameLabel = new JLabel();
        snNameTextField = new JTextField();

        snNameLabel.setText("Enter Member Name : ");
        snNameLabel.setBounds(10,90,530,30);
        snNameLabel.setFont(new Font("Inter",Font.BOLD,14));
        snNameLabel.setBackground(new Color(10,20,35));
        snNameLabel.setForeground(Color.WHITE);

        snNameTextField.setBounds(10,130,530,30);
        snNameTextField.setFont(new Font("Inter",Font.PLAIN,14));
        snNameTextField.setForeground(Color.WHITE);
        snNameTextField.setBackground(new Color(10,20,35));
        snNameTextField.setCaretColor(Color.CYAN);

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
            if (table != null) {
                snFrame.remove(table);
                snFrame.remove(tableHeader);
                table = null;
                tableHeader = null;
            }

            if (notFoundLabel != null) {
                snFrame.remove(notFoundLabel);
                notFoundLabel = null;
            }

            String name = snNameTextField.getText();
            Member foundMember = null;


            for (int i = 0; i < members.size(); i++) {
                if (members.get(i).getName().equalsIgnoreCase(name)) {
                    foundMember = members.get(i);
                    break;
                }
            }

            if (foundMember == null) {
                notFoundLabel = new JLabel("Member not found");
                notFoundLabel.setFont(new Font("Inter", Font.BOLD, 25));
                notFoundLabel.setForeground(Color.WHITE);
                notFoundLabel.setBounds(230, 200, 300, 40);
                snFrame.add(notFoundLabel);
            }

            else {
                String[] headers = {"  Field", "Member Details"};
                String[][] data = {
                        {"  Name", foundMember.getName()},
                        {"  ID", foundMember.getId()},
                        {"  Phone", foundMember.getPhone()},
                        {"  Email", foundMember.getEmail()}
                };

                table = new JTable(data, headers);
                table.setBackground(new Color(10, 20, 35));
                table.setForeground(Color.white);
                table.setRowHeight(25);
                table.setGridColor(Color.GRAY);

                table.setBounds(120, 210, 460, 100);

                tableHeader = table.getTableHeader();
                tableHeader.setBounds(120, 190, 460, 20);
                tableHeader.setBackground(new Color(20, 40, 60));
                tableHeader.setForeground(Color.WHITE);

                snFrame.add(tableHeader);
                snFrame.add(table);
            }
            snFrame.revalidate();
            snFrame.repaint();
        }
    }
}