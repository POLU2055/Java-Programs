import java.util.Scanner;
public class Square_WithDiffNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int size = sc.nextInt();
		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	sc.close();

	}
}