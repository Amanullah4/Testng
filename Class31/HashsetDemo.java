package Class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> LinkedHasSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("KIVI");
        System.out.println(hashSet);//no dublicate will be printed
    }
}
