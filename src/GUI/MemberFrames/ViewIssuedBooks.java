package GUI.MemberFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewIssuedBooks implements ActionListener {

    CreateFrame ibFrame;
    CreateLabel ibLabel;
    CreateBackButton ibBackButton;
    CreateExitButton ibExitButton;

    JLabel ibNameLabel;
    JTextField ibNameTextField;

    JTable ibBooksTable;
    DefaultTableModel ibBableModel;
    JScrollPane ibScrollPane;
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
