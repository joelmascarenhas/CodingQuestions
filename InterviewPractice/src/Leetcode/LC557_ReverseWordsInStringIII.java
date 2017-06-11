package Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Joel on 10-06-2017.
 */
public class LC557_ReverseWordsInStringIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverseWords(scanner.nextLine()));
    }
    public static String reverseWords(String s)
    {
        String words[] = s.split(" ");
        ArrayList<StringBuffer> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            arr.add(new StringBuffer(words[i]).reverse());
        }
        StringBuffer res = new StringBuffer();
        for(int i=0;i<arr.size();i++)
        {
            res.append(arr.get(i));
            if(i != arr.size()-1)
                res.append(" ");
        }
         return res.toString();
    }
}
