import java.util.Scanner;
public class Finally {
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
            System.out.println("Exception Occured");
        }
        finally{
            System.out.println("This block always executes irrespective of the exception occured.");// first this comes next if unhandled exception comes then that will be printed.
            //If exception is handled then that will be executed before finally block.
            sc.close();
        }
    }
}
