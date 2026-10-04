package Day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqCountInString {
    public static void main(String[] args) {
        String s = "leetcode";//l e t c o d -> order of character

        LinkedHashMap<Character,Integer> freqMap = new LinkedHashMap<>(); //Linked hashMap = Hashmap + order reserve properties
        for(char a: s.toCharArray()){
            if(freqMap.containsKey(a)){
                int existingFreq = freqMap.get(a);
                int newFreq = existingFreq + 1;
                freqMap.put(a, newFreq);
            }else{
                freqMap.put(a, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey()+" is present "+ entry.getValue() +" times.");
        }



        /*HashMap<Character,Integer> freqMap = new HashMap<>(); //to store our output: but
        for(char a: s.toCharArray()){
            if(freqMap.containsKey(a)){
                int existingFreq = freqMap.get(a);
                int newFreq = existingFreq + 1;
                freqMap.put(a, newFreq);
            }else{
                freqMap.put(a, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey()+" is present "+ entry.getValue() +" times.");
        }*/

    }
}
