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
        for(int i=0;i<size+1;i++)
        {
            if(i==0){
                scanner.nextLine();
                continue;
            }
            s[i-1] = scanner.nextLine();
        }
        System.out.println(checkLocks(s));
    }
    public static int checkLocks(String s[])
    {
        int len = s.length;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++)
        {
            String val[] = s[i].split(" ");
            if(val[0].equals("ACQUIRE"))
            {
                int locknum = Integer.parseInt(val[1]);
                if(set.contains(locknum))
                    return i+1;
                else
                {
                    set.add(locknum);
                    stack.push(locknum);
                }
            }
            else if(val[0].equals("RELEASE"))
            {
                if(stack.peek() != Integer.parseInt(val[1]))
                    return i+1;
                else if(!set.contains(Integer.parseInt(val[1])))
                {
                    return i+1;
                }
                else
                {
                    stack.pop();
                    set.remove(Integer.parseInt(val[1]));
                }
            }
        }
        if(!stack.isEmpty())
            return len+1;
        return result;
    }

}
