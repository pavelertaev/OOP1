package transport;

import java.time.LocalDate;

public class Automobile extends Transport {

    private double engineVolume;
    private String registerNumber;
    private String transmission;
    private String body;
    int numberOfSeat;
    String rubber;
    private Key key;
    private Insurance insurance;




    public void carInformation() {
        System.out.println(getBrand() + " " + getModel() + " " + getProductionYear() +
                " год выпуска , сборка " + getProductionCountry() + "," + getColor() +
                " цвет кузова , обьем двигателя - " + getEngineVolume() + " л." +
                "Регистрационный номер - " + getRegisterNumber() +  ".Коробка передач - " +
                getTransmission() + ".Кузов - " + getBody() + ".Количество мест - " + getNumberOfSeat() + ".Резина - " + getRubber() +
                ".Доступ - " + getKey() + ".Страховка -" + getInsurance());
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

    public Automobile(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,String refill, double engineVolume,  String registerNumber, String transmission,
                      String body, int numberOfSeat, String rubber,Key key,Insurance insurance) {
        super( brand,  model, productionYear,  productionCountry,  color , maxSpeed,refill);
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }

        this.registerNumber = registerNumber;
        if (registerNumber == null) {
            this.registerNumber = "х000хх000";
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
            this.numberOfSeat = 5;
        }
        this.rubber = rubber;
        if (key == null) {
            this.key = new Key();
        } else
            this.key = key;
        if (insurance == null) {
            this.insurance = new Insurance();
        } else
            this.insurance = insurance;


    }

    @Override
    public void toRefill() {
        System.out.println("Заправить бензином если двигатель бензиновый, дизелем если двигатель дизельный и электричеством если электрокар");
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
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
        private final boolean remoteKeyEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteKeyEngine, boolean withoutKeyAccess) {
            this.remoteKeyEngine = remoteKeyEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteKeyEngine() {
            return remoteKeyEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }
    public static class Insurance{
        private  final LocalDate expireDate;
        private final double cost;
        private final String number;


        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
           if(number==null){
               this.number="123456789";
           }else {
               this.number= number;
           }

        }
        public Insurance(){
            this(null,15_000,null);
        }
        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate(){
            if(expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber(){
            if(number.length()!=9){
                System.out.println("Номер страховки некоректный");
            }
        }

    }
}
