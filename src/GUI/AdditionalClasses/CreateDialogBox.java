package GUI.AdditionalClasses;

import javax.swing.*;

public class CreateDialogBox extends JOptionPane {

    public CreateDialogBox( String title, String text){
     setTitle(title);
     setSize(300,150);
     setLocationRelativeTo(null);
     setModal(true);
     
