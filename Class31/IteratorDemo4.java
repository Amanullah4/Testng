package Class31;

import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("NewYork");
        cities.add("SFo");
        cities.add("San Diago");
        System.out.println(cities);
        cities.removeIf(s -> s.endsWith("a"));

        }

    }



