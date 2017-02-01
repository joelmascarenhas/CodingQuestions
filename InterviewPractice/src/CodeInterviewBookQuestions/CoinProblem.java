package CodeInterviewBookQuestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joel on 31-01-2017.
 */
public class CoinProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n(Sum total of coins)");
        int no = scanner.nextInt();
        System.out.println("Enter no of denominations");
        int den = scanner.nextInt();
        int[] arr = new int[den];
        System.out.println("Enter denominations");
        for(int i=0;i<den;i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(coinsol(no,arr));
    }
    public static int coinsol(int no,int arr[])
    {
        int finalarr[][] = new int[no+1][arr.length];
        int prev = 0,curr = 0;
        for(int i=0;i<no+1;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i == 0)
                {
                    finalarr[i][j] = 1;
                    continue;
                }
                if(j - 1 < 0)
                    prev = 0;
                else
                    prev = finalarr[i][j-1];

                if(i - arr[j] < 0)
                    curr = 0;
                else
                    curr = finalarr[i - arr[j]][j];
                finalarr[i][j] = prev + curr;
            }
        }
        return finalarr[no][arr.length-1];
    }
}
