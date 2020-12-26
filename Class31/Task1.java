package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    //Create an arrayList of even numbers from 1 to 50.
    // Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
        ArrayList<Integer> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(2);
        doubleArrayList.add(4);
        doubleArrayList.add(6);
        doubleArrayList.add(8);
        doubleArrayList.add(10);
        doubleArrayList.add(12);
        doubleArrayList.add(14);
        doubleArrayList.add(16);
        doubleArrayList.add(18);
        doubleArrayList.add(20);
        doubleArrayList.add(22);
        doubleArrayList.add(24);
        doubleArrayList.add(26);
        doubleArrayList.add(28);
        doubleArrayList.add(30);
        doubleArrayList.add(32);
        doubleArrayList.add(34);
        doubleArrayList.add(36);
        doubleArrayList.add(38);
        doubleArrayList.add(40);
        doubleArrayList.add(42);
        doubleArrayList.add(44);
        doubleArrayList.add(46);
        doubleArrayList.add(48);
        doubleArrayList.add(50);

        System.out.println("Before removing");
        System.out.println(doubleArrayList);

        Iterator<Integer> iterator = doubleArrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println("After removing");
        System.out.println(doubleArrayList);
    }
}

