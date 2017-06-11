package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 10-06-2017.
 */
public class LC500_KeyboardRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res[] = findWords(scanner.nextLine().split(" "));
        for(String str:res)
            System.out.println(str);
    }
    public static String[] findWords(String[] words)
    {
        String set1 = "QWERTYUIOPqwertyuiop";
        String set2 = "ASDFGHJKLasdfghjkl";
        String set3 = "ZXCVBNMzxcvbnm";

        ArrayList<String> res = new ArrayList<>();
        int counter = 0;
        for(String str:words)
        {
            int flag = 0;
            boolean linechange = false;
            char[] letters = str.toCharArray();
            if(set1.contains(Character.toString(letters[0])))
                flag = 1;
            else if(set2.contains(Character.toString(letters[0])))
                flag = 2;
            else flag = 3;
            for(char c:letters)
            {
                if(flag == 1)
                {
                    if(!set1.contains(Character.toString(c)))
                    {linechange = true;break;}
                }
                else if(flag == 2){
                    if(!set2.contains(Character.toString(c)))
                    {linechange = true;break;}
                }
                else if(!set3.contains(Character.toString(c)))
                        {linechange = true;break;}
            }
            if(linechange == false)
                res.add(str);
        }
        String[] result = new String[res.size()];
        return res.toArray(result);
    }
}
