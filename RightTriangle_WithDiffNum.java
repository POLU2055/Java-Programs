import java.util.Scanner;
public class RightTriangle_WithDiffNum  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter the number of rows of the triangle : ");
    
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
