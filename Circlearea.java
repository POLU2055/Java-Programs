import java.util.Scanner;
public class Circlearea{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius=sc.nextDouble();	
		System.out.printf("The area of given radius %.2f is : %.2f",radius,(Math.PI*radius*radius));//C Program reference by formatting the data
		sc.close();
		
}
}