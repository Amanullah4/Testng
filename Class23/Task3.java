package Class23;

public class Task3 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private static void print() {
        System.out.println("I am a private method, you can also overload me I have no parameter ");
    }
    private static void print(int var) {
        System.out.println("I am a private method, you can also overload me I have one parameter ");
    }
    private static void print(String var) {
        System.out.println("I am a private method, you can also overload me I have one parameter");
    }
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task3.print();
        Task3.print(19);
        Task3.print("NAME");
    }
}