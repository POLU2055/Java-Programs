import java.util.Scanner;
class Findfactorial{
    int factorial(int n){
    
    int fact=1;
    for(int i=1;i<=n;i++)
    fact*=i;
    return fact;
  }

    long totalfact(int n){
        long super_fact=1;
        for (int i=1;i<=n;i++){
            super_fact*=factorial(i);
        }
        return super_fact;
    
    }


}


public class SuperFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        Findfactorial obj= new Findfactorial();
        System.out.println("The super factorial of given number is  : "+obj.totalfact(num));
        sc.close();
    }
}
