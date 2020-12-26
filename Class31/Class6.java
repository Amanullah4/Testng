package Class31;

import java.util.ArrayList;
import java.util.LinkedList;

public class Class6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=0; i<10000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("adding the element of the start of Arraylist");
        arrayList.add(0,100);
        System.out.println("adding the element of the start of Linkedlist");
        linkedList.addFirst(1000);
        System.out.println("Done");
    }
}
