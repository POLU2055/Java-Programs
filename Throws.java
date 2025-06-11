import java.io.IOException;
import java.util.Scanner;
public class Throws {
    static void readInput()throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any data : ");
        String input=sc.nextLine();
        System.out.println(" you have entered "+input);
        sc.close();
    }; // if we use throws then we have to use semicolon at the end.
    public static void main(String[] args) {
        try {
            readInput();
        } catch (IOException e) {
            System.out.println("Exception occured ");
        }
    }
}
