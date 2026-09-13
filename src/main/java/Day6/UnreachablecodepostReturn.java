package Day6;

public class UnreachablecodepostReturn {

    public static void main(String[] args) {

    }

    int add(){
        return 10 + 20;
        //control will never reach to this line: unreachable code bases
        //return statement must be the last statement of the method
      //  System.out.println("111111111111111111111");
    }
}
