package transport;

public class Driver <B extends Automobile , C extends Truck , D extends Bus> {
    private String name;
    private boolean driverLicense;
    private String experience;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isEmpty()) {
            this.name = "Водитель не указан";
        } else {
            this.name = name;
        }
    }

    public Driver(String сергей) {
        this.name = name;
        if(name==null||name.isEmpty()||name.isEmpty()){
            this.name="Водитель не указан";
        }else{
            this.name=name;
        }
    }

    public Driver(String name, boolean driverLicense, String experience) {
        this.name = name;
        if(name==null||name.isEmpty()||name.isEmpty()){
            this.name="Водитель не указан";
        }else{
            this.name=name;
        }
        this.driverLicense = driverLicense;

        this.experience = experience;
        if(experience==null||experience.isEmpty()||experience.isEmpty()){
            this.experience="Водитель не указан";
        }else{
            this.experience=experience;
    }



    }

    public boolean isDriverLicense() {
        return true;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = true;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        if(name==null||name.isEmpty()||name.isEmpty()){
            this.name="Водитель не указан";
        }else{
            this.name=name;
        }

    }

    public void toStartMoving(){
        System.out.println("Начинаю движение");
    }
    public void toStop(){
        System.out.println("Заканчиваю движение");
    }
    public void toRefuel(){
        System.out.println("Заправляюсь");
    }

    public static class DriverB <B extends Automobile>{
        private String name;

        public DriverB(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static class DriverC <C extends Truck>{
        private String name;

        public DriverC(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static class DriverD <D extends Bus>{
        private String name;

        public DriverD(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
