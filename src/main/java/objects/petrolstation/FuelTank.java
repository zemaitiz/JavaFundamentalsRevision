package objects.petrolstation;

public class FuelTank {
    private String type;
    private double volume;

    public FuelTank(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
