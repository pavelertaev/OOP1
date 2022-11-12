package transport;

public class DriverD implements DriverLicense{
    public boolean canDrive(Car car) {
        return (car.getClass()==Bus.class);
    }

    @Override
    public String toString() {
        return "DriverD{}";
    }
}
