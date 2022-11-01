package transport;

public enum TypeBody {
    SEDAN("Седан"),
    HATCHBACK("Хачбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    PICKUP("Пикап"),
    MINIVAN("Минивэн"),
    VAN("Фургон"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер");

    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    TypeBody(String body) {
        this.body = body;
    }
}
