import java.util.Scanner;
import java.util.Vector;
public class VectorsCollections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> numbers =new Vector<>();
        System.out.println("How many members do you want to enter : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter number "+(i+1)+" ");
            numbers.add(sc.nextInt());
        }
        //sum and average
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        double avg = (n>0)? (double)sum/n : 0;
        System.out.println("\nNumbers entered : "+numbers);
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);
        sc.close();
    }
}