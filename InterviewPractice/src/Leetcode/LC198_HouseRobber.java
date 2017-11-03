package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 30-08-2017.
 */
public class LC198_HouseRobber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums)
    {
        int arr2[] = new int[nums.length];
        if(nums.length == 1)
            return nums[0];
        else if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        else
        {
            arr2[0] = nums[0];
            arr2[1] = Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++)
            {
                arr2[i] = (nums[i]+arr2[i-2] > arr2[i-1])?nums[i]+arr2[i-2]:arr2[i-1];
            }
            return arr2[arr2.length-1];
        }

    }
}
