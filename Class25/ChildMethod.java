package Class25;

public class ChildMethod extends finalmethod {
    @Override
    double add(double num1, double num2) {
        System.out.println("new code added to child class");
        return super.add(num1, num2);
    }
}
