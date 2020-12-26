package Class20;
public class Task4 {
    // Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
       String name;
       String address;
       Task4(String name,String address) {
           this.name = name;
           this.address = address;
       }
        void displayInfo(){
            System.out.println(name+" ");
            System.out.println(address+" ");
        }

    public static void main(String[] args) {
        Task4 studentA = new Task4("Ali", "4566 kabul");
        studentA.displayInfo();
        Task4 studentB = new Task4("Khan", "776 llkj");
        studentB.displayInfo();
    }

    }

