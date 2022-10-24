package transport;

public class Train extends Transport{
    private int tripPrice;
    private int travelTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWagons;


    public int getTripPrice() {
        if(tripPrice!=0){
            this.tripPrice=tripPrice;
        }
        return tripPrice;
    }

    public int getTravelTime() {
        if(travelTime!=0){
            this.travelTime=travelTime;
        }
        return travelTime;
    }

    public String getDepartureStation() {
        if(departureStation!=null){
            this.departureStation=departureStation;
        }
        return departureStation;
    }

    public String getEndingStation() {
        if(endingStation!=null){
            this.endingStation=endingStation;
        }
        return endingStation;
    }

    public int getNumberOfWagons() {
        if(numberOfWagons!=0){
            this.numberOfWagons=numberOfWagons;
        }
        return numberOfWagons;
    }

    public void setTripPrice(int tripPrice) {
        if(tripPrice!=0){
            this.tripPrice=tripPrice;
        }
        this.tripPrice = 0;
    }

    public void setTravelTime(int travelTime) {
        if(travelTime!=0){
            this.travelTime=travelTime;
        }
        this.travelTime = 0;
    }

    public void setDepartureStation(String departureStation) {
        if(departureStation!=null){
            this.departureStation=departureStation;
        }
        this.departureStation = "Станция не указана";
    }

    public void setEndingStation(String endingStation) {
        if(endingStation!=null){
            this.endingStation=endingStation;
        }
        this.endingStation ="Станция не указана";
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if(numberOfWagons!=0){
            this.numberOfWagons=numberOfWagons;
        }
        this.numberOfWagons = 0;
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color,int maxSpeed,String refill,
                 int tripPrice, int travelTime, String departureStation, String endingStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color , maxSpeed,refill );
        this.tripPrice = tripPrice;
        if(tripPrice!=0){
            this.tripPrice=tripPrice;
        }
        this.travelTime = travelTime;
        if(travelTime!=0){
            this.travelTime=travelTime;
        }
        this.departureStation = departureStation;
        if(departureStation!=null){
            this.departureStation=departureStation;
        }
        this.endingStation = endingStation;
        if(endingStation!=null){
            this.endingStation=endingStation;
        }
        this.numberOfWagons = numberOfWagons;
        if(numberOfWagons!=0){
            this.numberOfWagons=numberOfWagons;
        }


    }

    @Override
    public void toRefill() {
        System.out.println("Заправить дизелем");
    }

    public void printTrain(){
        System.out.println(".Поезд - " + getBrand() + ".Модель -" + getModel() + ".Год выпуска-" + getProductionYear() + ".Страна - " + getProductionCountry() + ".Максимальная скорость-" + getMaxSpeed()
                + ".Станция отправления -" + getDepartureStation() + ".Станция прибытия - " + getEndingStation() + ".Цена поездки - " + getTripPrice() + ".Кол-во вагонов - " + getNumberOfWagons());
    }

}
