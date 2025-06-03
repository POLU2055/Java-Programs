import java.util.Arrays;
import java.util.Scanner;
public class String_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] s=new String[5];
        System.out.print("Enter the elements : ");
        for(int i=0;i<s.length;i++)
        s[i]=sc.next();

        System.out.println("Before Sorting");
        for(String n : s){
            System.err.print(n+" ");
        }
        Arrays.sort(s);
        System.out.println("Afetr Sorting");
        for(String n : s){
            System.out.print(n+" ");

    }
}
}
