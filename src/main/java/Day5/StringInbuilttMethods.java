package Day5;

import java.sql.SQLOutput;

public class StringInbuilttMethods {

    public static void main(String[] args) {
        String s = "Mannu";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(1));
        System.out.println(s.contains("an"));


        System.out.println(s.indexOf('M'));
        System.out.println(s.indexOf('q'));

        System.out.println(s.endsWith("u"));
        System.out.println(s.startsWith("M"));

        System.out.println(s.lastIndexOf('n'));
    }
}
