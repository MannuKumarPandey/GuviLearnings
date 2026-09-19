package Day7.Folder2;

import Day7.Folder1.File2WhichHasAllData;

public class File3 extends File2WhichHasAllData {

    public static void main(String[] args) {
        File2WhichHasAllData f2 = new File2WhichHasAllData();
       // System.out.println(f2.lastName);: here lastName is not visible beacuse of default nature

        File3 f3 = new File3();
        System.out.println(f3.brand);

        System.out.println(f2.desc);

    }
}
