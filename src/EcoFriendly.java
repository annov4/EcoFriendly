public class EcoFriendly {
    public static boolean isEcoFriendly(String[] values) {
        try {
            int waterCountDay = Integer.parseInt(values[2]);
            int waterCountNight = Integer.parseInt(values[3]);
            int gasCount = Integer.parseInt(values[4]);
            int electroCountDay = Integer.parseInt(values[5]);
            int electroCountNight = Integer.parseInt(values[6]);


            return waterCountDay < Constants.WATER_COUNT_DAY &&
                    waterCountNight < Constants.WATER_COUNT_NIGHT &&
                    gasCount < Constants.GAS_COUNT &&
                    electroCountDay < Constants.ELECTRO_COUNT_DAY &&
                    electroCountNight < Constants.ELECTRO_COUNT_NIGHT;

        } catch (NumberFormatException e) {
            return false;
        }
    }

}
