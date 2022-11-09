package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

    private String brand;
    private String model;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanik<?>> mechaniks = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanik<?>> getMechaniks() {
        return mechaniks;
    }

    public List<Sponsor> getSponsors() {
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
