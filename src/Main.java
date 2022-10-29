import transport.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Automobile audi = new Automobile("Ауди","р8",3.0);
        Automobile porche = new Automobile("Порше","911",4.0);
        Automobile mercedes = new Automobile("Мерседес","sls",4.5);
        Automobile opel = new Automobile("Опель","турбо",3.4);
        Bus paz = new Bus("Паз","100",5.0);
        Bus liaz = new Bus("Лиаз","9",4.0);
        Bus isuzu = new Bus("Исузу","6",3.8);
        Bus volvo = new Bus("Вольво","5",5.0);
        Truck kamaz = new Truck("Камаз","2",7.0);
        Truck belaz = new Truck("Белаз","3",18.0);
        Truck zil = new Truck("Зил","3",8.0);
        Truck bmw = new Truck("Бмв","6",8.0);

        Driver.DriverB<Automobile> sergei= new Driver.DriverB<>("Сергей");
        Driver.DriverC<Truck> artem= new Driver.DriverC<>("Артем");
        Driver.DriverD<Bus> pavel= new Driver.DriverD<>("Павел");

        System.out.println("Водитель - " + sergei.getName() + " ,управляет автомобилем - " + audi + " и будет учавствовать в заезде.");
        System.out.println("Водитель - " + artem.getName() + " ,управляет автомобилем - " + zil + " и будет учавствовать в заезде.");
        System.out.println("Водитель - " + pavel.getName() + " ,управляет автомобилем - " + paz + " и будет учавствовать в заезде.");

    }

}







