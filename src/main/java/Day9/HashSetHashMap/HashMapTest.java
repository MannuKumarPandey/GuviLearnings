package Day9.HashSetHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        //Map : key + value
        //Example: Rollnumbers + marks in that one sem
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 89);
        hm.put(2, 79);
        hm.put(3, 45);
        hm.put(4, 78);
        hm.put(5, 89);
        hm.put(6, 79);
        hm.put(7, 45);
        hm.put(8, 78);



        for(Map.Entry<Integer,Integer> co : hm.entrySet()){
            System.out.println(co.getKey()+"   " + co.getValue());
        }



        System.out.println(hm.size());




    }
}
