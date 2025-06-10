//extending interfaces similsr to classes
import java.util.Scanner;
interface BasicOperations{  //parent interface i.e base interface
    void add(int a,int b);
}
interface AdvanceOperations extends BasicOperations{    //child interface i.e derived interface from parent
    void product(int a,int b);
}
class Calculator{
    int a,b;
    public void add(int a,int b){
        System.out.println("Addition : "+(a+b));
    }
    public void product(int a,int b){
        System.out.println("Multiplication : "+(a*b));
    }
    
}
public class Extending_Interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a=sc.nextInt();
        System.out.println("Enter b value : ");
        int b=sc.nextInt();
        Calculator c=new Calculator();
        c.add(a, b);
        c.product(a, b);
    }
}
