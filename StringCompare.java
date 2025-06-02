import java.util.Scanner;
public class StringCompare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1=sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2=sc.nextLine();
		System.out.println("The comparision result of two strings is : "+(str1.equals(str2)));
sc.close();
}
}