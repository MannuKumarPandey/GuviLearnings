package Day7.ClassObjects;

public class MultiupleObjectsOfAClass {
    public static void main(String[] args) {

        //All objects are in sepreate memories : changing info in one memory will not reflect in other memory

        Laptop ll1= new Laptop();//one memory
       ll1.brandName = "HP";
        System.out.println(ll1.brandName);

        Laptop ll2 = new Laptop();//second memory
        System.out.println(ll2.brandName);


    }

}


class Laptop {
    String color="Black";
    String brandName = "Dell";
}
