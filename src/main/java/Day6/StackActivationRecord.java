package Day6;

public class StackActivationRecord {

    public static void main(String[] args) {
        for(int i = 0; i<1000000; i++) {
            add();//caller line of method
        }
    }

    //when a method is called : a dedicated memory is given to this called function/method:
    //to execute and store the details present inside the called method
    static void add (){
        System.out.println("I am here to add your data.");
    }
}
