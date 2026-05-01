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
        idLabel.setBounds(10,50,680,30);
        idLabel.setBackground(Color.LIGHT_GRAY);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.BLACK);

        nameLabel.setText("Enter your name: ");
        nameLabel.setBounds(10,120,680,30);
        nameLabel.setBackground(Color.LIGHT_GRAY);
        nameLabel.setFont(new Font("Inter",Font.BOLD,14));
        nameLabel.setForeground(Color.BLACK);

        phoneLabel.setText("Enter your phone Number: ");
        phoneLabel.setBounds(10,190,680,30);
        phoneLabel.setBackground(Color.LIGHT_GRAY);
        phoneLabel.setFont(new Font("Inter",Font.BOLD,14));
        phoneLabel.setForeground(Color.BLACK);

        emailLabel.setText("Enter your email: ");
        emailLabel.setBounds(10,260,680,30);
        emailLabel.setBackground(Color.LIGHT_GRAY);
        emailLabel.setFont(new Font("Inter",Font.BOLD,14));
        emailLabel.setForeground(Color.BLACK);

        idTextField.setBounds(10,80,670,30);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(Color.WHITE);
        idTextField.setCaretColor(Color.BLACK);

        nameTextField.setBounds(10,150,670,30);
        nameTextField.setFont(new Font("Inter",Font.PLAIN,14));
        nameTextField.setForeground(Color.BLACK);
        nameTextField.setBackground(Color.WHITE);
        nameTextField.setCaretColor(Color.BLACK);

        phoneTextField.setBounds(10,220,670,30);
        phoneTextField.setFont(new Font("Inter",Font.PLAIN,14));
        phoneTextField.setForeground(Color.BLACK);
        phoneTextField.setBackground(Color.WHITE);
        phoneTextField.setCaretColor(Color.BLACK);

        emailTextField.setBounds(10,290,670,30);
        emailTextField.setFont(new Font("Inter",Font.PLAIN,14));
        emailTextField.setForeground(Color.BLACK);
        emailTextField.setBackground(Color.WHITE);
        emailTextField.setCaretColor(Color.BLACK);

        rmSubmitButton.addActionListener(this);
        rmBackButton.addActionListener(this);

        rmFrame.add(idLabel);
        rmFrame.add(nameLabel);
        rmFrame.add(phoneLabel);
        rmFrame.add(emailLabel);

        rmFrame.add(idTextField);
        rmFrame.add(nameTextField);
        rmFrame.add(phoneTextField);
        rmFrame.add(emailTextField);

        rmFrame.add(rmSubmitButton);
        rmFrame.add(rmBackButton);
        rmFrame.add(rmExitButton);

        rmFrame.add(rmLabel);
        rmFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rmBackButton){
            rmFrame.dispose();
            new MemberHomeFrame();
        }
    }
}
