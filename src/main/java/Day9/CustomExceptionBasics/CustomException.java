package Day9.CustomExceptionBasics;

 class InvalidPasswordException extends Exception{

     InvalidPasswordException(String s){
        super(s);
    }

    public static void main(String[] args) {
        try{
            throw new InvalidPasswordException("Custom exception");
        }catch(InvalidPasswordException e){

        }
    }
}
