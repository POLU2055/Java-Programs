//Tight coupling 
import java.util.Scanner;
class DotMatrixPrinter{
    public void print(String content){
        System.out.println("Printing dot matrix : \n"+content);
    }

}
class PrintManager{
    DotMatrixPrinter printer = new DotMatrixPrinter();
    public void printDocument(String content){
        printer.print(content);
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a document content : ");
        String content=sc.nextLine();
        PrintManager manager=new PrintManager();
        manager.printDocument(content);
        sc.close();
    }
}
