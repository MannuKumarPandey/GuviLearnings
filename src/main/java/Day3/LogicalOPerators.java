package Day3;

public class LogicalOPerators {

    public static void main(String[] args) {
        // && || !
        //&& -> and
        //|| -> or
        //!-> not

        System.out.println((3>2) && (10<3));
        System.out.println(true && false);//false
        System.out.println(true && true); //true
        System.out.println(false && false); //false


        System.out.println((3>2) || (10<3));//true
        System.out.println(true || false);//true
        System.out.println(true || true); //true
        System.out.println(false || false); //false

        System.out.println(!(6<2));//true
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
