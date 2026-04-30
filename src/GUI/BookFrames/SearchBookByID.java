package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByID implements ActionListener {
    CreateFrame sbiFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label = new CreateLabel("Search Book by ID");

    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();

    public SearchBookByID(){

        idLabel.setText("Enter Book ID : ");
        idLabel.setBounds(10,120,680,30);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setBackground(Color.LIGHT_GRAY);

        backButton.addActionListener(this);

        sbiFrame.add(idLabel);
        sbiFrame.add(label);
        sbiFrame.add(backButton);
        sbiFrame.add(exitButton);
        sbiFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbiFrame.dispose();
            new SearchBook();
        }
    }
}
