import java.util.Scanner;
public class Square_WithSameNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	sc.close();

	}
}