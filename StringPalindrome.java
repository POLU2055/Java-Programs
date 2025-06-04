import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.next();
        
        //str=str.replaceAll("\\s", "").toLowerCase();
         String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//to remove all special characters and check for palindrome.
        int len=cleaned.length();
        boolean flag=true;
        for(int left=0,right=len-1;left<=len/2;left++,right--){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                flag=false;
            
            break;
            }

        }
        if(flag)
        System.out.println("The given string is palindrome.");
        else
        System.out.println("The given string is not a palindrome.");
    }
}
