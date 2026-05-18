import GUI.HomeFrame;
import GUI.MainFrame;
import Code.FileManager;

public class Main
{

    public static void main(String[] args){
        //calling home frame class from main
        FileManager fileManager = new FileManager();
        fileManager.loadDataFromFile();
        //fileManager.loadMembersFromFile();
        new MainFrame();
    }
}