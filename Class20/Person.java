package Class20;

public class Person {
    String name;
    String Adress;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char maritalStatus;
    double height;
    double wejght;
    int numberOfkids;
    double salary;
    String education;
    Person(String name, int age, String phone, double salary) {
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    Person(String name, int age, String phone, double salary, String Adress, String SSN) {
     /*   this.age = age;
        this.phone = phone;
        this.salary = salary;*/
        this(name, age, phone, salary);//we can use this mithod to reduce our codes
        this.Adress = Adress;
        this.SSN = SSN;
    }
    Person(String name, int age, String phone, double salary, String Adress, String SSN, Double height, double wejght) {
        this(name, age, phone, salary, Adress,SSN);
        this.height = height;
        this.wejght = wejght;
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Person person = new Person("Ahamd", 23, "885885",80000.);
        Person person1 = new Person("Ali", 35, "878787",7777);

    }
    }
