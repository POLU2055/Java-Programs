import java.util.Scanner;
public class NumerOf_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.next();
        int count=0;
        int len=str.length();
        System.out.println("Palindrome subsequences : ");
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++)
            {
                String sub=str.substring(i,j);//checks each substring from index 1
                if(isPalindrome(sub)){
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("Total palindrome substrings : "+count);
        sc.close();

    }
    public static  boolean isPalindrome(String s){
            int left=0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
}
    