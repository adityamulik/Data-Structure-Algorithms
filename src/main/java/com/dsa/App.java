package com.dsa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[][] matrix = {{2,6},{1,3},{15,18},{8,10}};
        sort2DMatrixByColZero(matrix);
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }        
    }

    public static void sort2DMatrixByColZero(int[][] matrix) {

        Arrays.sort(matrix, new Comparator<int[]>() {
            
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                if (entry1[0] > entry2[0]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
