package Class31;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class HWTask1 {
    // Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {
            LinkedList<String> cities = new LinkedList<>();
            cities.add("Tajikistan");
            cities.add("Uzbikistan");
            cities.add("Afghanistan");
            cities.add("USA");
            cities.add("Maxico");
            System.out.println(cities);

            cities.addLast("Turkey");
            cities.add(3,"Tailand");
        Collections.sort(cities);
        Iterator iterator=cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


            System.out.println(cities);
    }
}
