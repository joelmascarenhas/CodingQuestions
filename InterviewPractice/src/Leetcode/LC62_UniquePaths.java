package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC62_UniquePaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countPaths(scanner.nextInt(),scanner.nextInt()));
    }
    public static int countPaths(int m,int n)
    {
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                    arr[i][j] = 1;
                else
                {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }
}
