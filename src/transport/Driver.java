package transport;

  public class Driver <M extends DriverLicense> {
    private String name;
    M driverLicense;
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

    public Driver(String name, M driverLicense, String experience) {
        this.name = name;
        if(name==null||name.isEmpty()||name.isEmpty()){
            this.name="Водитель не указан";
        }else{
            this.name=name;
        }
        setDriverLicense(driverLicense);

        this.experience = experience;
        if(experience==null||experience.isEmpty()||experience.isEmpty()){
            this.experience="Водитель не указан";
        }else{
            this.experience=experience;
    }



    }

      public M getDriverLicense() {
          return driverLicense;
      }

      public void setDriverLicense(M driverLicense) {
         if(driverLicense==null){
             throw new RuntimeException("Нужно указать категорию прав");
         }else {
             this.driverLicense=driverLicense;
         }
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

      public void startMoving(Car car) {
          if (driverLicense.canDrive(car)) {
              car.startMoving();
          } else {
              System.out.println("Я не могу водоить "+car.getClass());
          }
      }

      public void finishMoving(Car car){
          if (driverLicense.canDrive(car)) {
              car.stopMoving();
          } else {
              System.out.println("Я не могу водить "+car.getClass());
          }
      }

      public void refuel(Car car){

          if (driverLicense.canDrive(car)) {
              System.out.println("Заправлюсь");
          } else {
              System.out.println("Я не могу водить "+car.getClass());
          }
      }


}
