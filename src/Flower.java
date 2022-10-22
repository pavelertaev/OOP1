public class Flower {
   private String flowerColor;
   private String country;
   private double cost;
   int lifeSpan;

   public void flowerInformation(){
       System.out.println("Цветок- " + flowerColor + " , страна- " + country +  ", стоимость штуки- " + cost + " рублей , срок стояния- " + lifeSpan );
   }

   Flower(String flowerColor,String country,double cost,int lifeSpan){
       this.flowerColor=flowerColor;
       if(flowerColor == null){
           this.flowerColor="белый";
       }
       this.country=country;
       if(country == null){
           this.country="Россия";
       }
       this.cost=cost;
       if(cost <=0) {
           this.cost = 1;
       }
       this.lifeSpan=lifeSpan;
       if(lifeSpan<=0){
           this.lifeSpan=3;
       }
   }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor != null && flowerColor.isEmpty()){
            this.flowerColor = flowerColor;
        }else
         this.flowerColor="белый";
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >0 && cost !=' ') {
           this.cost = cost;
        }else
         this.cost = 1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null && country.isEmpty()){
            this.country = country;
        }else
            this.country="Россия";
    }
}
