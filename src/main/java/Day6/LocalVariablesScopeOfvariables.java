package Day6;

public class LocalVariablesScopeOfvariables {


    public static void main(String[] args) {
       // System.out.println(x);
    }

    static void add(){
        int x = 10;//1) local variable: created inside a method: it will be visible only inside that method
        System.out.println(x);
    }

    static void sub(){
        int y = 100;
       // System.out.println(x);
    }

}
