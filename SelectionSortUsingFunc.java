import java.util.Scanner;
public class SelectionSortUsingFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        ss(arr);
        System.out.println("The sorted array is  : ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+ " ");
    }
    static void ss(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex])
                minIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
