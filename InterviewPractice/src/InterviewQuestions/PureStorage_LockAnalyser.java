package InterviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Joel on 01-11-2017.
 */
public class PureStorage_LockAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String s[] = new String[size];
        for(int i=0;i<size;i++)
        {
            s[i] = scanner.next();
        }
        System.out.println(checkLocks(s));
    }
    public static int checkLocks(String s[])
    {
        int len = s.length;
        int result = 0;
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();
        if(s[0].contains("RELEASE"))
            return 1;
        else
        {
            stack.push(s[0]);
            set.add(s[0]);
        }
        for(int i=1;i<len;i++)
        {
            if(set.contains(s[i]))
                return i;
            else
            {
                s[i].contains("RELEASE");
                String lastlock = stack.pop();

            }
        }
        return result;
    }

}
