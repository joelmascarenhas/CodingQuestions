package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joel on 17-05-2018.
 *
 * Logic:
 * Since we have negative numbers we keep track of all running counts using Map.
 * If at i, if running count is greater than or equal to k, implies there could be a number that if subtracted can give k, if it exists then a subarray exists with the count of that number x.
 * It at i, if running count is less than k, do same as above, check if remainder of rs - k exists in map, and if it does, it would give a subarray therefore add its value to result. and add the current running count to map with val 1 if it doesnt exist or update previous by 1.
 *
 * Basic check is - RS - x = k, since we know RS and K, we find x(i.e sum of some k elements previously) and check if its exists in map. If it does, how many ever times it does, it implies that those many subarrays are possible and add its value to the result.
 *
 */
public class LC560_SubarraySumEqualsK {
    public static void main(String[] args) {
        //System.out.println(subarraySum(new int[]{23,2,4,6,7},6));
        //System.out.println(subarraySum(new int[]{1,1,1},2));
        System.out.println(subarraySum(new int[]{-1,-1,1},0));
        //System.out.println(subarraySum(new int[]{-3,-3,6,-4,1,1,1,1,5},5));
    }
    public static int subarraySum(int[] nums,int k)
    {
        int runningSum = 0;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int val:nums)
        {
            runningSum+=val;
            if(runningSum < k)
            {
                if(map.containsKey(runningSum - k))
                    result+= map.get(runningSum - k);
                if(!map.containsKey(runningSum))
                    map.put(runningSum,1);
                else
                    map.put(runningSum,map.get(runningSum)+1);
            }
            else
            {
                if(map.containsKey(runningSum - k))
                    result+= map.get(runningSum - k);
                if(!map.containsKey(runningSum))
                    map.put(runningSum,1);
                else
                    map.put(runningSum,map.get(runningSum)+1);
            }
        }
        return result;
    }
}
