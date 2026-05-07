package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchBookByAuthor implements ActionListener {
    CreateFrame sbaFrame = new CreateFrame();
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();
    CreateSubmitButton submitButton = new CreateSubmitButton("Search",560,110);
    CreateLabel label = new CreateLabel("Search Book by Author Name");
    JLabel authorLabel = new JLabel();
    JTextField authorTextField = new JTextField();
    ArrayListsManager alm = ArrayListsManager.instance;

    public SearchBookByAuthor(){

        authorLabel.setText("Enter Author Name : ");
        authorLabel.setBounds(10,80,530,30);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setBackground(Color.LIGHT_GRAY);

        authorTextField.setBounds(10,120,530,30);
        authorTextField.setFont(new Font("Inter",Font.PLAIN,14));
        authorTextField.setForeground(Color.BLACK);
        authorTextField.setBackground(Color.WHITE);
        authorTextField.setCaretColor(Color.BLACK);

        backButton.addActionListener(this);

        sbaFrame.add(submitButton);
        sbaFrame.add(label);
        sbaFrame.add(authorTextField);
        sbaFrame.add(authorLabel);
        sbaFrame.add(backButton);
        sbaFrame.add(exitButton);
        sbaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            sbaFrame.dispose();
            new SearchBookFrame();
        }

        if (e.getSource()==submitButton){
            String author = authorTextField.getText();
            ArrayList<Book> books = alm.getBooksList();
            ArrayList<Book> foundBook = new ArrayList<>();
            for(int i = 0; i < books.size(); i++){
                if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                    foundBook.add(books.get(i));
                }
            }
            if (foundBook.isEmpty()){

            }
            else {
                String[] headers = {"Book Id","Title","Author"};
                String[][] data = new String[foundBook.size()][3];
                for (int i = 0; i < foundBook.size();i++){
                    data[i][0] = foundBook.get(i).getID();
                    data[i][1] = foundBook.get(i).getTitle();
                    data[i][2] = foundBook.get(i).getAuthor();
                }
                JTable table = new JTable(data,headers);
            }
        }
    }
}
