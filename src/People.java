public class People {
    String name;
    int dateOfBirth;
    String city;
    String job;

    People(String name , int dateOfBirth , String city,String job){
        this.city = city;
        if(city == null){
            this.city="Информация не указана";
        }
        this.name=name;
        if(name == null){
            this.name="Информация не указана";
        }
        this.dateOfBirth = dateOfBirth;
        if(dateOfBirth<=0){
            this.dateOfBirth=0;
        }
        this.job=job;
        if(job==null){
            this.job="Информация не указана";
        }
    }


    void privet(){
        System.out.println("Привет! Меня зовут " + name + " . Я из города " + city + ". Я родился в " + dateOfBirth + " году.Будем знакомы!" );
    }

    void privetJob(){
        System.out.println("Привет! Меня зовут " + name + " . Я из города " + city + ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + job + ".Будем знакомы!" );
    }

}
