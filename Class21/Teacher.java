package Class21;

public class Teacher {
    //Write a Java program called Teacher.
    //Identify features and behaviour of that
    //Class. Create 3 subclasses MathTeacher,
    //ChemistryTeacher and PianoTeacher that
    //would have it their own features and
    //behaviour. Test all 4 classes
    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;
    Teacher(String name, int experience, String degree, String subject){
        this.name = name;
        this.experience = experience;
        this.education = education;
        this.subject = subject;
    }
    Teacher(String name, int experience, String degree, String subject,String education){
    this(name, experience, degree, subject);
    this.salary = salary;
    this.education = education;
    }
    void print(){
        System.out.println("The teacher" + name + "has" + experience + degree+subject);
    }
}
