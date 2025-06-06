import java.util.Scanner;

class Person{
    String name;
    void setName(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name from person superclass : "+name);
    }
}

class Student extends Person{
    int rollno;
    //super.destination(attribute)
    void setDetails(String name,int rollno){
        super.setName(name); // calling from super class method.
        this.rollno=rollno;
    }
    void display(){
        super.display();
        System.out.println("Roll number from student class "+rollno);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the student name : ");
        String name=sc.nextLine();
        System.out.println("Enter the roll number : ");
        int rollno=sc.nextInt();
        Student s=new Student();
        s.setDetails(name, rollno);
        s.display();
    } 
}
