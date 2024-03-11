
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path inputFile = Paths.get("/Users/anastasianovikova/Desktop/java_junior/EcoUsers/data.csv");
        Path outputFile = Files.createFile(Paths.get(inputFile.getParent().toString(), "EcoUsers.csv"));
        String filePath = String.valueOf(inputFile);

        List<User> users = new ParseUserCVS().parseUser(filePath, new ArrayList<>());
        for (User user : users) {
            if (isEcoFriendly(user)) {
                new EcoFriendlyUserWriterToCVS().saveEcoFriendlyUser(user, outputFile.toString());
            }
        }
    }
    public static boolean isEcoFriendly(User user) {
        return user.waterCountDay < Constants.WATER_COUNT_DAY &&
                user.waterCountNight < Constants.WATER_COUNT_NIGHT &&
                user.gasCount < Constants.GAS_COUNT &&
                user.electroCountDay < Constants.ELECTRO_COUNT_DAY &&
                user.electroCountNight < Constants.ELECTRO_COUNT_NIGHT;
    }

}