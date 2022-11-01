package transport;

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
    public void printType() {
        if(body==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Тип кузова авто - " + body);
        }
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

