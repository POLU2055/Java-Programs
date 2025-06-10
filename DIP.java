//Dependency inversion principle
import java.util.Scanner;

//Abstarction interface
interface MathOperation{
    int operate(int a,int b);
}
//1st low level module
class Addition implements MathOperation{
    public int operate(int a,int b){
        return a+b;
    }
}
//2nd low level module
class Multiplication implements MathOperation{
    public int operate(int a,int b){
        return a*b;
    }
}
//high level module based on abstract interface
class Calculator{
    private MathOperation operation;
    //connstructor
    public Calculator(MathOperation operation) {
        this.operation=operation;
    }
    public void calculateAndDisplay(int a, int b){
        int result=operation.operate(a, b);
        System.out.println("Result : "+result);
    }
    
}
public class DIP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        System.out.println("Enter b value : ");
        int b=sc.nextInt();
        System.out.println("Choose operation : \n1. Addition\n2. Multiplication");
        int choice = sc.nextInt();
        MathOperation operation;
        if(choice == 1)
        operation=new Addition();
        else
        operation=new Multiplication();
        Calculator c=new Calculator(operation);
        c.calculateAndDisplay(a, b);

    }
}
