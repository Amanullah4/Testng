package Class31;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double>doubleArrayList=new ArrayList<>();
        doubleArrayList.add(10.99);
        doubleArrayList.add(15.99);
        doubleArrayList.add(18.99);
        System.out.println("before replacement");
        System.out.println(doubleArrayList);
        //replace the value at specified index
        doubleArrayList.set(1,20.30);
        System.out.println("after replacement");
        System.out.println(doubleArrayList);
    }
}
