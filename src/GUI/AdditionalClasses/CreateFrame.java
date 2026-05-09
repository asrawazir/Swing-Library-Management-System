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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
