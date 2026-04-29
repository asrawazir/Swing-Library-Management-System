import GUI.AdditionalClasses.CreateFrame;
import GUI.BookFrames.BookHomeFrame;
import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Book Home Frame\n" +
                "Enter 2 for Members Home Frame\n" +
                "Enter 3 for Rooms Home Frame");
        int inp = input.nextInt();
        if (inp==1){
            new BookHomeFrame();
        }
    }
}