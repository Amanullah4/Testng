package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterater3 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList= new ArrayList<>();
        doubleArrayList.add(10.99);
        doubleArrayList.add(14.99);
        doubleArrayList.add(105.99);
        doubleArrayList.add(17.99);
        doubleArrayList.add(100.99);

        Iterator<Double> iterater=doubleArrayList.iterator();
        while (iterater.hasNext()){
            System.out.println(iterater.next());






        }
    }
}
