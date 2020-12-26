package Class31;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("NewYork");
        cities.add("SFo");
        cities.add("San Diago");
        System.out.println(cities);

        cities.addFirst("Istanbul");
        cities.addLast("Macow");
        cities.add(3,"Tashkand");


        System.out.println(cities);

    }
}