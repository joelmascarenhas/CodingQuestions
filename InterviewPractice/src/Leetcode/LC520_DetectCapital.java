package Leetcode;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by Joel on 10-04-2018.
 */
public class LC520_DetectCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkCapital(scanner.next()));
    }

    public static boolean checkCapital(String str)
    {
        int len = str.length();
        if(len == 0)
            return false;
        boolean start = Character.isUpperCase(str.charAt(0));
        int capCounter = 0;
        for(char c:str.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                capCounter++;
            }
        }
        if(capCounter == 0)
            return true;
        else if(capCounter == len)
            return true;
        else if(capCounter == 1 && start == true)
            return true;
        else return false;
    }

}
