package transport;

import java.util.ArrayList;

public class Truck extends Car implements Competing {
    private Weight weightType;




    public Truck(String brand, String model, double engVolume, Weight weightType) {
        super(brand, model, engVolume);
        this.weightType=weightType;
    }
    public Weight getWeightType() {
        return weightType;
    }

    public void setWeightType(Weight weightType) {
        this.weightType = weightType;
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
    public void printType() {
        if(weightType==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            String from = weightType.getFrom() == null ? "" : " от " + weightType.getFrom() + " ";
            String to = weightType.getTo() == null ? " " : " до " + weightType.getTo() + " ";
            System.out.println("Грузоподьемность авто -  - " + from + to);
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weightType=" + weightType +
                "} " + super.toString();
    }

    @Override
    public boolean service() {
      return Math.random()>0.6;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + getModel() + " починен");
    }

}
