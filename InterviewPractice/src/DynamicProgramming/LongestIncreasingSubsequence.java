package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 13-03-2018.
 * Using 2 pointers j and i where j < i, if val at j < val at i, max (incrememnt val at i with val of j + 1, current val of i). Increment j and continue.
 * when J reaches I, increment i and start again from start. Do till i reaches end of array
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        findLongest(new int[]{3,4,-1,0,6,2,3});
    }
    public static void findLongest(int numbers[])
    {
        int arr[] = new int[numbers.length];
        int j =0,i=1;

        for(int k=0;k<arr.length;k++)
            arr[k] = 1;

        while(i < numbers.length)
        {
            if(j >= i)
            {
                j = 0;i++;
            }
            else if(numbers[j] < numbers[i])
            {
                arr[i] = Math.max(arr[i],arr[j]+1);
                j++;
            }
            else
            {
                j++;
            }
        }
        System.out.println(arr[arr.length-1]);

    }
}
