package Class23;
class bank{
    double bankBalance;
    public bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    void printTransferFee(){
        System.out.println("Transfer fee "+bankBalance*0.1);
    }
}
class BOA extends bank {
    public BOA(double bankBalance){
        super(bankBalance);
    }
}
class Chase extends bank {
    public Chase(double bankBalance) {
        super(bankBalance);
    }
    void printTransferFee(){
        System.out.println("Transfer fee " +bankBalance * 0.01);
    }
}
public class OverRidding {
    public static void main(String[] args) {
        Chase chase =new Chase(1000);
        chase.printTransferFee();
        BOA bda = new BOA(1000);
        bda.printTransferFee();
    }
}
