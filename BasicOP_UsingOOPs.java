import java.util.Scanner;
class Arithmetic{
    void perform(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition is : "+(a+b));
        System.out.println("The subtraction is : "+(a-b));
        System.out.println("The product is : "+(a*b));
        System.out.println("The division result is : "+(a/b));
        sc.close();
    }
}
public class BasicOP_UsingOOPs {
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        obj.perform();
    }
}
