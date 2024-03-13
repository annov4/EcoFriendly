import java.util.ArrayList;
import java.util.List;

public class EcoCompare {
    private final int maxConsumption;

    public EcoCompare(int maxConsumption) {
        this.maxConsumption = maxConsumption;
    }
    public boolean ecoFilter(User user) {
        return  user.getWaterCountDay() < maxConsumption &&
                user.getWaterCountNight() < maxConsumption &&
                user.getGasCount() < maxConsumption &&
                user.getElectroCountDay() < maxConsumption &&
                user.getElectroCountNight() < maxConsumption;
    }
    public List<User> writeEcoUsers(List<User> users) {
        EcoCompare ecoCompare = new EcoCompare(Main.maxConsumption);
        List<User> ecoUsers = new ArrayList<>();
        for (User user : users) {
            if (ecoCompare.ecoFilter(user)) {
                ecoUsers.add(user);
            }
        }
        return ecoUsers;
    }

}
