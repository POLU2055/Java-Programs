import java.util.*;
public class BasicMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(250,"ABC");
        map.put(200,"XYZ");
        map.put(300,"PQR");
        //automatically sorted 
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
