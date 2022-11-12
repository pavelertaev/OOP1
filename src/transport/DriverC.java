package transport;

public class DriverC implements DriverLicense{
    public boolean canDrive(Car car) {
        return (car.getClass()==Truck.class);
    }

    @Override
    public String toString() {
        return "DriverC{}";
    }
}
