package Leetcode;

import java.util.*;

/**
 * Created by Joel on 05-02-2018.
 */
public class LC347_TopKFrequentElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(findtopK(arr,k));
    }
    public static List<Integer> findtopK(int nums[],int k)
    {
        Map<Integer,Integer> map = new HashMap();
        Map<Integer,List<Integer>> ktop = new TreeMap(Collections.reverseOrder());
        List<Integer> temp;
        List<Integer> result = new ArrayList<>();
        int counter=0;
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                int val = map.get(i);
                map.put(i,val+1);
            }
            else
                map.put(i,1);
        }

        for(int i:map.keySet())
        {
            if(ktop.get(map.get(i)) == null)
            {
                temp = new ArrayList<>();
                temp.add(i);
                ktop.put(map.get(i),temp);
            }
            else
            {
                ktop.get(map.get(i)).add(i);
            }

        }
        for(int i:ktop.keySet())
        {
            temp = ktop.get(i);
            if(temp.size() > k)
            {
                for(int j=0;j<k;j++)
                {
                 result.add(temp.get(j));
                }
                break;
            }
            else
            {
                k = k - temp.size();
                for(int j=0;j<temp.size();j++)
                {
                    result.add(temp.get(j));
                }
            }
        }
        return result;
    }
}
