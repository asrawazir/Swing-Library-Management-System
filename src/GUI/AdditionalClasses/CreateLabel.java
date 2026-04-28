package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class CreateLabel extends JLabel{

    //default constructor
    public CreateLabel(String title){
        this.setLocation(0,0);
        this.setSize(700,50);
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.BLACK);
        this.setFont(new Font("Bookman Old Style" , Font.BOLD, 27));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setText(title);
        this.setOpaque(true);
    }

}
