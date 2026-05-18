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
    CreateSubmitButton submitButton = new CreateSubmitButton("Search",560,125);
    CreateLabel label = new CreateLabel("Search Book by Author Name");
    JLabel authorLabel = new JLabel();
    JTextField authorTextField = new JTextField();
    ArrayListsManager alm = ArrayListsManager.instance;
    JScrollPane foundBooksScrollPane = null;
    JLabel notFoundLabel = null;

    public SearchBookByAuthor(){

        authorLabel.setText("Enter Author Name : ");
        authorLabel.setBounds(10,90,530,30);
        authorLabel.setFont(new Font("Inter",Font.BOLD,14));
        authorLabel.setForeground(Color.WHITE);

        authorTextField.setBounds(10,130,530,30);
        authorTextField.setFont(new Font("Inter",Font.PLAIN,14));
        authorTextField.setForeground(Color.WHITE);
        authorTextField.setBackground(new Color(10,20,35));
        authorTextField.setCaretColor(Color.WHITE);

        backButton.addActionListener(this);
        submitButton.addActionListener(this);

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
            if(foundBooksScrollPane != null){
                sbaFrame.remove(foundBooksScrollPane);
                foundBooksScrollPane = null;
            }

            if(notFoundLabel != null){
                sbaFrame.remove(notFoundLabel);
                notFoundLabel = null;
            }

            String author = authorTextField.getText();
            ArrayList<Book> books = alm.getBooksList();
            ArrayList<Book> foundBook = new ArrayList<>();
            for(int i = 0; i < books.size(); i++){
                if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                    foundBook.add(books.get(i));
                }
            }
            if (foundBook.isEmpty()){
                notFoundLabel = new JLabel("Book not found!");
                notFoundLabel.setFont(new Font("Inter",Font.BOLD,30));
                notFoundLabel.setForeground(Color.WHITE);
                notFoundLabel.setBounds(250,250,300,40);

                sbaFrame.add(notFoundLabel);
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
                table.setBackground(new Color(10,20,35));
                table.setForeground(Color.white);
                foundBooksScrollPane = new JScrollPane(table);
                foundBooksScrollPane.setBounds(70,180,560,180);
                sbaFrame.add(foundBooksScrollPane);

            }
            sbaFrame.revalidate();
            sbaFrame.repaint();
        }
    }
}
