package Day5;

public class DSAImportantCOncepts {
    public static void main(String[] args) {
        //1: convert string into chaRACETR ARRAY
        String a = "mannu";
        char[] aa  = a.toCharArray();

        //2) convert characetrs array into string
        char[] x = {'a','b','c'};
        String xs = new String(x);

        //3) reverse string with string builder
        String ss = "Mannu";
        StringBuilder sss = new StringBuilder(ss);
        sss = sss.reverse();
        System.out.println(sss);

       System.out.println(sss.deleteCharAt(1));


    }
}
