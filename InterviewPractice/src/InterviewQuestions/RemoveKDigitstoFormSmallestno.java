package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 07-02-2017.
 */
public class RemoveKDigitstoFormSmallestno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String str = scanner.next();
        System.out.println("Enter the number of digits to be removed");
        int k = scanner.nextInt();
        System.out.println(removekdigits(str,k));
    }
    static String removekdigits(String str,int k)
    {
        char[] no = str.toCharArray();
        int len = no.length;
        if(len == 0)
            return no.toString();
        else if(len <= k)
            return "";


    }
}
