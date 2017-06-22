package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 21-06-2017.
 */
public class LC485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[scanner.nextInt()];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = scanner.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        int max=0,running=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
                running+= 1;
            else if(nums[i] == 0)
            {
                if(running > max)
                {
                    max = running;
                    running = 0;
                }
                else
                    running = 0;
            }
        }
        if(running > max)
            return running;
        else
            return max;
    }
}
