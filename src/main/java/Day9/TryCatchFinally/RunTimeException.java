package Day9.TryCatchFinally;

public class RunTimeException {

    public static void main(String[] args) {
        //for Which Java is not forcing us to handle at compile time :
        // having try catch block at compile time itself : not mandatory

        System.out.println(12/0);//we released the control from our end

        String s = null ;
        System.out.println(s.length());

        String s1 = "Mannu";// 0 1 2 3 4
        System.out.println(s1.charAt(10));

        String s3 = "mannu";
        int x = Integer.parseInt(s3);
        System.out.println(s3);
    }
}
