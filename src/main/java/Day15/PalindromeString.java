package Day15;

public class PalindromeString {

    public static void main(String[] args) {
        String s ="madam";
        System.out.println(isPalin(s, 0, s.length()-1));


       /* int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("False");
                break;
            }
            l++;
            r--;
        }
        System.out.println("True");*/


    }

    public static boolean isPalin(String s, int l , int r){
        if(l == r){
            return true;
        }

        if(s.charAt(l) != s.charAt(r)){
            return false;
        }

        return isPalin(s, l+1, r-1);
    }
}
