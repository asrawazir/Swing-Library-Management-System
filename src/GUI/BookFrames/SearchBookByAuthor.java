package GUI.BookFrames;

import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookByAuthor implements ActionListener {
    CreateFrame sbaFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    CreateLabel label = new CreateLabel("Search Book by Author Name");
    JLabel authorLabel = new JLabel();
    JTextField authorTextField = new JTextField();

    public SearchBookByAuthor(){

        authorLabel.setText("Enter Author Name : ");
        authorLabel.setBounds(10,120,680,30);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setBackground(Color.LIGHT_GRAY);

        authorTextField.setBounds(10,160,670,30);
        authorTextField.setFont(new Font("Inter",Font.PLAIN,14));
        authorTextField.setForeground(Color.BLACK);
        authorTextField.setBackground(Color.WHITE);
        authorTextField.setCaretColor(Color.BLACK);

        backButton.addActionListener(this);

        sbaFrame.add(label);
        sbaFrame.add(authorTextField);
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
