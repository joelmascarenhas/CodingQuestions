package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC791_CustomSortString {
    public static void main(String[] args) {
        System.out.println(customString("cba","ababcd"));
    }
    public static String customString(String S,String T) {
        String extraChar="";
        String result="";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : S.toCharArray())
            map.put(c,0);
        for(char c:T.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                extraChar+=String.valueOf(c);
        }
        for(char c:map.keySet())
        {
            for(int i=0;i<map.get(c);i++)
                result+=String.valueOf(c);
        }
        return result+extraChar;
    }
}
