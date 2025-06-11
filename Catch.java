import java.util.Scanner;
public class Catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number : ");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number : ");
            int b=sc.nextInt();
            int result= (a/b);
            System.out.println("The result of "+a+"/"+b+" is : "+result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception : DIVISION BY ZERO!!");
        }
        finally{
            sc.close();
        }
    }
}
