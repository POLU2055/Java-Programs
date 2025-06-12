import java.util.*;
public class StacksCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> books = new Stack<>();
        System.out.println("How many books you want to enter : ");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter book "+(i+1)+" : ");
            books.push(sc.nextLine());
        }// show the stack
        System.out.println("----- Books in stack , top to bottom ----\n"+books);
        if(!books.isEmpty())
        System.out.println("Top book : "+books.peek());
        System.out.println( "Removing book : " + books.pop() );
        System.out.println("Stack afetr pop : \n"+books);
        sc.close();

    }
}
