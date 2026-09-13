package Day6;

public class ActivationBolcks {


    static int i = 0;


    // infinite method calls are taking place : infinite stack memory is required but we have finite supply
    static int add (int n){
        System.out.println(i++);
        add(n);
        return 1;
    }


    public static void main(String[] args) {
        add(1);
    }
}
