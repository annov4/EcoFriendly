import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {


        UserReader reader = new CSVUserReader(Path.of(CSVUserReader.filePath));

        Compare compare = new EcoCompare(maxConsumption);//значение? нужно установить одно для всех?

        UserWriter writer = new CVSUserWriter(Path.of(CVSUserWriter.outputFile));

        User inputData = reader.readerUser();

        User ecoUsers = compare.compare(inputData);

        writer.writerUser(ecoUsers);

    }
}
//UserReader reader
//= new CSVUserReader
//path);
//UserFilter filter
//= new EcoUserFilter
//maxConsumption);
//UserWriter writer
//new CSVUserWriter(
//path)
//User[] inputData = reader.read();
//User[]
//ecoUsers= filter.filter inputData);
//writer write(ecoUsers);