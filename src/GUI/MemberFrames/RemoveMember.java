package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

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
        rmSubmitButton = new CreateSubmitButton("Remove");
        rmBackButton = new CreateBackButton();
        rmExitButton = new CreateExitButton();

        rmIdLabel = new JLabel();
        rmIdTextField = new JTextField();

        rmIdLabel.setText("Enter Member ID : ");
        rmIdLabel.setBounds(10,120,680,30);
        rmIdLabel.setFont(new Font("Inter",Font.BOLD,14));
        rmIdLabel.setBackground(Color.LIGHT_GRAY);

        rmIdTextField.setBounds(10,160,670,30);
        rmIdTextField.setFont(new Font("Inter",Font.PLAIN,14));
        rmIdTextField.setForeground(Color.BLACK);
        rmIdTextField.setBackground(Color.WHITE);
        rmIdTextField.setCaretColor(Color.BLACK);

        rmFrame.add(rmLabel);
        rmFrame.add(rmSubmitButton);
        rmFrame.add(rmBackButton);
        rmFrame.add(rmExitButton);
        rmFrame.add(rmIdLabel);
        rmFrame.add(rmIdTextField);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
