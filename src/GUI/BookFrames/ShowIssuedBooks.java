package GUI.BookFrames;

import GUI.AdditionalClasses.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowIssuedBooks implements ActionListener {
    CreateFrame siFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issued Books");

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public ShowIssuedBooks(){

        backButton.addActionListener(this);

        siFrame.add(backButton);
        siFrame.add(exitButton);
        siFrame.add(label);
        siFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            siFrame.dispose();
            new BookHomeFrame();
        }
    }
}
