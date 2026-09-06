package Day4;

public class ForLoop1 {

    public static void main(String[] args) {
        //missed end point : end point : infinite loop
       /* for(int i = 0; ; i = i-1){
            System.out.println("Mannu");
        }*/

        //destination is in positive direction and jumpo facctor is heading towards negative direction so we
        //will never reach the destination

       /* for(int i = 0; i <= 40; i = i-1){
            System.out.println("Mannu");
        }*/

        int z = 0;
        while(z < 40){
            System.out.println("Mannu");
            z--;
        }
    }
}
