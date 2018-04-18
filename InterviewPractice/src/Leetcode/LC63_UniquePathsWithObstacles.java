package Leetcode;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC63_UniquePathsWithObstacles {
    public static void main(String[] args) {
        //int[][] obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid = new int[][]{{0,1,0,0},{0,0,0,1},{0,0,0,0}};
        System.out.println(countPathsWithObstacles(obstacleGrid));
    }
    public static int countPathsWithObstacles(int[][] obstacleGrid)
    {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(obstacleGrid[i][j] == 1)
                    arr[i][j] = 0;
                else if(i == 0 && j == 0)
                {
                    arr[i][j] = 1;
                }
                else if(i == 0)
                {
                    if(arr[i][j-1] == 0)
                        arr[i][j] = 0;
                    else
                        arr[i][j] = 1;
                }
                else if(j == 0)
                {
                    if(arr[i-1][j] == 0)
                        arr[i][j] = 0;
                    else
                        arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }
}
