package GUI;

import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateSubmitButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame implements ActionListener {

    CreateFrame mFrame;
    JLabel mLabel;
    JLabel backgroundLabel;
    JPanel transparentPanel;
    CreateSubmitButton mSubmitButton;

    public MainFrame() {

        mFrame = new CreateFrame();
        mSubmitButton = new CreateSubmitButton("LOGIN");

        ImageIcon backgroundIcon = new ImageIcon("image.jpeg");
        Image scaledImage = backgroundIcon.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        backgroundLabel = new JLabel(new ImageIcon(scaledImage));
        backgroundLabel.setBounds(0, 0, 700, 500);

        transparentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(new Color(255, 255, 255, 180));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();
                super.paintComponent(g);
            }
        };

        transparentPanel.setOpaque(false);
        transparentPanel.setLayout(null);
        transparentPanel.setBounds(100, 170, 500, 100);

        mLabel = new JLabel("Library Management System");
        mLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 28));
        mLabel.setForeground(new Color(20, 30, 48));
        mLabel.setBounds(40, 35, 450, 40);

        transparentPanel.add(mLabel);
        mSubmitButton.addActionListener(this);

        mFrame.add(transparentPanel);
        mFrame.add(mSubmitButton);
        mFrame.add(backgroundLabel);

        mFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mSubmitButton){
            mFrame.dispose();
            new HomeFrame();
        }

    }
}