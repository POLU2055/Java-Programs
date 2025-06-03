import java.util.Scanner;
public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        int k=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++k +" ");
            }
            System.out.println();
        }
    }
}
