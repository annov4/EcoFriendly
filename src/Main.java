
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/anastasianovikova/Desktop/java_junior/EcoUsers/data.csv";
        Path outputFile = Paths.get(filePath).resolveSibling("EcoUsers.csv");


        List<User> users = new CVSUserReader(filePath).parseUser(new ArrayList<>());
        for (User user : users) {
            if (isEcoFriendly(user)) {
                new EcoUserSavedToCVS(outputFile).saveEcoFriendlyUser(user);
            }
        }
    }
    public static boolean isEcoFriendly(User user) {
        return user.getWaterCountDay() < Constants.WATER_COUNT_DAY &&
                user.getWaterCountNight() < Constants.WATER_COUNT_NIGHT &&
                user.getGasCount() < Constants.GAS_COUNT &&
                user.getElectroCountDay() < Constants.ELECTRO_COUNT_DAY &&
                user.getElectroCountNight() < Constants.ELECTRO_COUNT_NIGHT;
    }

}