package Day5;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        //matrix
        //rows and columns

        int[][] matrix2 = new int[4][4];//no of rows and columns : both given : fine
        //int[][] matrix4 = new int[][];//compile time error
        //int[][] matrix5 = new int[][4];//compile time error

        int[][] matrix3 = new int[4][];// Jagged Array
        matrix3[0] = new int[3];
        matrix3[1] = new int[4];
        matrix3[2] = new int[5];
        matrix3[3] = new int[6];

        System.out.println("Jagged Array :::::::::::::::::");
        for(int[] aa: matrix3)
        {
            System.out.println(Arrays.toString(aa));
        }


        System.out.println("Square Matrix::::::::::::");
        int[][] matrix = new int[3][3];//3 * 3 : 1st square bracket : rows 2nd square bracket : columns

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;



        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;


        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for(int[] aaa: matrix){
            System.out.println(Arrays.toString(aaa));
        }



    }
}
