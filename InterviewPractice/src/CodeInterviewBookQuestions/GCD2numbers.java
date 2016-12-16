package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 14-12-2016.
 */
public class GCD2numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gcdcalc(scanner.nextInt(),scanner.nextInt()));

    }
    static int gcdcalc(int num1, int num2)
    {
        int remainder = num1%num2;
        System.out.println(remainder + " " +num1 + " " +num2);
        if(remainder == 0)
            return num2;

        return gcdcalc(num2,remainder);
    }
}
