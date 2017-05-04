package CodeInterviewBookQuestions;

import java.util.*;

/**
 * Created by Joel on 30-01-2017.
 */
public class FindFirstRepeatingElementinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(FindRepeatingChar(str.toCharArray()));

    }
    public static char FindRepeatingChar(char[] arr)
    {
        Set<Character> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        int len = arr.length;
        char temp = '!';
        for(int i = len - 1;i >= 0; i--)
        {
            if(set.contains(arr[i]))
                temp = arr[i];
            else
                set.add(arr[i]);
        }
        return temp;
    }
}
