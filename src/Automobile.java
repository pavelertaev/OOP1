public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;


     Automobile(String brand , String  model , double engineVolume , String color , int productionYear , String productionCountry){
        this.brand=brand;
        if(brand == null){
            this.brand ="default";
        }
        this.model=model;
         if(model == null) {
             this.model = "default";
         }
        this.engineVolume=engineVolume;
         if(engineVolume<=0){
             this.engineVolume=1.5;
         }
        this.color=color;
         if(color==null){
             this.color="белый";
         }
        this.productionYear=productionYear;
         if(productionYear<=0){
             this.productionYear=2000;
         }
        this.productionCountry=productionCountry;
        if(productionCountry==null){
            this.productionCountry= "default";
        }
    }
     void carInformation(){
         System.out.println(brand + " " + model + " " + productionYear + " год выпуска , сборка " + productionCountry + "," + color + " цвет кузова , обьем двигателя - " + engineVolume + " л." );
     }
}
