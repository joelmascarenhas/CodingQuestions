package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Joel on 21-01-2018.
 */
public class GS_UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(uniqueChar(str));
    }
    public static char uniqueChar(String str)
    {
      Map<Character,Integer> map = new HashMap<>();
      for(int i=0;i<str.length();i++)
      {
          char c = Character.toLowerCase(str.charAt(i));
          if(map.containsKey(c) && Character.isLetter(c))
          {
              int count = map.get(c);
              map.put(c,count+1);
          }
          else
          {
              map.put(c,1);
          }
      }
        for(int i=0;i<str.length();i++)
        {
            char c = Character.toLowerCase(str.charAt(i));
            if(map.get(c) == 1)
            {
                return c;
            }
        }
        return ' ';
    }

}
