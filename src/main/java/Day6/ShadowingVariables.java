package Day6;

public class ShadowingVariables {

    String name = "Mannu";//instance variable


    public static void main(String[] args) {
        String name = "Pandey";//local variable to main method
        //priority : local variable > instance variable
        System.out.println(name);

    }



}
