package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Joel on 11-06-2017.
 */
public class LC412_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<String> res = fizzBuzz(num);
        for(String str:res)
            System.out.println(str);
    }
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
         if(i%15 == 0)
             res.add("Fizzbuzz");
         else if(i%3 ==0)
             res.add("Fizz");
         else if(i%5 == 0)
             res.add("Buzz");
         else res.add(Integer.toString(i));
        }
        return res;

    }
}
