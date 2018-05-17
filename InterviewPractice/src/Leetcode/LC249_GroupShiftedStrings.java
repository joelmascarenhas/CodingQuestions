package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Joel on 14-05-2018.
 */
public class LC249_GroupShiftedStrings {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("abc");
        arr.add("xyz");
        arr.add("ab");
        arr.add("bc");
        arr.add("az");
        arr.add("ba");
        arr.add("acef");
        List<List<String>> result = findGroups(arr);
        System.out.println(result);
    }

    public static List<List<String>> findGroups(List<String> arr)
    {
        HashMap<Integer,ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        int num;
        for(int i=0;i<arr.size();i++)
        {
            num = findNumber(arr.get(i));
            if(!map.containsKey(num))
            {
                map.put(num,new ArrayList<String>());
                map.get(num).add(arr.get(i));
            }
            else
            {
                map.get(num).add(arr.get(i));
            }
        }
        for(int n:map.keySet())
        {
            res.add(map.get(n));
        }
        return res;
    }
    public static int findNumber(String str)
    {
        char[] arr = str.toCharArray();
        int result = 0;
        StringBuffer strRes = new StringBuffer();
        strRes.append(str.length());
        if(str.length() == 1)
            return 1;
        for(int c=1;c<str.length();c++)
        {
            int val = arr[c] - arr[c-1];
            if(val < 0)
                strRes.append(val + 26);
            else
                strRes.append(val);
        }
        return Integer.parseInt(strRes.toString());
    }

}
