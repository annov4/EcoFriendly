public class EcoCompare implements Compare {
    @Override
    public boolean isEcoFriendly(User user) {
        return user.getWaterCountDay() < Constants.WATER_COUNT_DAY &&
                user.getWaterCountNight() < Constants.WATER_COUNT_NIGHT &&
                user.getGasCount() < Constants.GAS_COUNT &&
                user.getElectroCountDay() < Constants.ELECTRO_COUNT_DAY &&
                user.getElectroCountNight() < Constants.ELECTRO_COUNT_NIGHT;

    }
}
