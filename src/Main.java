import transport.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Automobile audi = new Automobile("Ауди","р8",3.0,TypeBody.COUPE);
        Automobile porche = new Automobile("Порше","911",4.0,TypeBody.SEDAN);
        Automobile mercedes = new Automobile("Мерседес","sls",4.5,TypeBody.SEDAN);
        Automobile opel = new Automobile("Опель","турбо",3.4,TypeBody.SEDAN);
        Bus paz = new Bus("Паз","100",5.0,Capacity.SMALL);
        Bus liaz = new Bus("Лиаз","9",4.0,Capacity.AVERAGE);
        Bus isuzu = new Bus("Исузу","6",3.8,Capacity.BIG);
        Bus volvo = new Bus("Вольво","5",5.0,Capacity.VERY_BIG);
        Truck kamaz = new Truck("Камаз","2",7.0,Weight.N1);
        Truck belaz = new Truck("Белаз","3",18.0,Weight.N3);
        Truck zil = new Truck("Зил","3",8.0,Weight.N2);
        Truck bmw = new Truck("Бмв","6",8.0,Weight.N2);

        Driver<DriverB> sergei= new Driver<>("Сергей",new DriverB(),"5");
        Driver<DriverC> artem= new Driver<>("Артем",new DriverC(),"4");
        Driver<DriverD> pavel= new Driver<>("Павел",new DriverD(),"3");

        //System.out.println("Водитель - " + sergei.getName() + " ,управляет автомобилем - " + audi + " и будет учавствовать в заезде.");
        //System.out.println("Водитель - " + artem.getName() + " ,управляет автомобилем - " + zil + " и будет учавствовать в заезде.");
       // System.out.println("Водитель - " + pavel.getName() + " ,управляет автомобилем - " + paz + " и будет учавствовать в заезде.");

        //sergei.startMoving(audi);
        zil.service();
        audi.service();

       // zil.printType();
       // paz.printType();
        //opel.printType();
        service(audi,porche,mercedes,opel,paz,liaz,isuzu,volvo,kamaz,belaz,zil,bmw);
    }

    private static void service(Car...cars) {
        for (int i = 0; i < cars.length-1; i++) {
            if (!cars[i].service()) {
                try{
                throw new RuntimeException("Автомобиль " + cars[i].getBrand() + cars[i].getModel() + "не прошел диагностику");
            }catch (RuntimeException e ){
                    System.out.println(e.getMessage());
                }

            }

        }

    }


}







