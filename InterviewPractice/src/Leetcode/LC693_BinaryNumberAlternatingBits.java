package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 16-04-2018.
 */
public class LC693_BinaryNumberAlternatingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkBits(scanner.nextInt()));
    }
    public static boolean checkBits(int n)
    {
        char[] bin = Integer.toBinaryString(n).toCharArray();
        char runningFlag = bin[0];
        for(int i=1;i<bin.length;i++)
        {
            if(bin[i] == runningFlag)
                return false;
            else
                runningFlag = bin[i];
        }
        return true;
    }
}
