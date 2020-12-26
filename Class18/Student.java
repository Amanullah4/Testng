package Class18;

public class Student {
    String studentName;
    String studentID;
    static int numberOfStudent;
    //Create a Class called Students
    // Create three  variables  studentName , studentID  and  numberOfStudents
    // Create three objects of the Students Class
    // Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    // Print out  total number of students
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "Ahmad";
        student1.studentID = "234";
        student1.numberOfStudent++;

        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(student1.numberOfStudent);

        Student student2 = new Student();
        student2.studentName = "Ali";
        student2.studentID = "0000";
        student2.numberOfStudent++;

        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(student2.numberOfStudent);

        Student student3 = new Student();
        student3.studentName = "Jan";
        student3.studentID = "111";
        student3.numberOfStudent++;

        System.out.println(student3.studentName);
        System.out.println(student3.studentID);
        System.out.println(student3.numberOfStudent);
    }

}
