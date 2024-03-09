
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        String FILE_NAME = "/Users/anastasianovikova/Desktop/java_junior/EcoUsers/data.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            while((line = br.readLine()) != null) { // читаем первую строку
                String[] values = line.split("\\|"); // чтение происходит по столбцам
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
