package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 15-12-2016.
 */
public class RunLengthEncoding {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        System.out.println(encodefunc(str));
    }
    static String encodefunc(String str)
    {
        char[] arr = str.toCharArray();
        int lenarr = arr.length;
        StringBuffer finalarr = new StringBuffer();
        finalarr.append(arr[0]);
        int count = 1;
        char letter = arr[0];
        for(int iter = 1;iter < lenarr;iter++)
        {
            if(letter == arr[iter])
                count++;
            else
            {
                finalarr.append(count);
                finalarr.append(arr[iter]);
                letter = arr[iter];
                count = 1;
            }
        }
        finalarr.append(count);
        int len = finalarr.length();
        if(len > lenarr)
            return str;
        else
            return finalarr.toString();
    }

}
