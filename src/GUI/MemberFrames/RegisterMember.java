package GUI.MemberFrames;

import GUI.AdditionalClasses.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class RegisterMember implements ActionListener{

    CreateFrame rmFrame;
    CreateLabel rmLabel;
    CreateSubmitButton rmSubmitButton;
    CreateBackButton rmBackButton;
    CreateExitButton rmExitButton;

    JLabel idLabel;
    JLabel nameLabel;
    JLabel phoneLabel;
    JLabel emailLabel;


    public RegisterMember(){
        rmFrame = new CreateFrame();
        rmLabel = new CreateLabel("Register Member");
        rmSubmitButton = new CreateSubmitButton("Register");
        rmBackButton = new CreateBackButton();
        rmExitButton = new CreateExitButton();


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
