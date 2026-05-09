package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateDialogBox extends JOptionPane {

    public CreateDialogBox( String title, String text){
     setTitle(title);
     setSize(300,150);
     setLocationRelativeTo(null);
     setModal(true);
     setLayout(null);

     getContentPane().setBackground(new Color(20,26,46));
     setUndecorated(true);
     JPanel topPanel=new JPanel();
     topPanel.setBackground(new Color(10,15,35));
     topPanel.setBounds(0,0,300,30);
     topPanel.setLayout(null);

     JLabel titleLabel=new JLabel(title);
     titleLabel.setForeground(Color.WHITE);
     titleLabel.setBounds(10,5,200,20);


    }
}


