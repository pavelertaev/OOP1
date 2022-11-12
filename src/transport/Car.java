package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Car {

    private String brand;
    private String model;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanik<?>> mechaniks = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    private double engVolume;


    public Car(String brand, String model, double engVolume) {
        if (!brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (!model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngVolume(engVolume);
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanik<?>> getMechaniks() {
        return mechaniks;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();

    public abstract boolean service();
    public abstract void repair();
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngVolume() {
        return engVolume;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", drivers=" + drivers +
                ", mechaniks=" + mechaniks +
                ", sponsors=" + sponsors +
                ", engVolume=" + engVolume +
                '}';
    }

    public void setEngVolume(double engVolume) {
        if (engVolume > 0) {
            this.engVolume = engVolume;
        } else {
            this.engVolume = 1;
        }
    }
    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanik(Mechanik<?> mechanik){
        mechaniks.add(mechanik);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

}
