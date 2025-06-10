// declare interface
import java.util.Scanner;

interface Shape{
    double area();
    double perimeter();

}
//implement interface shape in a class called rectangle

class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public double area (){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
} 

public class Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth=sc.nextDouble();
        Rectangle r=new Rectangle(length, breadth);
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        sc .close();

    }
}
