// basic program for encapsulation using getters and setters
import java.util.Scanner;

public class Encapsulation {
//Encapsulate Student class using static
static class Student{
    private String name;
    private int age;
    private double  grade;
    //Constructor privately for Student class
    public Student(String name,int age,double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public String getName(){    //getters
        return name;
    }
     public int getAge(){
        return age;
    }
     public double  getGrade(){
        return grade;
    }
    public void setName(String name){   //setters 
        this.name=name;
    }
    public void setAge(int age){
        if(age>17)
        this.age=age;
        else
        System.out.println("Student is underage for graduation");
    }
    public void setGrade(double grade){
        if(grade>=0 && grade<=100)
        this.grade=grade;
        else
        System.out.println("Invalid grade");
    }


public void display(){
    System.out.println("----Student details----");
    System.out.println("Name : "+name+"\nAge : "+age+"\nGrade : "+grade);
}
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the studnet's name : ");
        String name=sc.nextLine();
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        System.out.println("Enter grade : ");
        double grade=sc.nextDouble();

        //object for student class
        Student stud=new Student(name, age, grade);

        //display student details intitially
        stud.display();

        //update values by setter values
        System.out.println("---Updating stduents data---");
        System.out.println("Enter new name : ");
         
        //clear the buffer before enetering the name by just using netxLine()
        sc.nextLine();
        String new_name=sc.nextLine();
        stud.setName(new_name);

        System.out.println("Enter new age : ");
        int new_age=sc.nextInt();
        stud.setAge(new_age);

        System.out.println("Enter new grade : ");
        double new_grade=sc.nextDouble();
        stud.setGrade(new_grade);
        stud.display();
        sc.close();
    }
}
