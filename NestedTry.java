//nested try (program to use try- catch)

import java.util.Scanner;
public class NestedTry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number : ");
            int num=sc.nextInt(); //exception may occur due to input mismatch
            try {
                int result=100/num;
                //mismatch Arithmetic Exception
                System.out.println("Result: "+result);
                try {
                    int[] arr=new int[5];
                    System.out.println("Accessing array elements "+arr[10]);
                    //array IndexOutofBounds Exception
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner most catch:"+e.getMessage());
                }
            } catch (ArithmeticException e) {
                System.out.println("Middle-catch : "+e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer-catch : Invalid input. Please enter a number...");
        }
    }
}
