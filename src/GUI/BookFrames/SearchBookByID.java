package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchBookByID implements ActionListener {
    CreateFrame sbiFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateLabel label = new CreateLabel("Search Book by ID");
    CreateSubmitButton submitButton = new CreateSubmitButton("Search");
    ArrayListsManager alm = ArrayListsManager.instance;
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();

    public SearchBookByID(){

        idLabel.setText("Enter Book ID : ");
        idLabel.setBounds(10,120,680,30);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setBackground(Color.LIGHT_GRAY);

        idTextField.setBounds(10,160,670,30);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.BLACK);
        idTextField.setBackground(Color.WHITE);
        idTextField.setCaretColor(Color.BLACK);

        ArrayList<Book> books = alm.getBooksList();
        backButton.addActionListener(this);

        sbiFrame.add(submitButton);
        sbiFrame.add(idTextField);
        sbiFrame.add(idLabel);
        sbiFrame.add(label);
        sbiFrame.add(backButton);
        sbiFrame.add(exitButton);
        sbiFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbiFrame.dispose();
            new SearchBook();
        }

        if (e.getSource()==submitButton){
            String id = idTextField.getText();
        }
    }
}
