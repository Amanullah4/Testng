package Class21;

public class MoonerClass extends ParentClass {
    void marry(){
        super.marry();// if we don't use super keyword we can only print our current class not parent class
        System.out.println(" i will marry katrina");
    }

    public static void main(String[] args) {
        MoonerClass moonerClass = new MoonerClass();
        moonerClass.marry();
    }
}
