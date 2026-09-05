package Day3;

public class BitWiseOPerators {
    public static void main(String[] args) {
        //&
        System.out.println(2 & 4);//0010  0100
        System.out.println(2 | 4);
        System.out.println(2 ^ 4);

        System.out.println(~2);

        System.out.println(2 >> 1);//2 / 2^1
        System.out.println(12 >> 3); // 12 / 2^3 = 1

        System.out.println(23 << 1);  //23 * 2^1 = 46
        System.out.println(12 << 3); // 12 * 2^3 = 96
    }
}
