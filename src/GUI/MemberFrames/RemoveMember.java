package GUI.MemberFrames;

import GUI.AdditionalClasses.*;
import GUI.BookFrames.BookHomeFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RemoveMember implements ActionListener {

    CreateFrame rmFrame;
    CreateLabel rmLabel;
    CreateBackButton rmBackButton;
    CreateExitButton rmExitButton;
    CreateSubmitButton rmSubmitButton;

    JLabel rmIdLabel;
    JTextField rmIdTextField;

    public RemoveMember(){

        rmFrame = new CreateFrame();
        rmLabel = new CreateLabel("Remove Member");
        rmSubmitButton = new CreateSubmitButton("Remove",300,230);
        rmBackButton = new CreateBackButton();
        rmExitButton = new CreateExitButton();

        rmIdLabel = new JLabel();
        rmIdTextField = new JTextField();

        rmIdLabel.setText("Enter Member ID : ");
        rmIdLabel.setBounds(10,120,680,25);
        rmIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        rmIdLabel.setBackground(new Color(10,20,35));
        rmIdLabel.setForeground(Color.WHITE);

        rmIdTextField.setBounds(10,155,670,25);
        rmIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        rmIdTextField.setForeground(Color.WHITE);
        rmIdTextField.setBackground(new Color(10,20,35));
        rmIdTextField.setCaretColor(Color.CYAN);

        rmBackButton.addActionListener(this);
        rmSubmitButton.addActionListener(this);

        rmFrame.add(rmLabel);
        rmFrame.add(rmSubmitButton);
        rmFrame.add(rmBackButton);
        rmFrame.add(rmExitButton);
        rmFrame.add(rmIdLabel);
        rmFrame.add(rmIdTextField);

        rmFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==rmBackButton){
            rmFrame.dispose();
            new MemberHomeFrame();
        }
        if (e.getSource()==rmSubmitButton){
            new CreateDialogBox("Success","Member Removed Successfully");
        }
    }
}
