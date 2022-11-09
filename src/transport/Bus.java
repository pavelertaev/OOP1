package transport;

import java.util.ArrayList;

public class Bus extends Car implements Competing {
    private Capacity seat;




    public Bus(String brand, String model, double engVolume, Capacity seat) {
        super(brand, model, engVolume);
        this.seat= seat;
    }
    public Capacity getSeat() {
        return seat;
    }

    public void setSeat(Capacity seat) {
        this.seat = seat;
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
        System.out.println( getModel() + "Захожу на пит-стоп");
    }

    @Override
    public void toBestLapTime() {
        System.out.println( getModel() +"Показывает лучшее время круга");
    }

    @Override
    public void toMaxSpeed() {
        System.out.println("Максимальная скорость");

    }



    public void printType() {
        if(seat==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Вместимость автобуса от - " + seat.getFrom() + " до " + seat.getTo() );
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус" + getBrand() + getModel() + "диагностику не проходит");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + getModel() + " починен");
    }

}

