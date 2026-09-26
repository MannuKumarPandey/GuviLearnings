package Day9.ThrowThrows;

public class ThrowKeyword {
    public static void main(String[] args) {
        try{
            if(5 < 10){
               // throw new Exception();// when developers want to throw
                System.out.println(12/0);//one exception object got created and thrown
            }
        }catch(Exception e){

        }
    }
}
