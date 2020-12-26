package Class16;

public class callas {
    public static void printLarger(int num1, int num2) {
        //1. Create a method that will take 2
        //parameters as a numbers and prints which
        //number is larger

        if (num1 > num2) {
            System.out.println(num1 + "is lagrger ");
        } else if (num2 > num1) {
            System.out.println(num2 + "is lagrger ");
        } else {
            System.out.println("equal");

        }
    }
}