import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> fruits = new ArrayList<>();
        System.out.println("How many Fruits do you want : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter fruit "+(i+1)+" ");   //adding into the array list
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\n------Fruits Lsit---------\n\n"+fruits);
        System.out.println("Enter index value : "+(n+1)+" ");   //checking for index
        int index = sc.nextInt();
        if(index>=0 && index<fruits.size()){
        System.out.println("Fruit at index "+index+ " : "+fruits.get(index));
        }
        else
        System.out.println("Invalid index!!");

        //remove by name
        sc.nextLine();
        System.out.println("Enter the fruit name you want to remove : ");
        String toRemove = sc.nextLine();
        if(fruits.remove(toRemove)){
            System.out.println(toRemove+ " , deleted from the list");
        }
        else{
            System.out.println(toRemove+" Not found");
        }
        System.out.println("---- UPDATED FRUIT LIST ----\n"+fruits);
        sc.close();

    }
}
