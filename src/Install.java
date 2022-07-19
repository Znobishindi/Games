import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Install {

    StringBuilder log = new StringBuilder();

    public StringBuilder getLog() {
        return log;
    }

    public void addDirectory(String dirPath) {
        File dir = new File(dirPath);
        if (dir.mkdir()) {
            log.append("Создан каталог: " + dir.getName() + "; ");
        }
    }

    public void addFile(String dirPath) {
        File myFile = new File(dirPath);
        try {
            if (myFile.createNewFile()) {
                log.append("Создан файл: " + myFile.getName() + "; ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logList() {
        String text = log.toString();
        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", true)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}