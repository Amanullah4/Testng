package Class30;
import java.util.Arrays;
public class Collection {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Nabin";
        String name2 = "Qasim";
        // variable only can hold one value at a time
        // int initialSize=3;
        String[] names = new String[3];
        names[0] = "Ali";
        names[1] = "Nabin";
        names[2] = "qasim";
        //Arrays are fixed in size, but we can expand through the following method.
        System.out.println(names.length);
        names = expandArray(names);
        names[3] = "Jan";
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
    }
    public static String[] expandArray (String[]oldArray){
    String[]newArray = new String[oldArray.length*2];
    for (int i =0; i<oldArray.length; i++){
        newArray[i] = oldArray[i];
    }
    return newArray;

        }
    }
