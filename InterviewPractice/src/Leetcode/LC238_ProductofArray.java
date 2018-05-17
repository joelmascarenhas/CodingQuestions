package Leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 20-04-2018.
 */
public class LC238_ProductofArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        //arr.addAll(Arrays.asList(findproduct(new int[]{1,2,3,4})));
        System.out.println(arr.toString());
    }

    public static int[] findproduct(int arr[])
    {
        int resultLeft[] = new int[arr.length];
        int resultRight[] = new int[arr.length];
        int result[] = new int[arr.length];
        //Left Calculation
        resultLeft[0] = 1;
        for(int i=1;i<arr.length;i++)
        {
            resultLeft[i]*= arr[i-1];
        }

        //Right Calculation
        resultRight[arr.length-1] = 1;
        for(int j=arr.length-2;j>0;j--)
        {
            resultRight[j]*= arr[j+1];
        }
        for(int k=0;k<arr.length;k++)
            result[k] = resultLeft[k] * resultRight[k];
        return result;
    }

}
