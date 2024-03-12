import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/anastasianovikova/Desktop/java_junior/EcoUsers/data.csv";
        Path outputFile = Paths.get(filePath).resolveSibling("EcoUsers.csv");


        List<User> users = new CVSUserReader(filePath).readerUser(new ArrayList<>());
        for (User user : users) {
            if (new EcoCompare().isEcoFriendly(user)) {
                new CVSUserWriter(outputFile).writerUser(user);
            }
        }
    }
}