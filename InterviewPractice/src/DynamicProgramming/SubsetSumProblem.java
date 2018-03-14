package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Joel on 13-03-2018.
 * In a given set of numbers, is there a combination that sums up to k.
 * Using similar approach to Knapsack. Set of numbers as rows, all numbers upto to k as columns.
 *
 */
public class SubsetSumProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSet[] = new int[]{2,3,7,8,10};
        int k = 11;
        System.out.println(findSubset(numberSet,k));
    }
    public static List<Integer> findSubset(int[] numberSet, int k)
    {
        boolean arr[][] = new boolean[numberSet.length][k+1];
        for(int i=0;i<numberSet.length;i++)
        {
            for(int j=0;j<k+1;j++)
            {
                if(j==0)
                    arr[i][j] = true;
                else if(i==0)
                {
                    if(numberSet[i] == j)
                        arr[i][j] = true;
                    else
                        arr[i][j] = false;
                }
                else if(numberSet[i] > j)
                {
                    arr[i][j] = arr[i-1][j];
                }
                else if(numberSet[i] == j)
                {
                    arr[i][j] = true;
                }
                else
                {
                    if(arr[i-1][j] == true)
                        arr[i][j] = true;
                    else
                        arr[i][j] = arr[i-1][j-numberSet[i]];
                }
            }
        }
        System.out.println(arr[arr.length-1][arr[0].length-1]);
        int row = arr.length-1;
        int col = arr[0].length-1;
        List<Integer> res = new ArrayList<>();
        if(arr[arr.length-1][arr[0].length-1] == true)
        {
            while(col != 0)
            {
                if(arr[row-1][col] == true)
                {
                    row--;
                }
                else
                {
                    res.add(numberSet[row]);
                    col = col-numberSet[row];
                    row--;
                }
            }
        }
        return res;
    }
}
