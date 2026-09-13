package Day6;

public class LoopVariables {

    public static void main(String[] args) {

        //1st case : declaration + initilization of variable is in loop
        //System.out.println(i); //here i can never be used
        for(int i = 0; i< 10; i++){//int i : loop level variable
            System.out.println(i);
        }
       // System.out.println(i);



        //2nd case:
        int p ;//local variable
        for(p = 0; p< 10; p++){//int i : loop level variable
            System.out.println(p);
        }
        System.out.println(p);

    }
}
