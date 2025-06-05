// program to perform the operations using multilvel inheritance of pow and factorial of given values where the base class would be input of variables 
// and derived class1 and class 2 will be extended accordingly of pow and factorial
// a=5
// b=3
// power 5^3=125
// fact of 5=120
// fact of 3 = 6

import java.util.Scanner;

class InputNum{
    int a,b;
    void getInput(Scanner sc){
        System.out.print("Enter first number : ");
        a=sc.nextInt();
        System.out.print("Enter second number : ");
        b=sc.nextInt();

    }
}
class PowerCalc extends InputNum{
    void power(){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
      }
        System.out.println("Power ("+a+"^"+b+") : "+result);
    }
}

class Factorial extends PowerCalc{
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;
        return fact;
    }
    void showFactorial(){
        System.out.println("Factorial of "+a+ "is "+factorial(a)); // factorial function is called here
        System.out.println("Factorial of "+b+" is "+factorial(b));
    }
}

public class FactPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial obj = new Factorial();
        obj.getInput(sc);
        System.out.println();
        obj.power();
        obj.showFactorial();
        sc.close();
    }
}