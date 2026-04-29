package GUI;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
public class HomeFrame {
    CreateFrame frame;
    CreateLabel label;
    CreateBackButton button;
    CreateExitButton exitButton;
    FrameButtons button1;
    FrameButtons button2;
    FrameButtons button3;
    public HomeFrame(){
        frame=new CreateFrame();
        label=new CreateLabel("HOME FRAME");
        button=new CreateBackButton();
        exitButton=new CreateExitButton();
        button1=new FrameButtons(" Book Menu",210,110);
        button2=new FrameButtons(" Member Menu",420,110);
        button3=new FrameButtons(" Room Menu",310,200);


        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(exitButton);
        frame.add(button);
        frame.setVisible(true);




    }
}
