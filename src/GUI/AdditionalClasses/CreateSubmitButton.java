package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class CreateSubmitButton extends JButton{

    //default constructor
    public CreateSubmitButton(String title){
        this.setLocation(50,390);
        this.setSize(100,40);
        this.setFont(new Font("Roboto", Font.BOLD, 12));
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
        this.setText(title);
        this.setOpaque(true);
    }
}
