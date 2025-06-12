import java.util.*;
public class BasicTreeMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap <String,String> countryCapital = new TreeMap<>();
        System.out.println("Enter number of countries : ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter country name : ");
            String country=sc.nextLine();
            System.out.println("Enter capital name : ");
            String capital = sc.nextLine();
            countryCapital.put(country, capital);
        }
        for(Map.Entry<String,String> entry : countryCapital.entrySet()){
            System.out.println(entry.getKey() + " ==> "+entry.getValue());
        }
    }
}
