public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;


     Automobile(String brand , String  model , double engineVolume , String color , int productionYear , String productionCountry){
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        this.productionCountry=productionCountry;
    }
     void carInformation(){
         System.out.println(brand + " " + model + " " + productionYear + " год выпуска , сборка " + productionCountry + "," + color + " цвет кузова , обьем двигателя - " + engineVolume + " л." );
     }
}
