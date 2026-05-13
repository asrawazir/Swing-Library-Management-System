package GUI.AdditionalClasses;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CreateDialogBox extends JDialog {

    public CreateDialogBox( String title, String text){
     setTitle(title);
     setSize(340,190);
     setLocationRelativeTo(null);
     setModal(true);

     JPanel mainPanel = new JPanel(new BorderLayout());
     mainPanel.setBackground(new Color(20,26,46));

     setUndecorated(true);
     JPanel topPanel = new JPanel(new BorderLayout());
     topPanel.setBackground(new Color(10,15,35));
     topPanel.setBounds(0,0,300,30);

     JLabel titleLabel=new JLabel("  "+title);
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
     closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

     closeButton.addActionListener(e -> dispose());
     topPanel.add(titleLabel, BorderLayout.WEST);
     topPanel.add(closeButton, BorderLayout.EAST);
     topPanel.setPreferredSize(new Dimension(300, 35));


     JLabel message=new JLabel(text);
     message.setForeground(Color.white);
     message.setHorizontalAlignment(SwingConstants.CENTER);
     message.setFont(new Font("Segoe UI", Font.PLAIN, 14));
     message.setBorder(new EmptyBorder(10,0,20,0));

     JButton okButton=new JButton("OK");
     okButton.setPreferredSize(new Dimension(90,35));
     okButton.setMaximumSize(new Dimension(90,35));
     okButton.setFocusPainted(false);
     okButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

     okButton.setBackground(new Color(0,120,215));
     okButton.setForeground(Color.white);

     okButton.setFocusable(false);
     okButton.addActionListener(e -> dispose());

     JPanel centerPanel = new JPanel();
     centerPanel.setBackground(new Color(20,26,46));
     centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
     centerPanel.setBorder(new EmptyBorder(20,20,20,20));

     message.setHorizontalAlignment(SwingConstants.CENTER);
     message.setAlignmentX(Component.CENTER_ALIGNMENT);
     okButton.setAlignmentX(Component.CENTER_ALIGNMENT);

     centerPanel.add(message);
     centerPanel.add(okButton);
     mainPanel.add(topPanel, BorderLayout.NORTH);
     mainPanel.add(centerPanel, BorderLayout.CENTER);


     add(mainPanel);

     mainPanel.setBorder(
             BorderFactory.createLineBorder(Color.CYAN,1)
     );

     setVisible(true);


    }
}


