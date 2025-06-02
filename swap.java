import java.util.*;

public class swap
{
	public static void main(String[] args) {
	    int a,b;
	    Scanner in =new Scanner(System.in);
	    System.out.println("Enter the value of a: ");
	    a=in.nextInt();
	    System.out.println("Enter the value of b: ");
	    b=in.nextInt();
	    System.out.println("The numbers before Swapping "+a +" and "+b);
	    a=a^b;
	    b=a^b;
	    a=a^b;
	    System.out.println("The numbers after Swapping "+a +" and "+b);
		
	}
}