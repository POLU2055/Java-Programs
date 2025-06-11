//illegal exceptions i.e used for own purpose
// program to raise an exception if a negative number is given as ip or a  number exceeds the given range.
import java.util.Scanner;
public class RaiseException {
    static void validateScore(int score){
        if(score<0 || score>100){
            throw new IllegalArgumentException(" Score is abouve range or below range. Range is 0-100");
        }
        else
        System.out.println("Valid Score  : "+score);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks : ");
        int score = sc.nextInt();
        try{
        validateScore(score);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
}
