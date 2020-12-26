package Class30;

public class WrapperClasses {
    public static void main(String[] args) {
        //We have 8 permitive data types and for each permitive we have a wrapper class
        byte byteNumbers=120; //can store mac=x-120t0127
        short shortNumbers=1000;//can store uoto32767
        int number=10; //can store upto 2 million
        long longNumber=1189891919;
        double numbersWithDecimalPoints=10.9;
        char characters='A';
        boolean flags=true;

        String stringNumber="10";
        int convertedNumber=Integer.parseInt(stringNumber);
        System.out.println(convertedNumber*2);
        Byte nonPrimitiveNumber=127;
        short nonPrimitiveshortNumbers= 1000;//can store uoto32767
        int nonPrimitiveintNumbers=10; //can store upto 2 million
        long nonPrimitivelongNumbers=1189891919;
        double nonPrimitivedoubleNumbers=10.9;
        char nonPrimitiveNumbercharacters='A';
        boolean nonPrimitiveNumberflags=true;

        int primitiveInt=10;
        Integer nonPrimitiveInteger=primitiveInt;
        System.out.println(nonPrimitiveInteger.doubleValue());


    }
}
