import java.util.Scanner;
public class MathTable {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num +" * "+i+" = "+num*i);
            i=i+1;
        }
        in.close();
    }
}
