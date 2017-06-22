package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 21-06-2017.
 */
public class LC521_LongestUncommonSubsequence1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(findLUSLength(a,b));
    }
    public static int findLUSLength(String a,String b) {
        if (a.equals(b))
            return -1;
        else
        {
            return Math.max(a.length(),b.length());
        }

    }
}
