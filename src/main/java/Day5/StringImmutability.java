package Day5;

public class StringImmutability {
    public static void main(String[] args) {

        //immutable: playing as constant in nature
        //Its value cann not be changed in same memory space
        // if we want to perform any changes in the information:
        //It will be donbe in new space

        String s = "Mannu";//952 was memory
        String ss = s.concat(" Pandey");
       // System.out.println(s);


        //when ever frequent updation of your string values are required donot go ahead with String
        String numberSeries = "";
        for(int i = 0; i<100; i++){
            numberSeries = numberSeries+i; //100 times -> new momeroes got assigned
            //last 100th object is used but previous 99 objects and memories are wasted
        }
        System.out.println(numberSeries);


        //Mutable in nature: we can updsate the values in same memory location
        //New object creation will not take please here as it was geting done in string
        StringBuilder numberSeries2 = new StringBuilder();
        for(int i = 0; i<100; i++){
           numberSeries2.append(i);
        }
        System.out.println(numberSeries2);


        //Additional Point: Thread safe and synchronized in nature
        //Mutable in nature: we can updsate the values in same memory location
        //New object creation will not take please here as it was geting done in string
        StringBuffer numberSeries4 = new StringBuffer();
        for(int i = 0; i<100; i++){
            numberSeries4.append(i);
        }
        System.out.println(numberSeries4);

    }
}
