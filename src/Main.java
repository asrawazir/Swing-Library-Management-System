import GUI.HomeFrame;
import GUI.MainFrame;
import Code.FileManager;

public class Main
{
    static FileManager fileManager = new FileManager();
    fileManager.loadMembersFromFile();
    public static void main(String[] args){
        //calling home frame class from main
        fileManager.loadDataFromFile();
        new MainFrame();
    }
}