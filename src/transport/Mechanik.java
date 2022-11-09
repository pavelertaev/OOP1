package transport;

public class Mechanik<T extends Car> {
    private String name;
    private String company;

    public Mechanik(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
    public boolean service(T t){
       return t.service();
    }

    @Override
    public String toString() {
        return "Mechanik{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void repair(T t){
        t.repair();
    }
}
