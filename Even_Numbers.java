import java.util.Scanner;
public class Even_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i<=10){
            if(i%2==0)
                System.err.println(i);
            i++;
        }
        sc.close();
    }
}
