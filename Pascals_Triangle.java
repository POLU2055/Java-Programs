import java.util.Scanner;
public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=1;j<size-i;j++){
                System.out.print(" ");
            }
            int p=1;

            for(int j=0;j<=i;j++){
                System.out.print(p+" ");
                p=p*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
