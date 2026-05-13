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
    CreateSubmitButton submitButton = new CreateSubmitButton("Search",560,125);
    ArrayListsManager alm = ArrayListsManager.instance;
    JLabel idLabel = new JLabel();
    JTextField idTextField = new JTextField();
    ArrayList<Book> books;
    JPanel foundBookPanel = null;
    JLabel notFoundLabel = null;

    public SearchBookByID(){

        idLabel.setText("Enter Book ID : ");
        idLabel.setBounds(10,90,530,30);
        idLabel.setFont(new Font("Inter",Font.BOLD,14));
        idLabel.setForeground(Color.WHITE);

        idTextField.setBounds(10,130,530,30);
        idTextField.setFont(new Font("Inter",Font.PLAIN,14));
        idTextField.setForeground(Color.WHITE);
        idTextField.setBackground(new Color(10,20,35));
        idTextField.setCaretColor(Color.WHITE);

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
            new SearchBookFrame();
        }

        if (e.getSource()==submitButton)
        {
            if (foundBookPanel != null) {
                sbiFrame.remove(foundBookPanel);
                foundBookPanel = null;
            }
            if (notFoundLabel != null) {
                sbiFrame.remove(notFoundLabel);
                notFoundLabel = null;
            }

            String id = idTextField.getText();
            boolean found = false;
            for (int i = 0; i < books.size();i++){
                if(books.get(i).getID().equalsIgnoreCase(id)){
                    Book foundBook = books.get(i);

                    foundBookPanel = new JPanel();
                    foundBookPanel.setBounds(170,190,350,180);
                    foundBookPanel.setBackground(new Color(20,30,45));
                    foundBookPanel.setBorder(
                            BorderFactory.createLineBorder(Color.WHITE,2)
                    );

                    foundBookPanel.setLayout(new GridLayout(5,1,5,5));

                    JLabel foundBookIdLabel =
                            new JLabel("Book ID: " + foundBook.getID());

                    JLabel foundBookTitleLabel =
                            new JLabel("Title: " + foundBook.getTitle());

                    JLabel foundBookAuthorLabel =
                            new JLabel("Author: " + foundBook.getAuthor());

                    JLabel foundBookTotalLabel =
                            new JLabel("Total Quantity: " + foundBook.getTotalQuantity());

                    JLabel foundBookAvailableLabel =
                            new JLabel("Available Quantity: " + foundBook.getAvailableQuantity());

                    JLabel[] labels = {
                            foundBookIdLabel,
                            foundBookTitleLabel,
                            foundBookAuthorLabel,
                            foundBookTotalLabel,
                            foundBookAvailableLabel
                    };

                    for (JLabel lbl : labels) {
                        lbl.setForeground(Color.WHITE);
                        lbl.setFont(new Font("Inter", Font.BOLD, 16));
                        lbl.setBorder(BorderFactory.createEmptyBorder(0,15,0,0));
                        foundBookPanel.add(lbl);
                    }
                    sbiFrame.add(foundBookPanel);
                    sbiFrame.revalidate();
                    sbiFrame.repaint();

                    found = true;
                    break;
                }
            }
            if(!found){
                notFoundLabel = new JLabel("Book not found!");
                notFoundLabel.setFont(new Font("Inter",Font.BOLD,30));
                notFoundLabel.setForeground(Color.WHITE);
                notFoundLabel.setBounds(250,250,300,40);
                sbiFrame.add(notFoundLabel);
            }
            sbiFrame.repaint();
            sbiFrame.revalidate();
        }
    }
}
