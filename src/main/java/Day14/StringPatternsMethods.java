package Day14;

public class StringPatternsMethods {

    public static void main(String[] args) {
        String input = "Hello world worl";
        String pattern ="worl";

        //is pattern available in input string or not
        System.out.println(input.contains(pattern));

        System.out.println(input.indexOf(pattern));

        System.out.println(input.lastIndexOf(pattern));

        System.out.println(input.startsWith(pattern));

        System.out.println(input.endsWith(pattern));



    }


}
