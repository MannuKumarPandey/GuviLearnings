package Day9.TryCatchFinally;

import java.io.FileReader;
import java.io.IOException;

public class CompiledTime {

    //for Which Java is forcing us to handle at compile time : having try catch block at compile tuime itself


    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
