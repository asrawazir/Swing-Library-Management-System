package GUI.MemberFrames;

import GUI.AdditionalClasses.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class RegisterMember implements ActionListener{

    CreateFrame rmFrame;
    CreateLabel rmLabel;
    CreateSubmitButton rmSubmitButton;
    CreateBackButton rmBackButton;
    CreateExitButton rmExitButton;

    JLabel idLabel;
    JLabel nameLabel;
    JLabel phoneLabel;
    JLabel emailLabel;

    JTextField idTextField;
    JTextField nameTextField;
    JTextField phoneTextField;
    JTextField emailTextField;

    public RegisterMember(){
        rmFrame = new CreateFrame();
        rmLabel = new CreateLabel("Register Member");
        rmSubmitButton = new CreateSubmitButton("Register");
        rmBackButton = new CreateBackButton();
        rmExitButton = new CreateExitButton();

        idLabel = new JLabel();
        nameLabel = new JLabel();
        phoneLabel = new JLabel();
        emailLabel = new JLabel();

        idLabel.setText("Enter your id: ");
        idLabel.setBackground(Color.LIGHT_GRAY);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.BLACK);

        nameLabel.setText("Enter your id: ");
        nameLabel.setBackground(Color.LIGHT_GRAY);
        nameLabel.setFont(new Font("Inter",Font.BOLD,14));
        nameLabel.setForeground(Color.BLACK);

        phoneLabel.setText("Enter your id: ");
        phoneLabel.setBackground(Color.LIGHT_GRAY);
        phoneLabel.setFont(new Font("Inter",Font.BOLD,14));
        phoneLabel.setForeground(Color.BLACK);

        emailLabel.setText("Enter your id: ");
        emailLabel.setBackground(Color.LIGHT_GRAY);
        emailLabel.setFont(new Font("Inter",Font.BOLD,14));
        emailLabel.setForeground(Color.BLACK);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
