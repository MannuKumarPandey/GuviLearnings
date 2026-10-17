package Day15;

public class Fibonacii {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        System.out.println(fib(5));
    }


    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        System.out.println("Before N:"+ n);
        return fib(n-1) + fib(n-2);

    }
}
