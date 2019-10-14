package Logic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logic {
    public Boolean userExist(String username)
    {
        File file = new File(
                getClass().getClassLoader().getResource("users.txt").getFile()
        );
        String[] usersArray = getContentOfFile(file).split(System.lineSeparator());
        return Arrays.asList(usersArray).contains(username);
    }

    public String getContentOfFile(File i_File) {
        String fileContent = "";
        Path path = Paths.get(i_File.getAbsolutePath());

        try {
            fileContent = "";
            if (path.toFile().length() > 0)
                fileContent = new String(Files.readAllBytes(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileContent;
    }

    public ArrayList<String> getNotifications() {
        ArrayList listNotiofications = new ArrayList<>();

        return listNotiofications;
    }
}
