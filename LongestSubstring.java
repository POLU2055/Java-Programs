import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        
        int n=str.length();
        int [][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        for(int len=2;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if(str.charAt(i)==str.charAt(j)){
                    if(len==2){
                        dp[i][j]=2;
                    }else{
                        dp[i][j]=dp[i+1][j-1]+2;
                    }
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        int i=0,j=n-1;
        char[] lps=new char[dp[0][n-1]];
        int start=0, end=lps.length-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                lps[start]=str.charAt(i);
                lps[end]=str.charAt(j);
                i++;
                j--;
                start++;
                end--;

            }
            else if (dp[i+1][j]>dp[i][j-1])
            i++;
            else
            j--;
        }
        
        System.out.println("Length : "+dp[0][n-1]);
        System.out.println("Seq : "+new String(lps));
        sc.close();
    }
    
}