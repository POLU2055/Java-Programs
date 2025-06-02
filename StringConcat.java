import java.util.Scanner;
public class StringConcat{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1=sc.nextLine();
		System.out.print("Enter the second string: ");
		String str2=sc.nextLine();
		//System.out.println("The conacatenated string is : "+(str1+str2));
		System.out.println("The concatenated String is : "+(str1.concat(str2)));
sc.close();
}
}