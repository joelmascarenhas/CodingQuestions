package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 09-06-2017.
 */
public class LC476_NumberComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findComplement(scanner.nextInt()));
    }
    public static int findComplement(int num)
    {
        String binary = Integer.toBinaryString(num);
        String temp = binary.replace('0','2');
        String temp1 = temp.replace('1','0');
        String result = temp1.replace('2','1');
        return Integer.parseInt(result,2);
    }
}
