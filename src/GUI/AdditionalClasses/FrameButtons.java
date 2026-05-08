package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class FrameButtons extends JButton {

    //default constructor
    public FrameButtons(String title, int x, int y){
        this.setLocation(x,y);
        this.setSize(170,65);
        this.setFont(new Font("Roboto", Font.BOLD, 14));
        this.setBackground(new Color(15,52,96));
        this.setForeground(new Color(0,212,255));
        this.setText(title);
        this.setOpaque(true);
        this.setFocusable(false);
    }
}
