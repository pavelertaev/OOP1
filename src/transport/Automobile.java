package transport;

public class Automobile extends Car implements Competing {

    public Automobile(String brand, String model, double engVolume) {
        super(brand, model, engVolume);
    }


    public void toRefuel(){
        System.out.println("Заправляюсь");
    }

    public void startMoving(){
        System.out.println("Начать движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Заканчиваю движение");
    }


    @Override
    public void toPitStop() {
        System.out.println(getModel() + "Захожу на пит-стоп");
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

