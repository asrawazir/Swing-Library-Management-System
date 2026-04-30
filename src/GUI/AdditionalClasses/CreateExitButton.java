package GUI.AdditionalClasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreateExitButton extends JButton implements ActionListener {

    //default Constructor
    public CreateExitButton(){
        this.setLocation(580,390);
        this.setSize(80,40);
        this.setFont(new Font("Roboto", Font.BOLD, 12));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.addActionListener(this);
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
}
