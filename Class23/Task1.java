package Class23;

public class Task1 {
    //
    //Create a class named 'Task1'. While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages"
    // should be printed. If some String is passed to it, then in place of
    // "programming languages" the value variable should be printed. Example,
    // if we pass "Java", then "I love Java" should be printed.
    public Task1() {
        System.out.println("I love programming languages");
    }
    public Task1(String var){
        System.out.println("I love " +var);
    }
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1 task2 = new Task1("Java");
    }
}
