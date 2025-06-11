import java.util.Scanner;
public class NegativeNumberThrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num<0){
            throw new ArithmeticException("Negative numbers are not allowed.");
        }
        else{
            System.out.println(" you have entered : "+num);
        }
        sc.close();

    }
}
