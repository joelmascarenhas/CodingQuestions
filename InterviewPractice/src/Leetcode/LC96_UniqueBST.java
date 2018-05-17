package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 15-05-2018.
 */
public class LC96_UniqueBST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(findAllPossibilities(num));
    }

    public static int findAllPossibilities(int num)
    {
        int arr[];
        if(num == 1)
            return 1;
        else if(num == 2)
            return 2;
        else
        {
            arr = new int[num+1];
            arr[0] = 1;arr[1] = 1;arr[2] = 2;
            for(int i=3;i<num+1;i++)
            {
                arr[i] = calc(i,arr);
            }
        }
        return arr[num];
    }

    public static int calc(int num,int arr[])
    {
        int start = 1;int mid = 1;int end = num;int sum=0;
        for(int i=0;i<num;i++)
        {
            sum+= arr[mid-start] * arr[end-mid];
            mid++;
        }
        return sum;
    }
}
