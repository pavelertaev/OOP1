package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Automobile extends Car implements Competing {
    private TypeBody body;




    public Automobile(String brand, String model, double engVolume, TypeBody body) {
        super(brand, model, engVolume);
        this.body=body;
    }

    public TypeBody getBody() {
        return body;
    }

    public void setBody(TypeBody body) {
        this.body = body;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return body == that.body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
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
    public String toString() {
        return "Automobile{" +
                "body=" + body +
                "} " + super.toString();
    }

    @Override
    public void printType() {
        if(body==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Тип кузова авто - " + body);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + getModel() + " починена");
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

