package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayBooks implements ActionListener {
    CreateFrame dbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Display Books");
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public DisplayBooks(){

        dbFrame.add(backButton);
        dbFrame.add(exitButton);
        dbFrame.add(label);
        dbFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
