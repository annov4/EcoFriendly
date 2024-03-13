import java.util.ArrayList;
import java.util.List;

public class EcoCompare implements Compare {
    int maxConsumption = 800;
    @Override
    public boolean isEcoUser(User user, int maxConsumption) {
        return user.getWaterCountDay() < maxConsumption &&
                user.getWaterCountNight() < maxConsumption &&
                user.getGasCount() < maxConsumption &&
                user.getElectroCountDay() < maxConsumption &&
                user.getElectroCountNight() < maxConsumption;
    }
}
