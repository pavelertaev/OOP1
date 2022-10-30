package transport;

public class DriverB implements DriverLicense{
    public boolean canDrive(Car car) {
        return (car.getClass()==Automobile.class);
    }



}
