package GUI.AdditionalClasses;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CreateDialogBox extends JDialog {

    public CreateDialogBox( String title, String text){
     setTitle(title);
     setSize(300,150);
     setLocationRelativeTo(null);
     setModal(true);

     JPanel mainPanel = new JPanel(new BorderLayout());
     mainPanel.setBackground(new Color(20,26,46));

     setUndecorated(true);
     JPanel topPanel = new JPanel(new BorderLayout());
     topPanel.setBackground(new Color(10,15,35));
     topPanel.setBounds(0,0,300,30);

     JLabel titleLabel=new JLabel(title);
     titleLabel.setForeground(Color.WHITE);
     titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));


     JButton closeButton=new JButton("X");
     closeButton.setFocusable(false);

     closeButton.setBorderPainted(false);
     closeButton.setContentAreaFilled(false);
     closeButton.setBackground(new Color(10,15,35));
     closeButton.setForeground(Color.white);
     closeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
     closeButton.setMargin(new Insets(0,0,0,0));

     closeButton.addActionListener(e -> dispose());
     topPanel.add(titleLabel, BorderLayout.WEST);
     topPanel.add(closeButton, BorderLayout.EAST);
     topPanel.setPreferredSize(new Dimension(300, 35));


     JLabel message=new JLabel(text);
     message.setForeground(Color.white);
     message.setHorizontalAlignment(SwingConstants.CENTER);
     message.setFont(new Font("Segoe UI", Font.PLAIN, 14));
     message.setBounds(0,50,300,20);

     JButton okButton=new JButton("OK");
     okButton.setBounds(110,90,80,30);

     okButton.setBackground(new Color(40,50,80));
     okButton.setForeground(Color.cyan);

     okButton.setFocusable(false);
     okButton.addActionListener(e -> dispose());

     JPanel centerPanel = new JPanel();
     centerPanel.setBackground(new Color(20,26,46));
     centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
     centerPanel.setBorder(new EmptyBorder(20,20,20,20));

     add(topPanel);
     add(message);
     add(okButton);
     add(mainPanel);
     setVisible(true);


    }
}


