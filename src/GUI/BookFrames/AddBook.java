package GUI.BookFrames;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;

public class AddBook {
    CreateFrame abFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Add a Book");

    JLabel idLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    JLabel authorLabel = new JLabel();
    JLabel quantityLabel = new JLabel();

    public AddBook(){

        abFrame.add(label);
        abFrame.setVisible(true);
    }
}
