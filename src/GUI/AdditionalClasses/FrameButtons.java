package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class FrameButtons extends JButton {

    //default constructor
    public FrameButtons(String title, int x, int y){
        this.setLocation(x,y);
        this.setSize(150,75);
        this.setFont(new Font("Roboto", Font.BOLD, 16));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.setText(title);
        this.setOpaque(true);
        this.setFocusable(false);
    }
}
