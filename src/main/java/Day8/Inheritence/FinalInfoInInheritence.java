package Day8.Inheritence;

public class FinalInfoInInheritence {
    public static void main(String[] args) {
        GG g = new GG();
        System.out.println(g.x);
        System.out.println(g.y);
    }
}


//Data modification can be done by child class : and modified data will have more priority than parents coming data

class FF{
    int x = 100;
    final int y = 1000;

}

class GG extends FF{
    int x = 200;
    int y = 500;
}