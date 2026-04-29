package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class CreateBackButton extends JButton{

    //default constructor
    public CreateBackButton(){
        this.setLocation(50,390);
        this.setSize(80,40);
        this.setFont(new Font("Roboto", Font.BOLD, 12));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.setText("Back");
        this.setOpaque(true);
        this.setFocusable(false);
    }
}
