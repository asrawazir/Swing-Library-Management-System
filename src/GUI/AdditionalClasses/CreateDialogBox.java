package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateDialogBox extends JOptionPane {

    public CreateDialogBox( String title, String text){
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.PLAIN_MESSAGE);
    }
}
