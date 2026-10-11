package Day14;

public class NaiveStringPatternMatcching {
    public static void main(String[] args) {
        String input = "Hello world worl";
        String pattern ="worl";

        int n = input.length();
        int m = pattern.length();

        for(int i =0; i<= n-m; i++){//i pointer is working on input

            int j = 0;//j pointer working on pattern
            while(j < m && input.charAt(i+j) == pattern.charAt(j)){//when ever we find any character which is nmatching with first characater with
                //our pattern then moving is not required here: here we aree taking help of j movements then dynamically we calculate here i+j
                j++;
            }
            if(j == m){
                System.out.println(i);
                break;
            }
        }




    }
}
