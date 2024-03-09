
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
   /* public static void main(String[] args) throws IOException {


        Path inputFile = Paths.get("data.csv");
        //Path outputFile = Files.createFile(Paths.get(inputFile.getParent() + "/EcoUsers.csv"));//создем новый файл в той же директории/

        try {

            Stream<String> stream = Files.lines(inputFile);


            List<String> result = stream
                    .filter(line -> line.startsWith("\\|"))//фильтр
                    .collect(Collectors.toList());
            for (String value : result) {
                System.out.println(value);

    }
} catch (IOException e) {
            throw new RuntimeException(e);
       */ }



// CONST
//waterCountDay
// waterCountNight
// gasCount
// electroCountDay
// electroCountNight