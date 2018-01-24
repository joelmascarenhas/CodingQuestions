package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Joel on 15-01-2018.
 */
public class GS_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str1 = scanner.next();
        //String str2 = scanner.next();
        String str1 = "geeksforgeeks";
        String str2 = "forgeeks   geeks";
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1,String str2)
    {
        boolean result = false;
            Map<Character,Integer> map = new HashMap<>();
            char[] firstString = str1.toCharArray();
            for(int i=0;i<firstString.length;i++)
            {
                if(Character.isLetter(firstString[i]))
                {
                    char letter = Character.toLowerCase(firstString[i]);
                    if(map.containsKey(letter))
                    {
                        int count = map.get(letter);
                        map.put(letter,count+1);
                    }
                    else
                        map.put(letter,1);
                }
            }

            char[] secondString = str2.toCharArray();
            for(int i=0;i<secondString.length;i++)
            {
                if(Character.isLetter(secondString[i]))
                {
                    char letter = Character.toLowerCase(secondString[i]);
                    if(map.containsKey(letter))
                    {
                        int count = map.get(letter);
                        if(count == 1)
                            map.remove(letter);
                        else
                            map.put(letter,count-1);
                    }
                    else
                        return false;
                }
            }
            if(map.isEmpty())
                return true;
            else return false;
    }
}
