package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 10-03-2017.
 */
public class MergeSortImpl {
    public static void main(String[] args) {
        int arr[] = new int[]{5,7,8,4,9,1,6};
        merge(0,arr.length-1,arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }

    public static void merge(int low,int high,int arr[])
    {
        if(low == high)
            return;
        int mid = (high + low)/2;
        if(mid >= 0)
        {
            merge(low,mid,arr);
            merge(mid+1,high,arr);
            int i = low,j = mid+1,ct = 0;
            int temp[] = new int[arr.length];
            while((i <= mid) && (j <= high))
            {
                if(arr[i] < arr[j])
                    temp[ct++] = arr[i++];
                else if(arr[i] > arr[j])
                    temp[ct++] = arr[j++];
                else
                {
                    temp[ct++] = arr[i++];
                    temp[ct++] = arr[j++];
                }
            }
            if(i <= mid)
            {
                for(int iter=i;iter<=mid;iter++)
                    temp[ct++] = arr[iter];
            }
            else if(j <= high)
            {
                for(int iter=j;iter<=high;iter++)
                    temp[ct++] = arr[iter];
            }
            for(int k=0,z=low;k<=high-low;k++,z++)
                arr[z] = temp[k];
        }
    }
}
