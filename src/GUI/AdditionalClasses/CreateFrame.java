package GUI.AdditionalClasses;

import java.awt.*;
import javax.swing.*;

public class CreateFrame extends JFrame{

    //default Constructor
    public CreateFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Library Management System");

    }

}
