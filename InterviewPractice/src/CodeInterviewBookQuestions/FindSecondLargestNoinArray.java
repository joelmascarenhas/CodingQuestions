package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 03-02-2017.
 */
public class FindSecondLargestNoinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Size");
        int no = scanner.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(SecondSmallestElement(arr));
    }
    static int SecondSmallestElement(int arr[])
    {
        int min,min2,temp;
        min = min2 = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }
}
