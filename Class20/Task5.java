package Class20;

public class Task5 {
    // Write program as a Book class   that will have instance variables
    // and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String title;
    int pages;
    char bestseller;
    String author;
    Task5(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    Task5(String title, String author, int pages, char bestseller) {
        this(title, author, pages);
        this.pages = pages;
    }
     void Print(){
         System.out.println(title+"by"+author+"has"+pages+"Pages"+bestseller);
     }

    public static void main(String[] args) {
        Task5 task5 = new Task5("Mall ", "Jan ", 77, 'y');
    task5.Print();
    }
}
