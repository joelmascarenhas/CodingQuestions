package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 11-06-2017.
 */
public class LC566_ReshapeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows");
        int old_r = scanner.nextInt();
        System.out.println("Columns");
        int old_c = scanner.nextInt();
        System.out.println("Enter Matrix");
        int old_arr[][] = new int[old_r][old_c];
        for(int i=0;i<old_r;i++)
        {
            for(int j=0;j<old_c;j++)
            {
                old_arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("New Rows");
        int new_r = scanner.nextInt();
        System.out.println("New Columns");
        int new_c = scanner.nextInt();
        int[][] new_arr;

        System.out.println("Old matrix");
        for(int i=0;i<old_r;i++)
        {
            for(int j=0;j<old_c;j++)
            {
                System.out.print(old_arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("New matrix");
        new_arr = matrixReshape(old_arr,new_r,new_c);
        if((new_arr.length != new_r)&&(new_arr[0].length != new_c))
            System.out.println("No change in matrix");
        else
        {
            for(int i=0;i<new_r;i++)
            {
                for(int j=0;j<new_c;j++)
                {
                    System.out.print(new_arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int old_r = nums.length;
        int old_c = nums[0].length;
        if((old_c * old_r) != (r*c))
            return nums;
        else
        {
            int new_arr[][] = new int[r][c];
            int rowcounter = 0,colcounter = 0;
            for(int i=0;i<old_r;i++)
            {
                for(int j=0;j<old_c;j++)
                {
                    if(colcounter == c)
                    {
                        colcounter = 0;
                        rowcounter++;
                    }
                    new_arr[rowcounter][colcounter] = nums[i][j];
                    colcounter++;
                }
            }
            return new_arr;
        }
    }
}
