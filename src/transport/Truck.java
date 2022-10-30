package transport;

public class Truck extends Car implements Competing {
    public Truck(String brand, String model, double engVolume) {
        super(brand, model, engVolume);
    }
    public void toRefuel(){
        System.out.println("Заправляюсь");
    }
    public void startMoving(){
        System.out.println("Начать движение");
    }


    public void stopMoving(){
        System.out.println("Закончить движение");
    }

    @Override
    public void toPitStop() {
        System.out.println(getModel() +"Захожу на пит-стоп");
    }

    @Override
    public void toBestLapTime() {
        System.out.println(getModel() +"Показывает лучшее время круга");
    }

    @Override
    public void toMaxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
