import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Before Sorting");
        for(int num:arr){
            System.err.print(num+" ");
        }
        Arrays.sort(arr);
        System.out.println("Afetr Sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
