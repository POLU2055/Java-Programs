import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a String : ");
            String input=sc.nextLine();
            int number = Integer.parseInt(input);
            //NumberForamtException
            System.out.println("Parsed number: "+number);
            int [] values={10,20,30,40};
            System.out.println("Enter an index to access from 0-3");
            int index = sc.nextInt();
            //InputMismatch exception
            System.out.println("Value at index "+index+" is "+values[index]);
        } catch(NumberFormatException e){
            System.out.println("Caught Number Foramt Exception : input is wrong");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBOundsException : index out of range.");
        }catch(InputMismatchException e){
            System.out.println("Caught InputMismatch Exception");
        }
        catch (Exception e){
            System.out.println("caught general exception: "+e.getMessage());
        }
        System.out.println("End of calling catches.");
    }
}
