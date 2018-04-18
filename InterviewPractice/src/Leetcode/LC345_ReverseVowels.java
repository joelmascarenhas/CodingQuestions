package Leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Joel on 13-04-2018.
 * Does not consider Uppercase vowels
 */
public class LC345_ReverseVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverseVowels(scanner.next()));
    }
    public static String reverseVowels(String str)
    {
        char arr[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c:arr)
        {
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': stack.push(c);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            switch(arr[i])
            {
                case 'a': arr[i] = stack.pop();break;
                case 'e': arr[i] = stack.pop();break;
                case 'i': arr[i] = stack.pop();break;
                case 'o': arr[i] = stack.pop();break;
                case 'u': arr[i] = stack.pop();break;
            }
        }
        return String.valueOf(arr);
        //return new String(arr);
    }

}
