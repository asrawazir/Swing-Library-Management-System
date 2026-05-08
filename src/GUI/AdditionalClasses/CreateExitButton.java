package GUI.AdditionalClasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class CreateExitButton extends JButton implements ActionListener, KeyListener {

    //default Constructor
    public CreateExitButton(){
        this.setLocation(580,390);
        this.setSize(80,40);
        this.setBackground(new Color (15,52,96));
        this.setForeground(new Color(0,212,255));
        this.setForeground(Color.white);
        this.addActionListener(this);
        this.addKeyListener(this);
        this.setText("Exit");
        this.setOpaque(true);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            System.exit(0);
        }
    }

    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case 27:
                System.exit(0);
        }
    }
    @Override
    public void keyReleased(KeyEvent e){

    }
}
