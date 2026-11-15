package Day24;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);//values
        hs.add(200);

        System.out.println(hs);



        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,1000);
        hm.put(2,2000);

        System.out.println(hm);



    }
}
