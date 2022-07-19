import java.util.ArrayList;
import java.util.List;

public class Main {
    static public List<String> saveFilesPath = new ArrayList<>();

    public static void main(String[] args) {

//Задание №1
        Install install = new Install();
        install.addDirectory("C://Games");
        install.addDirectory("C://Games//src");
        install.addDirectory("C://Games//res");
        install.addDirectory("C://Games//savegames");
        install.addDirectory("C://Games//temp");
        install.addDirectory("C://Games//src//main");
        install.addDirectory("C://Games//src//test");
        install.addFile("C://Games//src//main//Main.java");
        install.addFile("C://Games//src//main//Utils.java");
        install.addDirectory("C://Games//res//drawables");
        install.addDirectory("C://Games//res//vectors");
        install.addDirectory("C://Games//res//icons");
        install.addFile("C://Games//temp//temp.txt");
        install.logList();

//Задание №2
        GameProgress gameProgress1 = new GameProgress(100, 1, 1, 20.5);
        GameProgress gameProgress2 = new GameProgress(80, 2, 2, 60.2);
        GameProgress gameProgress3 = new GameProgress(25, 4, 4, 153.7);


        gameProgress1.saveGame("C://Games//savegames//save1.dat", gameProgress1);
        gameProgress2.saveGame("C://Games//savegames//save2.dat", gameProgress2);
        gameProgress3.saveGame("C://Games//savegames//save3.dat", gameProgress3);


        gameProgress2.zipFiles("C://Games//savegames//Zip.zip");
        gameProgress1.deleteFiles();

//Задание №3
        gameProgress1.openZip("C://Games//savegames//Zip.zip", "C://Games//savegames//");
        System.out.println(gameProgress1.openProgress("C://Games//savegames//(unzip)save_zip1.dat"));
        System.out.println(gameProgress1.openProgress("C://Games//savegames//(unzip)save_zip2.dat"));
        System.out.println(gameProgress1.openProgress("C://Games//savegames//(unzip)save_zip3.dat"));
    }
}