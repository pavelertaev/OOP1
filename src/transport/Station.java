package transport;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Station <M extends Car>{
    private Queue<M> queue = new LinkedList<>();
    private String company;

    public Station(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void addStation(M car){
        queue.offer(car);
    }

    public void spendStation(){
        M car=queue.poll();
        if(car!=null){
            System.out.println("Автомобиль " + car + " прошел тех осмотр");
            spendStation();
        }else{
            System.out.println("Больше автомобилей на тех осмотр нет");
        }
    }

}
