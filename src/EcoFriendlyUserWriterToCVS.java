import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EcoFriendlyUserWriterToCVS implements SaveEcoFriendlyUser {
    @Override
    public void saveEcoFriendlyUser(User user, String outputFile) {
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