//loose coupling
import java.util.Scanner;
//using abstraction interface
interface Printer{
    void print(String content);
}

//a concrete class for ijmplementation

class LaserPrinter implements Printer{
    public void print(String content){
        System.out.println("Laser Printer Output "+content);
    }
}
//anotehr concrete class for ijmplementation

class InkJetPrinter implements Printer{
    public void print(String content){
        System.out.println("InkJet Printer Output "+content);
    }
}
//manager using interface (abstract)

class PrintManager{
    Printer printer;
    public PrintManager(Printer printer){
        this.printer=printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
}
public class Loosecoupling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a documnet : ");
        String doc=sc.nextLine();
        System.out.println("Choose printer\n1.Laser\n2.InkJet");
        int choice=sc.nextInt();
        Printer printer;
        if(choice==1){
            printer=new LaserPrinter();

        }
        else
        printer=new InkJetPrinter();
       PrintManager manager = new PrintManager(printer);
        manager.printDocument(doc);

    }
    
}
