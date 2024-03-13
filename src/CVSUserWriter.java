import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CVSUserWriter implements UserWriter {

    static String outputFile = String.valueOf(Paths.get(CSVUserReader.filePath).resolveSibling("EcoUsers.csv"));

    public CVSUserWriter(Path outputFile) {
        this.outputFile = String.valueOf(outputFile);
    }

    @Override
    public void writerUser(java.util.List<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getId()).append("|")
                        .append(user.getName()).append("|")
                        .append(user.getWaterCountDay()).append("|")
                        .append(user.getWaterCountNight()).append("|")
                        .append(user.getGasCount()).append("|")
                        .append(user.getElectroCountDay()).append("|")
                        .append(user.getElectroCountNight()).append("\n");
                writer.write(sb.toString());
            }
        }
    }
}
