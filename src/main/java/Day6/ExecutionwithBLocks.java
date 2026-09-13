package Day6;

public class ExecutionwithBLocks {

    //executed even before main function: class initialization time: automatically no need to call by any JVM
    static {
        System.out.println("static block !");
    }

    public static void main(String[] args) {
        System.out.println("Main method !");
        new ExecutionwithBLocks();
    }

    //when object will be created
    ExecutionwithBLocks(){
       // System.out.println("Instance block");: one copy of instance block will be present here
        System.out.println("Constructor ! ");
    }

    //instance block: will be executed before constructor
    {
        System.out.println("Instance block");
    }
}
