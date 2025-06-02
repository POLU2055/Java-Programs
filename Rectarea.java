import java.util.Scanner;
public class Rectarea{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter length: ");
	int length=sc.nextInt();
	System.out.println("Enter breadth: ");
	int breadth=sc.nextInt();
	System.out.printf("The area of rectangle with length : %d and breadth: %d is %d.",length,breadth,(length*breadth));
	sc.close();
}
}