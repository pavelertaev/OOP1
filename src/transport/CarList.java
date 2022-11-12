package transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CarList  {
    private Set<Automobile> automobiles = new HashSet<>();

    public Set<Automobile> getAutomobiles() {
        return automobiles;
    }

    @Override
    public String toString() {
        return "CarList{" +
                "automobiles=" + automobiles +
                '}';
    }



    public void setAutomobiles(Set<Automobile> automobiles) {
        this.automobiles = automobiles;
    }
    public void addAutomobiles(Automobile automobile){
        if(automobiles.contains(automobile)){
            throw new RuntimeException("Автомобиль уже есть в списке");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarList carList = (CarList) o;
        return Objects.equals(automobiles, carList.automobiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automobiles);
    }
}
