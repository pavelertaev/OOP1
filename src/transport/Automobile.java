package transport;

public class Automobile {
    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String registerNumber;
    String transmission;
    private String body;
    int numberOfSeat;
    String rubber;




    public void carInformation() {
        System.out.println(brand + " " + model + " " + productionYear + " год выпуска , сборка " + productionCountry + "," + color + " цвет кузова , обьем двигателя - " + engineVolume + " л.");
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String registerNumber, String transmission, String body, int numberOfSeat, String rubber) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
        this.registerNumber = registerNumber;
        if (registerNumber == null){
            this.registerNumber="х000хх000";
        }
        this.transmission = transmission;
        if (transmission == null) {
            this.transmission = "default";
        }
        this.body = body;
        if (body == null) {
            this.body = "default";
        }
        this.numberOfSeat = numberOfSeat;
        if (numberOfSeat <= 0) {
            this.numberOfSeat =5;
        }
        this.rubber = rubber;


    }

    public String getProductionCountry() {
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public int getProductionYear() {
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        if (color == null) {
            this.color = "белый";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "default";
        }
        this.model = model;
    }

    public String getBrand() {
        if (brand == null) {
            this.brand = "default";
        }
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public boolean isCorrectRegisterNumber(){
        if(registerNumber.length()!=9){
            return false;
        }
        char [] chars = registerNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars [3])){
            return false;
        }
        if(!Character.isAlphabetic(chars[4]) ||!Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars [8])){
            return false;
        }
        return true;
    }

    public static class Key{
       // private final boolean remoteKeyEngine;
        //private final boolean withoutKeyAccess;

    }

}
