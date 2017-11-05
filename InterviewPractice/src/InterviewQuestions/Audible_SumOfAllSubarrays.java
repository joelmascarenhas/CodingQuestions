package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 03-11-2017.
 */
public class Audible_SumOfAllSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(calculateSum(arr));
    }
    public static int calculateSum(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+= arr[i] * (arr.length - i) * (i + 1);
        }
        return sum;
    }
}
