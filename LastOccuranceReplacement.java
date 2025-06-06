// to replace the last occurance of a given word with the new word provided
import java.util.Scanner;
public class LastOccuranceReplacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        

        String s=sc.nextLine();
        System.out.print("Enter the string to be replaced : ");
        String key=sc.nextLine();
        System.out.print("Enter the new string : ");
        String new_Word=sc.nextLine();
        int last_Index=s.lastIndexOf(key);
        String after=s.substring(last_Index+key.length());
        String before=s.substring(0,last_Index);
        System.out.println(before+new_Word+after);
        sc.close();

    }
}