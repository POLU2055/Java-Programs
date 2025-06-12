import java.util.*;
public class BasicLinkedSet {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> fruits = new LinkedHashSet<>();
        System.out.println("Enter  the number of fruits : ");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter fruit "+(i+1)+" : ");
            String fruit=sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\nUnique fruits : ");
        for(String fruit : fruits)
        System.out.println(fruit);
    }
}
