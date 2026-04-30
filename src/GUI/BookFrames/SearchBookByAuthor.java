package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByAuthor implements ActionListener {
    CreateFrame sbaFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    JLabel authorLabel = new JLabel();
    JTextField authorTextField = new JTextField();

    public SearchBookByAuthor(){

        authorLabel.setText("Enter Author Name : ");
        authorLabel.setBounds(10,120,680,30);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setBackground(Color.LIGHT_GRAY);
        
        backButton.addActionListener(this);

        sbaFrame.add(authorLabel);
        sbaFrame.add(backButton);
        sbaFrame.add(exitButton);
        sbaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbaFrame.dispose();
            new SearchBook();
        }
    }
}
