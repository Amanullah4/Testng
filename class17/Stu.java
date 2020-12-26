package class17;
public class Stu {
    String schoolName;
    String studentbatch;
    int year;
    //Declare 3 instance variables to hold: year, school name and batch #
    //Access variables from the main method and assign specific values to t
    //Print values of your variables in the following format:
    //Expected Output:
    //I am a student of batch 6 studying at Syntax in the year of 2020

    public static void main(String[] args) {
        Stu student1 = new Stu();
        student1.schoolName = "Syntax ";
        student1.studentbatch = "6";
        student1.year = 2020;
        System.out.print("I am a student of batch " + student1.studentbatch);
        System.out.print(" studying at " + student1.schoolName);
        System.out.print(" in the year of "+ student1.year);
    }
    }
/*class Main {

    int batch;
    String schoolName;// reple slution;
    int year;

    public static void main(String[] args) {
        Main mm= new Main();
        mm.batch=6;
        mm.schoolName="Syntax";
        mm.year=2020;
        System.out.println("I am a student of batch "+mm.batch+
                " studying at "+mm.schoolName+" in the year of "+mm.year);
    }
}*/