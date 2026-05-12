package GUI.AdditionalClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateFrame extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    private int mouseX;
    private int mouseY;
    private JPanel titlebar;
    private JButton closeButton;

    //default Constructor
    public CreateFrame(){
        this.setUndecorated(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.getContentPane().setBackground(new Color(26,26,46));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Library Management System");

        titlebar = new JPanel();
        titlebar.setBackground(new Color(26,26,46));
        titlebar.setBounds(0, 0, 700, 30);
        titlebar.setLayout(null);

        JLabel titleLabel = new JLabel();
        titleLabel.setText("Library Management System");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Inter", Font.BOLD,12));
        titleLabel.setBounds(10,0,200,30);

        titlebar.add(titleLabel);

        closeButton = new JButton();
        closeButton.setText("X");
        closeButton.setBackground(new Color(26,26,46));
        closeButton.setForeground(Color.WHITE);
        closeButton.setBounds(655,0,45,30);
        closeButton.setFont(new Font("Inter", Font.BOLD,12));
        closeButton.setFocusPainted(false);

        titlebar.add(closeButton);

        closeButton.addActionListener(this);

        this.add(titlebar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == closeButton){
            System.exit(0);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == titlebar){
            mouseX = e.getX();
            mouseY = e.getY();

            titlebar.setBackground(new Color(10, 35, 70));
        }

        if (e.getSource() == closeButton) {
            closeButton.setBackground(new Color(180, 0, 0)); // Darker red
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == titlebar) {
            titlebar.setBackground(new Color(15, 52, 96)); // Original color
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == closeButton){
            closeButton.setBackground(Color.RED);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == closeButton){
            closeButton.setBackground(new Color(26,26,46));
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource() == titlebar){
            int newX = getLocation().x + e.getX() - mouseX;
            int newY = getLocation().y + e.getY() - mouseY;
            setLocation(newX,newY);
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
