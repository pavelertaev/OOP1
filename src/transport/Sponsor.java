package transport;

public class Sponsor {
    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void addSpronsor(){
        System.out.println("Спонсирую заезд");
    }
}
