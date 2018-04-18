package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 17-04-2018.
 */
public class LC258_AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(addAllDigits(scanner.nextInt()));
    }
    public static int addAllDigits(int n)
    {
        if(n == 0)
            return 0;
        else if(n % 9 ==0)
            return 9;
        else return (n%9);
    }
}
