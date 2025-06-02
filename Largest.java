import java.util.Scanner;
public class Largest{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nex tInt();
		System.out.print("Enter second number : ");
		int b=sc.nextInt();
		System.out.println("The largest number is : "+((a>b)?a:b));
		sc.close();
}
}