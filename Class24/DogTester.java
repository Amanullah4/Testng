package Class24;
public class DogTester {
    public static void main(String[] args) {
        //all 4 methods can be accessed
        Dog dog = new Dog();
        dog.appearane();
        dog.bark();
        dog.eat();
        dog.sleep();
        dog = new Chow();
        dog.appearane();
       // dog =new Dog();
        dog.sleep();

        Chow chow = (Chow) dog;
        chow.special();chow.hunt();

    }
}
