import java.util.*;
public class BasicMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(200,"ABC");
        map.put(250,"XYZ");
        map.put(300,"PQR");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
