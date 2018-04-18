package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joel on 17-04-2018.
 */
public class LC389_FindDifference {
    public static void main(String[] args) {
        //System.out.println(findDiff("abcd","abcde"));
        System.out.println(findDiff("aa","a"));
    }
    public static char findDiff(String s,String t)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(char c:t.toCharArray())
        {
            if(!map.containsKey(c))
                return c;
            else
            {
                int count = map.get(c);
                if(count == 1)
                    map.remove(c);
                else
                    map.put(c,count-1);
            }
        }
        for(char c:map.keySet())
        {
            return c;
        }
        return ' ';
    }
}
