package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

public class ShowIssuedBooks {
    CreateFrame siFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Issued Books");
    public ShowIssuedBooks(){

        siFrame.add(label);
        siFrame.setVisible(true);
    }
}
