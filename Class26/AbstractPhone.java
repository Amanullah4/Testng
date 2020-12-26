package Class26;

abstract class AbstractPhone {
    public void makeCalls(){
        System.out.println("phone makes call");
    }
    public void sendText(){
        System.out.println("please send text");
    }
    public abstract void viewPicture();
    public abstract void unlock();
}
class Iphone extends AbstractPhone{
    @Override
    public void viewPicture() {
        System.out.println("we can checkout the photos using the photos app");
    }
    @Override
    public void unlock() {
        System.out.println("unlock with face");

    }
}
class Samsung extends AbstractPhone{
    @Override
    public void viewPicture() {
        System.out.println("to view pictures use the gallary app");
    }
    @Override
    public void unlock() {
        System.out.println("unlock using password");
    }
}