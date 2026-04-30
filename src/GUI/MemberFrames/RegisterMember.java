package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import javax.script.ScriptEngine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMember implements ActionListener{

    CreateFrame rmFrame;
    CreateLabel rmLabel;
    CreateSubmitButton rmSubmitButton;
    CreateBackButton rmBackButton;
    CreateExitButton rmExitButton;

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
