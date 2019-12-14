package objects.petrolstation;

import java.math.BigDecimal;

public class FuelTank {
    private String type;
    private double volume;
    private BigDecimal price;

    public FuelTank(String type, double volume, BigDecimal price) {
        this.type = type;
        this.volume = volume;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
