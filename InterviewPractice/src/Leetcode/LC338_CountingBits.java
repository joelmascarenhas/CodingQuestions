package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 10-06-2017.
 */
public class LC338_CountingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res[] = countBits(num);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
    public static int[] countBits(int num)
    {
        int res[] = new int[num+1];
        for(int i=0;i<num+1;i++)
        {
            //Better solution
            //Using memoization
            //res[i] = res[i/2] + i&1;
            int number = i;
            int counter = 0;
            while(number > 0)
            {
                counter+= number & 1;
                number = number >> 1;
            }
            res[i] = counter;
        }
        return res;
    }
}
