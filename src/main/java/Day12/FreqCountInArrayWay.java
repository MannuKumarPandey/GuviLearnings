package Day12;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqCountInArrayWay {
    public static void main(String[] args) {
        String s = "leetcode";//l e t c o d -> order of character

        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a'] = freq[c-'a']+1;
        }

        int avI = 0;
        for(char c: s.toCharArray()){
            if(freq[c-'a'] == 1){
                avI = c-'a';
                break;
            }
 ;       }


        System.out.println(Arrays.toString(freq));


        //even characters can be subtracted directly: on theirt ASCII values

        //                   97    97
        /*System.out.println('a'-'a');
        System.out.println('b'-'a');
        System.out.println('l'-'a');*/

    }
}
