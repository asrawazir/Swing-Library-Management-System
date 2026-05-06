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

        ImageIcon backgroundIcon = new ImageIcon("img3.jpg");
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

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}