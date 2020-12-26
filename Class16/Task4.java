package Class16;

import java.sql.SQLOutput;

public class Task4 {
    //4. Create a method that will say Hello in different language based on the country
    //that will passed when method is executed
    static void sayhello(String countryName){
        switch (countryName){
            case "USA":
                System.out.println("Hello");
                break;
            case "China":
                System.out.println("Ni Hoa");
                break;
            case "Turkey":
                System.out.println("Marhaba");
                break;


        }

    }
}



