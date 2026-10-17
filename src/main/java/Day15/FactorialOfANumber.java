package Day15;

public class FactorialOfANumber {


    public static void main(String[] args) {
        // n! = n*(n-1)*(n-2)--------------------*1

        System.out.println(fac(5)); // 5*4*3*2*1
    }

    public static int fac(int n){
        if(n == 1){
            System.out.println("Base Condition reached");
            return 1;
        }
        System.out.println("Before :"+ n);
       int res =  n*fac(n-1);
        System.out.println("After :"+ n +" With res :"+ res);


        return res;
    }
}
