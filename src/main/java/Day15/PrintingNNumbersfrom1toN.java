package Day15;

public class PrintingNNumbersfrom1toN {

    static int targetV = 100;

    public static void main(String[] args) {


        for(int i=0; i<targetV; i++){
            System.out.println(i);
        }


        print(0);//first caller gives our initial value
    }

    public static void print(int currentValue){
        if(currentValue == targetV){
            return;
        }

        System.out.println(currentValue);

        print(currentValue+1);
    }
}
