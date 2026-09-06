package Day4;

public class BreakContinueReturn {
    public static void main(String[] args) {
        // print 1 to 5 and skip 3
        for(int i = 1; i<=5; i++){
            // i = 1
            // i = 2
            // i = 3
            if(i == 3){
                //continue;//donot complete this iteration: come up with new value and then continue
                //break;//break the complete rest iteration of this loop but code bases written out of this loop
                //will still be executed
                return;// Control will be sent back  to OS, no more execution required in program
            }

            System.out.println(i);

        }

        System.out.println("11111111111111111111111111111111");
    }
}
