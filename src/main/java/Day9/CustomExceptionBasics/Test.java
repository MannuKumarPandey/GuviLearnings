package Day9.CustomExceptionBasics;

public class Test {

    public static void main(String[] args) {
        try{
         throw new InvalidAccountException("I got to know that account number is not found !");
        }catch (InvalidAccountException e){
            System.out.println(e.getMessage());
        }
    }

}


class InvalidAccountException extends Exception{
    InvalidAccountException(String message){
        super(message);
    }
}