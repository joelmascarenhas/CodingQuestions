package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Joel on 13-06-2017.
 */
public class LC496_NextGreaterElementI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainArraylen = scanner.nextInt();
        int subArraylen = scanner.nextInt();
        int mainArray[] = new int[mainArraylen];
        int subArray[] = new int[subArraylen];
        for(int i=0;i<mainArraylen;i++)
            mainArray[i] = scanner.nextInt();

        for(int i=0;i<subArraylen;i++)
            subArray[i] = scanner.nextInt();

        int res[] = nextGreaterElement(subArray,mainArray);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int res[] = new int[findNums.length];
        for(int i=1;i<nums.length;i++)
        {
            if(stack.peek() > nums[i])
                stack.push(nums[i]);
            else
            {
                while(stack.peek() < nums[i])
                {
                    map.put(stack.pop(),nums[i]);
                    if(stack.isEmpty())
                        break;
                }
                stack.push(nums[i]);
            }
        }
        for(int i=0;i<findNums.length;i++)
        {
            if(map.containsKey(findNums[i]))
                 res[i] = map.get(findNums[i]);
            else
                res[i] = -1;
        }
        return res;
    }
}
