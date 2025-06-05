
import java.util.Scanner;

class Student{
    String name;
    int marks;

    Student (String n,int a){
        name=n;
        marks=a;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student name : ");
        String name=sc.nextLine();
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        Student s = new Student(name,marks);
        s.display();
        sc.close();
    }
}
