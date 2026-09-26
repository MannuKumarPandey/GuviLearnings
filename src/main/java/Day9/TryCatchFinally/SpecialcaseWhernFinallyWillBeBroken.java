package Day9.TryCatchFinally;

public class SpecialcaseWhernFinallyWillBeBroken {

    public static void main(String[] args) {
        try{
            System.exit(0);//it will be disturbing our JVM directly
            //when finally will be disturbed and not working
            System.out.println(12/0);
        }finally{
            System.out.println("999999999999999999");
        }
    }
}
