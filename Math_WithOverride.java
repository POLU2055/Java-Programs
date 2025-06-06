// num1=4,num2=5   sum(parent)=9  product (child)=20

import java.util.Scanner;

class Sum{
    int a,b;
    void setValues(int a,int b){
        this.a=a;
        this.b=b;
    }
    void calculate(){
        System.out.println("The sum is  : "+(a+b));
    }
}
class Product extends Sum{
    @Override
    void calculate(){
        System.out.println("The product is  : "+(a*b));
    }
}

public class Math_WithOverride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a value : ");
        int a=sc.nextInt();
        System.out.println("Enter b value : ");
        int b=sc.nextInt();
        Sum s=new Sum();
        s.setValues(a, b);
        s.calculate();

        Product p=new Product();
        p.setValues(a, b);
        p.calculate();

    }
}
