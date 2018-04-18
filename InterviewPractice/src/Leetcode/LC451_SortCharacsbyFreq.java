package Leetcode;

import com.sun.org.glassfish.external.statistics.impl.StringStatisticImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Joel on 17-04-2018.
 */
public class LC451_SortCharacsbyFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sortCharacs(scanner.next()));
    }
    public static String sortCharacs(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        PriorityQueue<charFreq> pq = new PriorityQueue<>();
        StringBuilder result = new StringBuilder();
        charFreq characs;
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(char c:map.keySet())
        {
            pq.add(new charFreq(c,map.get(c)));
        }

        while(!pq.isEmpty())
        {
            characs = pq.poll();
            result.append(new String(new char[characs.freq]).replace("\0",String.valueOf(characs.ch)));
        }
        return result.toString();


    }
}
class charFreq implements Comparable
{
    char ch;
    int freq;
    charFreq(char ch,int freq)
    {
        this.ch = ch;
        this.freq = freq;
    }

    @Override
    public int compareTo(Object o) {

        charFreq obj = (charFreq) o;
        return obj.freq - this.freq;
    }
}
