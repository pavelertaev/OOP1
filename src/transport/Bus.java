package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color , int maxSpeed,String refill) {
        super(brand, model, productionYear, productionCountry, color , maxSpeed,refill);
    }

    @Override
    public void toRefill() {
        System.out.println("Заправить бензином либо дизелем");
    }

    public void printBus(){
        System.out.println("Бренд- " + getBrand() + ".Модель-" + getModel() + ".Год выпуска-" + getProductionYear() +
                ".Страна выпуска-" + getProductionCountry() + ".Цвет-" + getColor() + ".Максимальня скорость-" + getMaxSpeed());
    }
}

