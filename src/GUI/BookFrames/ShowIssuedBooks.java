package GUI.BookFrames;

import GUI.AdditionalClasses.*;

public class ShowIssuedBooks {
    CreateFrame siFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issued Books");

    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    public ShowIssuedBooks(){

        siFrame.add(backButton);
        siFrame.add(exitButton);
        siFrame.add(label);
        siFrame.setVisible(true);
    }
}
