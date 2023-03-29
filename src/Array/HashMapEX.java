package Array;

import java.util.HashMap;

public class HashMapEX {

    public void HashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Java");
        hashMap.put(2,"c++");
        System.out.println("After hashmap: " +hashMap);

        hashMap.remove(1);
        System.out.println("After removing hashmap" +hashMap);

        hashMap.put(2,"spring");
        System.out.println("After update" +hashMap);

        System.out.println(hashMap.isEmpty());
    }
}
