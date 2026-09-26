package Day9.TryCatchFinally;

public class FinallyBlock {

    //codes written inbside the finally block will be executed at any time

    public static void main(String[] args) {
        try{
            //write the code base which can ccreate the exception
            System.out.println(12/0);
        }finally{
            System.out.println("999999999999999999");
        }






        try{
            //write the code base which can ccreate the exception
            System.out.println(12/0);
        }catch(Exception e){
            //thrown object of exxception is catched by this block
            System.out.println("division was from 0");
        }finally{
            System.out.println("8888888888888888888888");
        }
    }
}
