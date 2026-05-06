package GUI;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateSubmitButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame implements ActionListener {

    CreateFrame mFrame;
    JLabel mLabel;
    JLabel backgroundLabel;
    JPanel transparentPanel;
    CreateSubmitButton mSubmitButton;

    public MainFrame() {

        mFrame = new CreateFrame();
        mSubmitButton = new CreateSubmitButton("LOGIN");

        ImageIcon backgroundIcon = new ImageIcon("img3.jpg");
        Image scaledImage = backgroundIcon.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        backgroundLabel = new JLabel(new ImageIcon(scaledImage));
        backgroundLabel.setBounds(0, 0, 700, 500);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}