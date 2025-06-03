import java.util.Scanner;
public class LongestString {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements : ");
        int size=sc.nextInt();
        String [] str=new String[size];
        System.out.print("Enter the elements : ");
        for(int i=0;i<size;i++)
        str[i]=sc.next();
        String temp="";
        int longest=0;
        for(String s:str){
            if(s.length()>longest){
            longest=s.length();
            temp=s;
        }
        }
        System.out.println("Longest String is  : "+temp);
}
}
