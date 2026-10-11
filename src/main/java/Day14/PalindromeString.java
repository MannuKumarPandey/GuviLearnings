package Day14;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abcdedcba";//reverse of a String

        boolean flag = true;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                flag = false;
                break;
            }
            l++;
            r--;
        }

        System.out.println(flag ? true : false);
    }
}
