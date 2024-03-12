public class User {
    private Integer id;
    private String name;
    private Integer waterCountDay;
    private Integer waterCountNight;
    private Integer gasCount;
    private Integer electroCountDay;
    private Integer electroCountNight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWaterCountDay() {
        return waterCountDay;
    }

    public void setWaterCountDay(Integer waterCountDay) {
        this.waterCountDay = waterCountDay;
    }

    public Integer getWaterCountNight() {
        return waterCountNight;
    }

    public void setWaterCountNight(Integer waterCountNight) {
        this.waterCountNight = waterCountNight;
    }

    public Integer getGasCount() {
        return gasCount;
    }

    public void setGasCount(Integer gasCount) {
        this.gasCount = gasCount;
    }

    public Integer getElectroCountDay() {
        return electroCountDay;
    }

    public void setElectroCountDay(Integer electroCountDay) {
        this.electroCountDay = electroCountDay;
    }

    public Integer getElectroCountNight() {
        return electroCountNight;
    }

    public void setElectroCountNight(Integer electroCountNight) {
        this.electroCountNight = electroCountNight;
    }
}
