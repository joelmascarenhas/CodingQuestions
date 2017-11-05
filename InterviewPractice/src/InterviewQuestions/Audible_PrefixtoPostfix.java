package InterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Joel on 03-11-2017.
 */
public class Audible_PrefixtoPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prefix_str = scanner.next();
        System.out.println(PrefixToPostfixConverter(prefix_str));
    }
    public static String PrefixToPostfixConverter(String str)
    {
        String postFix="";
        Stack<String> stack = new Stack<>();
        int len = str.length() - 1;
        while(len >= 0)
        {
            if(Character.isLetterOrDigit(str.charAt(len)))
            {
                stack.push(Character.toString(str.charAt(len)));
                len--;
            }
            else
            {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expr = operand1 + operand2 + str.charAt(len);
                stack.push(expr);
                len--;
            }
        }
        while(!stack.empty())
        {
            String expr = stack.pop();
            postFix+= expr;
        }
        return postFix;
    }
}
