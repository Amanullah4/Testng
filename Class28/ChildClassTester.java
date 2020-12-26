package Class28;

public class ChildClassTester {
    public static void main(String[] args) {
        ChlldClass chlldClass = new ChlldClass();
        chlldClass.printInfo();
        MyInterface myInterface = new ChlldClass();
        myInterface.printInfo();
    }
}
