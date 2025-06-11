import java.util.Scanner;
public class TryBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            
            System.out.println("Enter the number : ");
            int num=sc.nextInt();
            System.out.println("You entered  "+num);
        } finally{
                sc.close();
        }
    }
}
