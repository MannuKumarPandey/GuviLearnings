package Day3;

public class INCDECOperators {
    public static void main(String[] args) {
        int x= 100;
        System.out.println(x);//100
        System.out.println(x++);//100
        System.out.println(x);//101

        int z= 100;
        System.out.println(z);//100
        System.out.println(++z);//101
        System.out.println(z);//101

        int y=100;
        System.out.println(y);//100
        System.out.println(y--);//100
        System.out.println(y);//99

        int p=100;
        System.out.println(p);//100
        System.out.println(--p);//99
        System.out.println(p);//99

        int q = 100;
        System.out.println(q++ +" "+ (q+4));
        //1st operation: using q and print that
        //2nd operation is increase its value
        //add additional value with updated one
    }
}
