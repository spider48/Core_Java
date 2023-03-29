package Array;

import java.util.HashSet;

public class HashSetEX {

    public void HashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("java");
        hashSet.add("java");
        hashSet.add("string");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("after adding hashset" +hashSet);

        hashSet.remove("java");
        System.out.println("after removing " +hashSet);

        hashSet.remove("null"); //update on hashset
        hashSet.add("c++");
    }
}
