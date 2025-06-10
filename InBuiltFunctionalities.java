import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//if the number is even we print its square...
public class InBuiltFunctionalities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        Function<Integer,Integer>square= (n)->n*n;
        Predicate<Integer>isEven=(n)->n%2==0;
        Consumer<Integer>display=(n)->System.out.println("Result"+n);
        if(isEven.test(num)){
            int result= square.apply(num);
            display.accept(result);
        }
        else{
            System.out.println("Enter even number");
        }
    }
}
