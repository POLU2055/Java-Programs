import java.util.Scanner;
public class Throw {
    static void checkAge(int age){
        if(age<22){
            throw new ArithmeticException("Access Denied.. - age proxy is +22");
        }
        else{
            System.out.println("Access Granted....");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
            
        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
