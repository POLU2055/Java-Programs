import java.util.Scanner;
public class NaturalNumbers {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("Enter the number : ");
    int num=sc.nextInt();
    // for (int i = 1; i <=num; i++) {
    //     System.err.println(i);
    // }
// or

    int i=1;
    while(i<=num){
        System.err.println(i);
        i++;
    }
    sc.close();
}
}
