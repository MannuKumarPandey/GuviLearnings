package Day9.HashSetHashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,70);
        hm.put(2, 78);

        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }
    }
}
