package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 18-04-2018.
 */
public class LC448_FindAllNumbersDisappeared {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        for(int i:nums)
        {
            if(nums[Math.abs(i)-1] > 0)
                nums[Math.abs(i)-1] = nums[Math.abs(i)-1] * -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}
