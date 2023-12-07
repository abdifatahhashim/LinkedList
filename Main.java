package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
       // cars.clear();
       cars.remove();
       cars.addFirst("audio");
        cars.addLast("toyota");
        cars.getFirst();
        cars.getLast();
        cars.removeFirst();
        cars.removeLast();




        System.out.println("getting the 1st element: "+ cars.getFirst());
        System.out.println(cars);

    }
}

