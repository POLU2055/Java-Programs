import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        for(int num:arr){
            sum+=num;
        }
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}
