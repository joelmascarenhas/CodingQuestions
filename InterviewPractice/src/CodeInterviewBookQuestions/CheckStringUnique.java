package CodeInterviewBookQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Joel on 14-12-2016.
 */
public class CheckStringUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Character> map = new HashSet<Character>();
        String str = scanner.next();
        int len = str.length(),flag = 0;
        char letter = ' ';
        for(int i = 0;i<len;i++)
        {
            letter = str.charAt(i);
            if(map.contains(letter))
            {
                flag = 1;
                break;
            }
            else
                map.add(letter);
        }
        if(flag == 1)
            System.out.println("String contains non unique characters which is:- "+ letter);
        else
            System.out.println("String has only unique characters");
    }


}
