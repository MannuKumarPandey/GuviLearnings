package Day7.constructor;

public class DefaultConstructor {
    public static void main(String[] args) {
        Charger cc = new Charger();
        System.out.println(cc.brandName);
    }
}


class Charger{
    //1: If programmer has not written any constructor inside the class: 0- parameterized constructor will
    //be give by java

    //2) : if programmer is writting any constructor: then java's defaul;t constructor will not be available

    String brandName = "Dell";

    Charger(int a){

    }

    Charger(){

    }

}