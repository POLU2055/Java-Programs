import java.util.*;
public class HashMapCollections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> priceMap=new HashMap<>();
        System.out.println("Enter no.of products : ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter product name : ");
            String product = sc.nextLine();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            sc.nextLine();        
            priceMap.put(product, price);

        }
        System.out.println("\n-----Product Price List-----\n");
        for(Map.Entry<String, Integer> entry : priceMap.entrySet()){
            System.out.println(entry.getKey() +"=> Rs "+entry.getValue());
        }
        //search product
        System.out.println("Enter product name to search : ");
        String searchProduct =sc.nextLine();
        if(priceMap.containsKey(searchProduct)){
            System.out.println("Price of "+searchProduct+" is : Rs "+priceMap.get(searchProduct));
        }
        else{
            System.out.println("The item is not present in the list....");
        }
        //removal of items
        System.out.println("Enter product to remove : ");
        String removeProduct=sc.nextLine();
        if(priceMap.remove(removeProduct)!=null){
                System.out.println(removeProduct+" removed");
                priceMap.remove(removeProduct);
        }
        else{
        System.out.println("Product not found!!!");
        }
        System.out.println("------ Updated price list ------\n");
        for(Map.Entry<String,Integer>entry : priceMap.entrySet()){
        System.out.println(entry.getKey()+" ==> Rs "+entry.getValue());
        }
        sc.close();
    }
}
