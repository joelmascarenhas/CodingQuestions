package Leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Joel on 10-04-2018.
 */
public class LC20_ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isValid(scanner.next()));
    }
    public static boolean isValid(String s)
    {
        int len = s.length();
        if(s == null || len == 0)
            return true;
        if(len%2 == 1)
            return false;
        else
        {
            Stack<Character> stack = new Stack();
            for(char c:s.toCharArray())
            {
                if(c == '{' || c == '(' || c == '[')
                    stack.push(c);
                else if((c == '}' && stack.isEmpty()) || (c == '}' && stack.peek() != '{'))
                    return false;
                else if((c == ')' && stack.isEmpty()) || (c == ')' && stack.peek() != '('))
                    return false;
                else if((c == ']' && stack.isEmpty()) || (c == ']' && stack.peek() != '['))
                    return false;
                else
                {
                    stack.pop();
                }
            }
            if(stack.size() > 0)
                return false;
            else
                return true;
        }

    }

}
