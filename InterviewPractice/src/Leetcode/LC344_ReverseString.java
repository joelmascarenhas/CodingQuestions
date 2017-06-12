package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 11-06-2017.
 */
public class LC344_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
