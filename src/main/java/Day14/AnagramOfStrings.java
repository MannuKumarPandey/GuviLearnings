package Day14;

import java.util.HashMap;

public class AnagramOfStrings {

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cbadef";

        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            hm1.put(c, hm1.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(char c: s2.toCharArray()){
            hm2.put(c, hm2.getOrDefault(c,0)+1);
        }

        System.out.println(hm1.equals(hm2));


    }
}
