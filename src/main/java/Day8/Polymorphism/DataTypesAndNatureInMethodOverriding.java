package Day8.Polymorphism;

public class DataTypesAndNatureInMethodOverriding {
}


//Overriding : 1) Method signature should not be changes
//2) changing the return types of method: not allowed

class PPP{
    void add(){
        System.out.println("11111111111111111");
    }
}


class RRR extends PPP {

    /*@Override
    int add(int a) {
        System.out.println("11111111111111111");
        return 1;
    }*/

    /*@Override
    int add() {
        System.out.println("11111111111111111");
        return 1;
    }*/
}
