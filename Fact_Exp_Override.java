
import java.util.Scanner;
class Factorial{
    int f;
    void getInput(int f){
        this.f=f;

    }
    void calculate(){
        int p=1;
        for(int i=1;i<=f;i++){
            p*=i;
        }
        System.out.println("Factorial of "+f+" is : "+p);

    }
}
class Exponent extends Factorial{
    int b;
    int e;
    void Input(int b,int e){
        this.b=b;this.e=e;
    }
    @Override
    void calculate(){
int result=1;
for (int i=1;i<=e;i++){
            result=result*b;
        }
        System.err.println("Result of ("+b+" ^ "+e+") is "+result);

    }
}
public class Fact_Exp_Override {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to find factorial : ");
        int n=sc.nextInt();
        
        Factorial f=new Factorial();
        f.getInput(n);
        f.calculate();

        System.out.println("Enter base : ");
        int b=sc.nextInt();
        System.out.println("Enter exponent : ");
        int e=sc.nextInt();

        Exponent ex=new Exponent();
        ex.Input(b,e);
        ex.calculate();
    }
}
