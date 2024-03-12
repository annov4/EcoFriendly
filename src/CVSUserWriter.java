import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CVSUserWriter implements UserWriter {

    private String outputFile;

    public CVSUserWriter(Path outputFile) {
        this.outputFile = String.valueOf(outputFile);
    }

    @Override
    public void writerUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.getId()).append("|")
                    .append(user.getName()).append("|")
                    .append(user.getWaterCountDay()).append("|")
                    .append(user.getWaterCountNight()).append("|")
                    .append(user.getGasCount()).append("|")
                    .append(user.getElectroCountDay()).append("|")
                    .append(user.getElectroCountNight()).append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}