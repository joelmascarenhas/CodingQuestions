package Leetcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Joel on 06-06-2017.
 */
public class LeetCode_TwoSum_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int size = scanner.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<size;i++)
            nums[i] = scanner.nextInt();
        int result[];
        result = twoSum(nums,target);
        System.out.println(result[0] + " " + result[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int result[] = new int[2];
        int size = nums.length;
        for(int i=0;i<size;i++)
            map.put(nums[i],i);

        for(int i=0;i<size;i++)
        {
            if(map.containsKey(target - nums[i]) && (map.get(target - nums[i]) != i))
            {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
        }
        return result;
    }
}
