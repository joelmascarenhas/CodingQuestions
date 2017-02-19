package SodaCodeChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 18-02-2017.
 */
public class CheckPanagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(checkString(str));
    }
    public static String checkString(String str)
    {
        str = str.toLowerCase();
        Set<Character> dict = new HashSet<Character>();
        char arr[] = str.toCharArray();
        for(char c:arr)
        {
            if(c == ' ')
                continue;
            else if(!dict.contains(c))
                dict.add(c);
        }

        if(dict.size()==26)
            return "pangram";
        else
            return "not pangram";
    }

}
