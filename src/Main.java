import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class Main {
    static int maxConsumption = 500;
    public static void main(String[] args) throws IOException {

        UserReader reader = new CSVUserReader(Path.of(CSVUserReader.filePath));
        EcoCompare filter = new EcoCompare(maxConsumption);
        UserWriter writer = new CVSUserWriter(Path.of(CVSUserWriter.outputFile));
        List<User> inputData = reader.readerUser();
        List<User> ecoUsers = filter.createdEcoUsers(inputData);
        writer.writerUser(ecoUsers);

    }
}
