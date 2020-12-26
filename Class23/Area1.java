package Class23;
public class Area1 {
    // Create 1 class in which create a method that will calculate the area of
    // Rectangle
    // Square
    //Use separate class to test your code
    static double getArea(double width){
       return width*width;
    }
    static double getArea(double height, double width){
        return height*width;
}
    public static void main(String[] args) {
        Area1 area1 = new Area1();
        System.out.println("Area of square"+ Area1.getArea(10));
        System.out.println("Area of square"+ Area1.getArea(10,20));
    }
    }