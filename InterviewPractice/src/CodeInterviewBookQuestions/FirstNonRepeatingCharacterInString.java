package CodeInterviewBookQuestions;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Joel on 04-02-2017.
 * //First non repeating character in a string done using HashMap
 */
public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("First Non-repeating character" + findnonrepeatchar(str));
    }
    static String findnonrepeatchar(String str)
    {
        char arr[] = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        char letter = ' ';
        for(char c:arr)
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(char c:arr)
        {
            if(map.get(c)==1)
            {
                letter = c;
                break;
            }

        }
        return letter+"";
    }

}
