package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Joel on 24-02-2017.
 */
public class LargestRectInHist_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Histogram Size");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
            arr[i]=scanner.nextInt();
        System.out.println(largestRect(size,arr));
    }
    static int largestRect(int size,int arr[])
    {
        int maxarea = 0,prevpos = 0;
        Stack<Integer> heightStack = new Stack<Integer>();
        Stack<Integer> posStack = new Stack<Integer>();
        heightStack.push(arr[0]);
        posStack.push(arr[0]);
        for(int i=1;i<size;i++)
            {
            if(arr[i]>arr[i-1])
                {
                heightStack.push(arr[i]);
                posStack.push(arr[i]);
                }
            else if(arr[i]>arr[i-1])
                {
                while(heightStack.pop() > arr[i] && !heightStack.isEmpty())
                    {

                    }
                }


            }
    return 0;
    }
}
