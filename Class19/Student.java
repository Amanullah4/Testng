package Class19;

public class Student {
    //2 Write a java program of Class Students that takes students name
    // and 3 subject grades. Inside your class also have a method to Calculate
    // Average Grade. Test Student class for 5 different students with different
    // marks. Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.
      String name;
      double subject1;
      double subject2;
      double subject3;

    Student(String nameValue,double subject1Value,double subject2Value,double subject3Value){
        name = nameValue;
        subject1 = subject1Value;
        subject2 = subject2Value;
        subject3 = subject3Value;

    }
    void printGradeAverage(){
        double avg=(subject1+subject2+subject3) /3;
        System.out.println("Average marks for " + name+ " are "+avg);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ali",89,88,78);
        student1.printGradeAverage();
        Student student2 = new Student("Ahmad",56,78,90);
        student2.printGradeAverage();
        Student student3 = new Student("Jan",100, 100, 90);
        student3.printGradeAverage();
        Student student4 = new Student("Karim", 56, 100, 100);
        student4.printGradeAverage();
        Student student5 = new Student("Zabi", 80, 90, 100);
        student5.printGradeAverage();
    }
}
