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

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
