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
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}