import java.util.Scanner;
public class PancakeSort {
    
    static void flip(int[] array,int key){
        int left=0,right=key;
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
    }
    static int  findMaxIndex(int [] array,int n){
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(array[i]>array[maxIndex])
            maxIndex=i;
        }
        return maxIndex;
    }
    static void pancakesort(int[] array,int n){
            for(int size=n;size>1;size--){
                int maxIndex=findMaxIndex(array, size);
                if(maxIndex!=size-1){
                    if(maxIndex>0)
                    flip(array, maxIndex);
                    flip(array, size-1);
                }
            }
    }
    static void printarray(int [] arr){
        for(int num:arr)
        System.out.print(num+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        pancakesort(arr, size);
        System.out.println("Sorted array : ");
        printarray(arr);
        sc.close();
    }
}


