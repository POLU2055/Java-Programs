//program to implement multiple interfcaces
import java.util.Scanner;
interface Area{
    double calArea();
}
interface Perimeter{
    double calPerimeter();

}
//implements interface Area and Perimeter
class Rectangle implements Area,Perimeter{
    double length;
    double breadth;
    Rectangle (double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calArea(){
        return (length*breadth);
    }
    public double calPerimeter(){
        return (2*(length+breadth));
    }
}
public class Multiple_Interface {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length: ");
        double length=sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth=sc.nextDouble();
        Rectangle r= new Rectangle(length, breadth);
        System.out.println("Area : "+r.calArea());
        System.out.println("Perimeter : "+r.calPerimeter());
    }
}