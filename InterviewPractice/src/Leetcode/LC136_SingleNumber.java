package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 21-06-2017.
 */
public class LC136_SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[scanner.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result = arr[0];
        for(int i=1;i<arr.length;i++)
        {
         result = result ^ arr[i];
        }
        System.out.println(result);
    }

}
