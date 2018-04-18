package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 17-04-2018.
 */
public class LC202_HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isHappy(scanner.nextInt()));
    }
    public static boolean isHappy(int n)
    {
        Set<Integer> set = new HashSet<>();
        int runningSum = 0;
        while(true)
        {
            while(n > 0)
            {
                runningSum+= Math.pow(n%10,2);
                n = n/10;
            }
            if(runningSum == 1)
                return true;
            else if(set.contains(runningSum))
                return false;
            else
            {
                set.add(runningSum);
                n = runningSum;
                runningSum =0;
            }
        }


    }
}
