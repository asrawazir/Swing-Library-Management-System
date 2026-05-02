package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayBooks implements ActionListener {

    //Creating a basic frame
    CreateFrame dbFrame = new CreateFrame();

    //Defining the main label
    CreateLabel label = new CreateLabel("Display Books");

    //Creating buttons using pre-defined button classes
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    //Default Constructor
    public DisplayBooks(){

        //Adding action listener method to back button
        backButton.addActionListener(this);

        //Adding main label to the frame
        dbFrame.add(label);

        //Adding buttons to the frame
        dbFrame.add(backButton);
        dbFrame.add(exitButton);

        //Setting the visibility of frame to true
        dbFrame.setVisible(true);
    }

    //Overriding actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e){

        //Processing the action received by backButton
        if (e.getSource()==backButton){
            dbFrame.dispose();
            new BookHomeFrame();
        }
    }
}
