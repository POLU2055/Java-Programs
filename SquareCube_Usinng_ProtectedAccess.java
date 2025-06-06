import java.util.Scanner;
class MathOperation{
    protected int n;
    protected void setNum(int n){
        this.n=n;
    }
    protected int Square(){
        return n*n;
    }
    protected int Cube(){
        return n*n*n;
    }
}
class Result extends MathOperation{
    protected void printResult(){
            System.out.println("Square  : "+Square());
            System.out.println("Cube  : "+Cube());
    }

}
public class SquareCube_Usinng_ProtectedAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Result res=new Result();
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("\n------Result------");
        res.setNum(num);
        res.printResult();
    }
}
