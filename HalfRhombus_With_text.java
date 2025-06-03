import java.util.Scanner;
public class HalfRhombus_With_text {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter the word : ");
    
        String text=sc.next();
        int len=text.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print(text.charAt(j)+" ");
            }
            System.out.println();
        }
        for(int i=len-1;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(text.charAt(j)+" ");
            }
            System.out.println();
        }
            System.out.println();
        }
    }


