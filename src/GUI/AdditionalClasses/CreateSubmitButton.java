package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class CreateSubmitButton extends JButton{

    //parameterized constructor
    public CreateSubmitButton(String title){
        this.setLocation(300,340);
        this.setSize(100,40);
        this.setFont(new Font("Roboto", Font.BOLD, 12));
        this.setBackground(new Color(0,212,255));
        this.setForeground(Color.BLACK);
        this.setText(title);
        this.setOpaque(true);
        this.setFocusable(false);
    }

    //parameterized constructor with 3 parameters
    public CreateSubmitButton(String title,int x, int y){
        this.setLocation(x,y);
        this.setSize(100,40);
        this.setFont(new Font("Roboto", Font.BOLD, 12));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.setText(title);
        this.setOpaque(true);
        this.setFocusable(false);
    }
}
