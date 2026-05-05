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
    ArrayList<Book> books;

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

        books = alm.getBooksList();
        backButton.addActionListener(this);
        submitButton.addActionListener(this);

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
            boolean found = false;
            for (int i = 0; i < books.size();i++){
                if(books.get(i).getID().equalsIgnoreCase(id)){
                    Book foundBook = books.get(i);
                    JLabel foundBookIdLabel = new JLabel("Id: "+foundBook.getID());
                    JLabel foundBookTitleLabel = new JLabel("Title: "+foundBook.getTitle());
                    JLabel foundBookAuthorLabel = new JLabel("Author: "+foundBook.getAuthor());
                    JLabel foundBookTotalLabel = new JLabel("Total Quantities: "+foundBook.getTotalQuantity());
                    JLabel foundBookAvailableLabel = new JLabel("Available Quantity: "+foundBook.getAvailableQuantity());

                    foundBookIdLabel.setBounds(100,200,300,40);
                    foundBookTitleLabel.setBounds(100,230,300,40);
                    foundBookAuthorLabel.setBounds(100,260,300,40);
                    foundBookTotalLabel.setBounds(100,290,300,40);
                    foundBookAvailableLabel.setBounds(100,320,300,40);

                    sbiFrame.add(foundBookIdLabel);
                    sbiFrame.add(foundBookTitleLabel);
                    sbiFrame.add(foundBookAuthorLabel);
                    sbiFrame.add(foundBookTotalLabel);
                    sbiFrame.add(foundBookAvailableLabel);

                    sbiFrame.revalidate();
                    sbiFrame.repaint();

                    found = true;
                    break;
                }
            }
            if(!found){
                JLabel notFoundLabel = new JLabel("Book not found");
                notFoundLabel.setFont(new Font("Inter",Font.BOLD,25));
                notFoundLabel.setBounds(250,200,300,40);
                sbiFrame.add(notFoundLabel);
                sbiFrame.repaint();
                sbiFrame.revalidate();
            }

        }
    }
}
