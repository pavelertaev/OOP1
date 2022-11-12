import transport.*;

import java.util.*;

public class Main {

    private static transport.Car Car;


    public static void main(String[] args) {
        System.out.println("Задание 1");
        Automobile audi = new Automobile("Ауди", "р8", 3.0, TypeBody.COUPE);
        Automobile porche = new Automobile("Порше", "911", 4.0, TypeBody.SEDAN);
        Automobile mercedes = new Automobile("Мерседес", "sls", 4.5, TypeBody.SEDAN);
        Automobile opel = new Automobile("Опель", "турбо", 3.4, TypeBody.SEDAN);

        Set<Automobile> cars = new HashSet<>();
        cars.add(audi);
        cars.add(porche);
        cars.add(mercedes);
        cars.add(opel);
        Iterator<Automobile> i=cars.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Bus paz = new Bus("Паз", "100", 5.0, Capacity.SMALL);
        Bus liaz = new Bus("Лиаз", "9", 4.0, Capacity.AVERAGE);
        Bus isuzu = new Bus("Исузу", "6", 3.8, Capacity.BIG);
        Bus volvo = new Bus("Вольво", "5", 5.0, Capacity.VERY_BIG);

        Set<Bus> buses = new HashSet<>();
        buses.add(liaz);
        buses.add(isuzu);
        buses.add(volvo);
        buses.add(paz);
        Iterator<Bus> a=buses.iterator();
        while(a.hasNext())
        {
            System.out.println(a.next());
        }

        Truck kamaz = new Truck("Камаз", "2", 7.0, Weight.N1);
        Truck belaz = new Truck("Белаз", "3", 18.0, Weight.N3);
        Truck zil = new Truck("Зил", "3", 8.0, Weight.N2);
        Truck bmw = new Truck("Бмв", "6", 8.0, Weight.N2);
        Set<Truck> trucks = new HashSet<>();
        trucks.add(kamaz);
        trucks.add(belaz);
        trucks.add(bmw);
        trucks.add(zil);
        Iterator<Truck> b=trucks.iterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }


        Driver<DriverB> sergei = new Driver<>("Сергей", new DriverB(), "5");
        Driver<DriverC> artem = new Driver<>("Артем", new DriverC(), "4");
        Driver<DriverD> pavel = new Driver<>("Павел", new DriverD(), "3");
        Set<Driver> drivers = new HashSet<>();
        drivers.add(sergei);
        drivers.add(artem);
        drivers.add(pavel);
        Iterator<Driver> c=drivers.iterator();
        while(c.hasNext())
        {
            System.out.println(c.next());
        }

        Mechanik<Automobile> michail = new Mechanik<>("Михаил", "Моторс");
        Mechanik<Truck> igor = new Mechanik<>("Игорь", "Мишлен");
        Mechanik<Bus> andrey = new Mechanik<>("Андрей", "Киа");
        Set<Mechanik> mechaniks = new HashSet<>();
        mechaniks.add(michail);
        mechaniks.add(igor);
        mechaniks.add(andrey);
        Iterator<Mechanik> d=mechaniks.iterator();
        while(d.hasNext())
        {
            System.out.println(d.next());
        }


        Sponsor gazprom = new Sponsor("Газпром", 100000);
        Sponsor lukoil = new Sponsor("Лукойл", 300000);
        Sponsor pirelli = new Sponsor("Пирелли", 200000);
        Set<Sponsor> sponsors = new HashSet<>();
        sponsors.add(gazprom);
        sponsors.add(lukoil);
        sponsors.add(pirelli);
        Iterator<Sponsor> v=sponsors.iterator();
        while(v.hasNext())
        {
            System.out.println(v.next());
        }



        audi.addDriver(sergei);
        audi.addMechanik(michail);
        audi.addSponsor(gazprom);
        paz.addDriver(artem);
        paz.addMechanik(igor);
        paz.addSponsor(lukoil);
        kamaz.addDriver(pavel);
        kamaz.addMechanik(andrey);
        kamaz.addSponsor(pirelli);







    }

    public static void printCar(Car car){
        System.out.println("Машины " + car.getBrand() + car.getModel());
        System.out.println("Водители " + car.getDrivers());
        System.out.println("Механики " + car.getMechaniks());
        System.out.println("Спонсоры " + car.getSponsors());
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







