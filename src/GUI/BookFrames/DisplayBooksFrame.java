package GUI.BookFrames;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.CreateBackButton;
import GUI.AdditionalClasses.CreateExitButton;
import GUI.AdditionalClasses.CreateFrame;
import GUI.AdditionalClasses.CreateLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DisplayBooksFrame implements ActionListener {

    //Creating a basic frame
    CreateFrame dbFrame = new CreateFrame();

    //Defining the main label
    CreateLabel label = new CreateLabel("Display Books");

    //Creating an instance object of ArrayListsManager class
    ArrayListsManager alm = ArrayListsManager.instance;

    //Creating buttons using pre-defined button classes
    CreateBackButton backButton = new CreateBackButton();
    CreateExitButton exitButton = new CreateExitButton();

    //Default Constructor
    public DisplayBooksFrame(){

        ArrayList<Book> books = alm.getBooksList();

        //Creating an array holding headers for table
        String[] headers = {"Book Id","Title","Author","Quantity"};

        //Creating a 2D array to hold data for tables
        String[][] data = new String[books.size()][4];

        //Loading the data in the 2D array from the array list
        for (int i = 0; i < books.size(); i++){
            data[i][0] = books.get(i).getID();
            data[i][1] = books.get(i).getTitle();
            data[i][2] = books.get(i).getAuthor();
            data[i][3] = books.get(i).getTotalQuantity();
        }

        //Creating the JTable object
        JTable table = new JTable(data,headers);
        table.setBackground(new Color(15,22,40));
        table.setForeground(Color.white);
        table.setSelectionBackground(new Color(0,120,215));
        table.setSelectionForeground(Color.white);
        table.setGridColor(new Color(40,60,90));
        

        //Creating a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        //Setting pounds of Scroll pane
        scrollPane.setBounds(70,80,560,280);

        //Adding action listener method to back button
        backButton.addActionListener(this);

        //Adding main label to the frame
        dbFrame.add(label);

        //Adding Scroll Pane to the frame
        dbFrame.add(scrollPane);

        //Adding buttons to the frame
        dbFrame.add(backButton);
        dbFrame.add(exitButton);

        //Setting the visibility of frame to true
        dbFrame.setVisible(true);
    }

    //Overriding actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e){

        //Processing the action received by backButton
        if (e.getSource()==backButton){
            dbFrame.dispose();
            new BookHomeFrame();
        }
    }
}
