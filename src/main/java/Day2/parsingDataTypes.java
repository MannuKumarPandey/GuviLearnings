package Day2;

public class parsingDataTypes {
    //Converting text info/data  into numerical values
    public static void main(String[] args) {

        //1) : Text data to numerical value conversion

        String s = "100";

        int x = Integer.parseInt(s);
        short ss = Short.parseShort(s);
        byte bb = Byte.parseByte(s);
        Long ll = Long.parseLong(s);

        System.out.println(x);

        //2) : Parsing from Numerical to text or String
        int hh = 89;
        String ss5 = String.valueOf(hh);
        System.out.println(ss5);

        System.out.println(Integer.toBinaryString(18));

    }
}
