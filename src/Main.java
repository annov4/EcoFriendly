
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

        List<Users> users = parseUsers(filePath);
        for (Users user : users) {
            if (isEcoFriendly(user)) {
                saveEcoFriendlyUser(user, String.valueOf(outputFile));
            }
        }
    }

    private static List<Users> parseUsers(String filePath) throws IOException {
        List<Users> users = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\|");
                Users user = new Users();
                user.id = Integer.parseInt(values[0]);
                user.name = values[1];
                user.waterCountDay = Integer.parseInt(values[2]);
                user.waterCountNight = Integer.parseInt(values[3]);
                user.gasCount = Integer.parseInt(values[4]);
                user.electroCountDay = Integer.parseInt(values[5]);
                user.electroCountNight = Integer.parseInt(values[6]);
                users.add(user);
            }
            return users;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isEcoFriendly(Users user) {
        return user.waterCountDay < Constants.WATER_COUNT_DAY &&
                user.waterCountNight < Constants.WATER_COUNT_NIGHT &&
                user.gasCount < Constants.GAS_COUNT &&
                user.electroCountDay < Constants.ELECTRO_COUNT_DAY &&
                user.electroCountNight < Constants.ELECTRO_COUNT_NIGHT;
    }

    private static void saveEcoFriendlyUser(Users user, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.id).append("|")
                    .append(user.name).append("|")
                    .append(user.waterCountDay).append("|")
                    .append(user.waterCountNight).append("|")
                    .append(user.gasCount).append("|")
                    .append(user.electroCountDay).append("|")
                    .append(user.electroCountNight).append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
