package Day6;

public class Instancevariables {

    static String address;//Class level variable:
    String name;//instance variable: throught the class it will be available


    void add(){
        System.out.println(name);
    }


    void sub(){
        System.out.println(name);
    }
}


class H{
    public static void main(String[] args) {
        System.out.println(Instancevariables.address);//static variable
        System.out.println(new Instancevariables().name);//instance variable
    }
}