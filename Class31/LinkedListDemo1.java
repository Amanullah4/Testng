package Class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("NewYork");
        cities.add("SFo");
        cities.add("San Diago");
        System.out.println(cities);
        Iterator<String> iterator = cities.iterator();
       while (iterator.hasNext()){
           if (iterator.next().endsWith("a")){
               iterator.remove();
           }
       }
        System.out.println(cities);
    }
}