import java.util.Scanner;
public class HalfRhombus  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter the number of rows of the triangle : ");
    
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=size-1;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();
        }
    }

