import java.util.Scanner;
interface one{
    int add(int a,int b);
}
interface two{
    int multiply(int a, int b);
}
class Three implements one,two{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class MathOP_UsingMultipleInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Three obj=new Three();
        System.out.println("Enter the first number: ");
        int x=sc.nextInt();
        System.out.println("Enter the second number: ");
        int y=sc.nextInt();
        
        System.out.println("Addition : "+obj.add(x,y));
        System.out.println("Product : "+obj.multiply(x, y));
    }
}
