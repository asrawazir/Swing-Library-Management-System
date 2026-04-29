package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveBook implements ActionListener {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Remove Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();

    public RemoveBook(){

        backButton.addActionListener(this);

        rbFrame.add(backButton);
        rbFrame.add(exitButton);
        rbFrame.add(label);
        rbFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            rbFrame.dispose();
            new BookHomeFrame();
        }
    }
}
