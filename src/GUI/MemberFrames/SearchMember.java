package GUI.MemberFrames;

import GUI.AdditionalClasses.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMember implements ActionListener {

    CreateFrame smFrame;
    CreateLabel smLabel;
    CreateBackButton smBackButton;
    CreateExitButton smExitButton;
    FrameButtons button1;
    FrameButtons button2;

    public SearchMember(){
        smFrame = new CreateFrame();
        smLabel = new CreateLabel("Search Member");

        smBackButton = new CreateBackButton();
        smExitButton = new CreateExitButton();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
