import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CVSUserReader implements UserReader {
    private String filePath; // добавляем переменную filePath

    public CVSUserReader(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public List<User> parseUser(List<User> users) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\|");
                User user = new User();
                user.setId(Integer.parseInt(values[0]));
                user.setName(values[1]);
                user.setWaterCountDay(Integer.parseInt(values[2]));
                user.setWaterCountNight(Integer.parseInt(values[3]));
                user.setGasCount(Integer.parseInt(values[4]));
                user.setElectroCountDay(Integer.parseInt(values[5]));
                user.setElectroCountNight(Integer.parseInt(values[6]));
                users.add(user);
            }
            return users;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}