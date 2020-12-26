package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(10.99);
        doubleArrayList.add(15.99);
        doubleArrayList.add(20.99);
        doubleArrayList.add(100.99);
        doubleArrayList.add(12.99);
        doubleArrayList.add(104.99);
        System.out.println("Before removing");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator = doubleArrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next()<20){
                iterator.remove();
            }
        }
        System.out.println("After removing");
        System.out.println(doubleArrayList);
    }
}