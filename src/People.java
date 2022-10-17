public class People {
    String name;
    int dateOfBirth;
    String city;
    String job;

    People(String name , int dateOfBirth , String city,String job){
        this.city = city;
        this.name=name;
        this.dateOfBirth = dateOfBirth;
        this.job=job;
    }


    void privet(){
        System.out.println("Привет! Меня зовут " + name + " . Я из города " + city + ". Я родился в " + dateOfBirth + " году.Будем знакомы!" );
    }

    void privetJob(){
        System.out.println("Привет! Меня зовут " + name + " . Я из города " + city + ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + job + ".Будем знакомы!" );
    }

}
