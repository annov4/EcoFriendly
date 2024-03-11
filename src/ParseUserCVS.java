import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ParseUserCVS implements ParsingUser {
    @Override
    public List<User> parseUser(String filePath, List<User> users) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\|");
                User user = new User();
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
}