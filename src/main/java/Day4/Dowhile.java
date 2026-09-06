package Day4;

public class Dowhile {
    public static void main(String[] args) {


        //for loop & while loop can be terminated even before starting the loop
        for(int i = 0; i<0; i++){
            System.out.println("Mannu");
        }

        int y = 0;
        while(y < 0){
            System.out.println("Mannu");
        }


        //Once it woule be executed in do while : mandatory
        int z = 0;
        do {
            System.out.println("Mannu");
            z++;
        }while(z < 0);


    }
}
