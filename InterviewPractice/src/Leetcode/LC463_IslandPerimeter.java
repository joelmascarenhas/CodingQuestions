package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 11-06-2017.
 */
public class LC463_IslandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int grid[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                grid[i][j] = scanner.nextInt();
        }
        System.out.println("Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(grid[i][j]+" ");
            System.out.println();
        }

        System.out.println(islandPerimeter(grid));
    }
    public static int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == 1)
                {
                    if(i != 0)
                    {
                        if(grid[i-1][j] == 0)
                            sum = sum + 1;
                    }
                    else
                        sum = sum + 1;

                    if(i != (row-1))
                    {
                        if(grid[i+1][j] == 0)
                            sum = sum + 1;
                    }
                    else
                        sum = sum + 1;

                    if(j != 0)
                    {
                        if(grid[i][j-1] == 0)
                            sum = sum + 1;
                    }
                    else
                        sum = sum + 1;

                    if(j != (col-1))
                    {
                        if(grid[i][j+1] == 0)
                            sum = sum + 1;
                    }
                    else
                        sum = sum + 1;

                }
            }
        }
    return sum;
    }
}
