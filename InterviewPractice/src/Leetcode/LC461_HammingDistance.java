package Leetcode;
import java.util.Scanner;

/**
 * Created by Joel on 09-06-2017.
 */
public class LC461_HammingDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hammingDist(scanner.nextInt(),scanner.nextInt()));

    }
    public static int hammingDist(int x,int y)
    {
        int res = x ^ y;
        int counter = 0;
        while(res > 0)
        {
            counter+= res & 1;
            res = res >> 1;
        }
        return counter;
    }
}
