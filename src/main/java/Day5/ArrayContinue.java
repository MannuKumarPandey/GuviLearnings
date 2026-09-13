package Day5;

public class ArrayContinue {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i<a.length; i++ ) {
            if(i == 2){
                continue;
            }
            System.out.println(a[i]);
        }
    }
}
