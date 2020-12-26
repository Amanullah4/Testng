package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("cofee");
        drinks.add("milk");
        drinks.add("soda");
        drinks.add("vodka");
        drinks.add("scotch");

        Iterator<String>iterator=drinks.iterator();
        while (iterator.hasNext()){
        String next = iterator.next();// to replace acurances press alt+enter
        if (next.equals("scotch")|| next.equals("vodka")){
            iterator.remove();
        }
    }
        System.out.println(drinks);
}
}