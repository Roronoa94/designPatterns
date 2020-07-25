package iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Avenger");
        repo.addBike("Royal Bullet");
        repo.addBike("Pulsar");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for (String bike :  repo) {
            System.out.println(bike);
        }

        System.out.println(repo.bikes.length);
    }
}
