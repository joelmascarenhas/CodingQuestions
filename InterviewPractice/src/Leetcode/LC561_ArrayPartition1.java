package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joel on 09-06-2017.
 */
public class LC561_ArrayPartition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i] = scanner.nextInt();
        }
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i+=2)
            sum = sum + nums[i];
        return sum;
    }
}
