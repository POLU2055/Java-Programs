import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements : ");
        int size=sc.nextInt();
        String [] str=new String[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<size;i++)
        str[i]=sc.next();
        boolean found = false;
        System.out.print("Enter the string to search :  ");
        String search=sc.next();
        for(String s: str ){
            if(s.equalsIgnoreCase(search)){
                found = true;
                break;
            }
        }
        if(found)
        System.out.println("The element is found in the string array.");
        else
        System.out.println("The element is not found in the string array.");
    }
}
