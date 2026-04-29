package GUI.AdditionalClasses;

import javax.swing.*;
import java.awt.*;

public class CreateLabel extends JLabel{

    //default Constructor
    public CreateLabel(String title) {
        this.setLocation(0, 0);
        this.setSize(700, 50);
        this.setBackground(Color.GRAY);
        this.setForeground(Color.BLACK); //text color
        this.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setText(title);
        this.setOpaque(true);
    }
}
