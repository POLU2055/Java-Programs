
class MathOperations{
    //overload method
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class CompileTime_Method_Oveloading {
    public static void main(String[] args) {
        MathOperations mop=new MathOperations();
        System.out.println("Addition : "+mop.add(2,4));
        System.out.println("Addition : "+mop.add(2.2,5.6));
        System.out.println("Addition : "+mop.add(3,8,9));

    }
}
