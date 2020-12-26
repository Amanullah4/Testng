package Class25;

public class ComputerTester {
    public static void main(String[] args) {
        Cmputer[] allComputersInSingleVer ={new Apple("Apple"),new Lenovo("Lenovo"), new HP("Brand")
        };
        for ( Cmputer cmputer:allComputersInSingleVer){
            cmputer.run();
            cmputer.storage();
            cmputer.transfer();
        }
        Lenovo lenovo=new Lenovo("Lenovo");// through this we can print specialties of our diff classes.
        lenovo.tabletMode();
        Apple apple =new Apple("Apple");
        apple.secore();

    }
}