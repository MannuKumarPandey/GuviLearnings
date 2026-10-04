package Day12;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountViaHashMap {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,4,5,6,7,8,10};//input

        HashMap<Integer,Integer> freqMap = new HashMap<>(); //to store our output:

        for(int a: arr){
            if(freqMap.containsKey(a)){
                int existingFreq = freqMap.get(a);
                int newFreq = existingFreq + 1;
                freqMap.put(a, newFreq);
            }else{
                freqMap.put(a, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey()+" is present "+ entry.getValue() +" times.");
        }

    }
}
