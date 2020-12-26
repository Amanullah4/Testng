package class17;

public class Task3 {
    //3. Create class Student that will have a method getGrade. Your method should accept the score
    //of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    static char getGrade(int marks){
        char grade;
        if (marks>90 && marks<=110) {
            grade = 'A';
        }else if (marks>80) {
            grade = 'B';
        }else if (marks>70) {
            grade = 'C';
        }else if (marks>50) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println("task1.getGrade(90)"+getGrade(90));
        System.out.println("task1.getGrade(80)"+getGrade(80));
        System.out.println("task1.getGrade(101)"+getGrade(101));
        System.out.println("task1.getGrade(40)"+getGrade(40));
        System.out.println("task1.getGrade(70)"+getGrade(70));
        System.out.println("task1.getGrade(-1)"+getGrade(-1));





    }
}
