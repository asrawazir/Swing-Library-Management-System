package GUI.MemberFrames;

import Code.ArrayListsManager;
import Code.Member;
import GUI.AdditionalClasses.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class RegisterMember implements ActionListener{

    ArrayListsManager alm = ArrayListsManager.instance;

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

        idTextField = new JTextField();
        nameTextField = new JTextField();
        phoneTextField = new JTextField();
        emailTextField = new JTextField();

        idLabel.setText("Enter your id: ");
        idLabel.setBounds(10,80,680,25);
        idLabel.setBackground(new Color(10,20,35));
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.WHITE);

        nameLabel.setText("Enter your name: ");
        nameLabel.setBounds(10,140,680,25);
        nameLabel.setBackground(new Color(10,20,35));
        nameLabel.setFont(new Font("Inter",Font.BOLD,14));
        nameLabel.setForeground(Color.WHITE);

        phoneLabel.setText("Enter your phone Number: ");
        phoneLabel.setBounds(10,200,680,25);
        phoneLabel.setBackground(new Color(10,20,35));
        phoneLabel.setFont(new Font("Inter",Font.BOLD,14));
        phoneLabel.setForeground(Color.WHITE);

        emailLabel.setText("Enter your email: ");
        emailLabel.setBounds(10,260,680,25);
        emailLabel.setBackground(new Color(10,20,35));
        emailLabel.setFont(new Font("Inter",Font.BOLD,14));
        emailLabel.setForeground(Color.WHITE);

        idTextField.setBounds(10,110,670,25);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(new Color(10,20,35));
        idTextField.setCaretColor(Color.CYAN);

        nameTextField.setBounds(10,170,670,25);
        nameTextField.setFont(new Font("Inter",Font.PLAIN,14));
        nameTextField.setForeground(Color.WHITE);
        nameTextField.setBackground(new Color(10,20,35));
        nameTextField.setCaretColor(Color.CYAN);

        phoneTextField.setBounds(10,230,670,25);
        phoneTextField.setFont(new Font("Inter",Font.PLAIN,14));
        phoneTextField.setForeground(Color.WHITE);
        phoneTextField.setBackground(new Color(10,20,35));
        phoneTextField.setCaretColor(Color.CYAN);

        emailTextField.setBounds(10,290,670,25);
        emailTextField.setFont(new Font("Inter",Font.PLAIN,14));
        emailTextField.setForeground(Color.WHITE);
        emailTextField.setBackground(new Color(10,20,35));
        emailTextField.setCaretColor(Color.CYAN);

        rmSubmitButton.addActionListener(this);
        rmBackButton.addActionListener(this);

        rmFrame.add(rmLabel);
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

        rmFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rmBackButton){
            rmFrame.dispose();
            new MemberHomeFrame();
        }

        if (e.getSource()==rmSubmitButton){
            String id = idTextField.getText();
            String name = nameTextField.getText();
            String phone = phoneTextField.getText();
            String email = emailTextField.getText();

            String result = alm.registerNewMember(id, name, phone, email);

            if (result.equals("Member registered successfully")) {
                new CreateDialogBox("Success", result);

                idTextField.setText("");
                nameTextField.setText("");
                phoneTextField.setText("");
                emailTextField.setText("");
            } else {
                new CreateDialogBox("Registration Error", result);
            }
        }
    }
}
