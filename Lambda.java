import java.util.Scanner;
@FunctionalInterface
interface Operation{
    int compute(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the values of a and b");
    int x=sc.nextInt();
    int y=sc.nextInt();
    Operation add = (a,b) -> a+b;
    Operation sub = (a,b) -> a-b;
    Operation pro = (a,b) -> a*b;
    Operation div = (a,b) -> b!=0?a/b:0;
    System.out.println("Addition: "+add.compute(x,y));
    System.out.println("Subtraction: "+sub.compute(x,y));
        System.out.println("Product: "+pro.compute(x,y));
        System.out.println("Division: "+div.compute(x,y));
    }

}
