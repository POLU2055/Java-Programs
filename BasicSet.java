import java.util.*;
public class BasicSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String>cities=new HashSet<>();
        System.out.println("Enter no of cities: ");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter city "+(i+1)+" : ");
            String city=sc.nextLine();
            cities.add(city);   //duplicate elements are ignored
        }
        System.out.println("-----Unique Cities-----");
        for(String city : cities)
        System.out.println(city);
    }
}
