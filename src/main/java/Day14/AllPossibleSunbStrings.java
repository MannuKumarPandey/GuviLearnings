package Day14;

import java.util.ArrayList;

public class AllPossibleSunbStrings {

    public static void main(String[] args) {
        String s = "abcd";// n*(n+1)/2
        int len = s.length();

        ArrayList<String> subStrings = new ArrayList<>();

        for(int i = 0; i<len; i++){ //at left side boundry
            for(int j = i; j<len; j++){//at right side boundry

                //1st iteration i = 0 j = 0
                //2nd iteration i = 0 j = 1
                //3rd iteration i = 0 j = 2
                subStrings.add(s.substring(i, j+1));

            }
        }
        System.out.println(subStrings);
    }

}
