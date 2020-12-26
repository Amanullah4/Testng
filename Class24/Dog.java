package Class24;

public class Dog {
    void bark() {
        System.out.println("Dog is barking");
    }

    void sleep() {
        System.out.println("Dog is sleeping");
    }

    void eat() {
        System.out.println("Dog is eating");
    }
    void appearane(){
        System.out.println("I dont have any appearance I am gemeral dog class");
    }
}
class Cockapoo extends Dog{
    void appearnce(){
        System.out.println("I have long heirs");
    }
void sleep(){
    System.out.println("I sleep 16 hours");
}
}
class Chow extends Dog{
    void appearnce(){
        System.out.println("I have short teeth");
    }
    void special (){
        System.out.println("I love kids");
    }
    void hunt(){
        System.out.println("squirrels");
    }
}