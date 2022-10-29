package transport;

public class Truck extends Driver implements Competing {
    private String brend;
    private String model;
    private double engineVolume;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        if(brend==null||brend.isBlank()||brend.isEmpty()){
            this.brend="Марка не указана";
        }else{
            this.brend=brend;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null||model.isBlank()||model.isEmpty()){
            this.brend="Модель не указана";
        }else{
            this.model=model;
        }

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume==0||engineVolume=='0'){
            this.engineVolume=0;
        }else {
            this.engineVolume = engineVolume;
        }

    }

    public Truck(String brend, String model, double engineVolume) {
        super("Сергей");
        this.brend = brend;
        if(brend==null||brend.isBlank()||brend.isEmpty()){
            this.brend="Марка не указана";
        }else{
            this.brend=brend;
        }
        this.model = model;
        if(model==null||model.isBlank()||model.isEmpty()){
            this.brend="Модель не указана";
        }else{
            this.model=model;
        }
        this.engineVolume = engineVolume;
        if(engineVolume==0||engineVolume=='0'){
            this.engineVolume=0;
        }else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Марка= '" + brend + '\'' +
                ", Модель= " + model + '\'' +
                ", Обьем двигателя= " + engineVolume +
                '}';
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
