import java.util.Scanner;
public class HollowSquare  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter the number of rows of the triangle : ");
    
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1 || i==size ||j==1 || j==size )
                System.err.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
