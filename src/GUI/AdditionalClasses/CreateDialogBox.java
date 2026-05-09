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

     JButton closeButton=new JButton("X");
     closeButton.setFocusable(false);
     closeButton.setBounds(255,2,40,25);
     closeButton.setBorderPainted(false);
     closeButton.setContentAreaFilled(false);
     closeButton.setBackground(new Color(10,15,35));
     closeButton.setForeground(Color.white);
     closeButton.setFont(new Font("Arial", Font.BOLD, 14));
     closeButton.setMargin(new Insets(0,0,0,0));

     closeButton.addActionListener(e -> dispose());
     topPanel.add(titleLabel);
     topPanel.add(closeButton);


     JLabel message=new JLabel(text);
     



    }
}


