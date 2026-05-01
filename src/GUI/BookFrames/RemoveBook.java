package GUI.BookFrames;

import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveBook implements ActionListener {
    CreateFrame rbFrame = new CreateFrame();
    CreateLabel label = new CreateLabel("Remove Book");
    CreateExitButton exitButton = new CreateExitButton();
    CreateBackButton backButton = new CreateBackButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Remove");

    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();

    public RemoveBook(){

        idLabel.setText("Enter Book ID : ");
        idLabel.setBounds(10,120,680,30);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setBackground(Color.LIGHT_GRAY);

        idTextField.setBounds(10,160,670,30);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(Color.WHITE);
        idTextField.setCaretColor(Color.BLACK);

        backButton.addActionListener(this);
        submitButton.addActionListener(this);

        rbFrame.add(submitButton);
        rbFrame.add(idLabel);
        rbFrame.add(idTextField);
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
