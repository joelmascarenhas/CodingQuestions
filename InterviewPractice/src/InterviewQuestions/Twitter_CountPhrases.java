package InterviewQuestions;

/**
 * Created by Joel on 03-11-2017.
 */
public class Twitter_CountPhrases {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
    }
    public static int maxLength(int[] a, int k) {
        int arr[] = prefixSum(a);
        int max = -1,curr_max;
        for(int i=0;i<arr.length-1;i++)
        {
            curr_max = BinSearch(arr,arr[i],i,arr.length-1,k) - i;
            if(curr_max > max)
                max = curr_max;
        }
        return max;

    }
    public static int[] prefixSum(int a[])
    {
        int size = a.length;
        int res[] = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++)
        {
            sum = sum + a[i];
            res[i] = sum;
        }
        return res;
    }
    public static int BinSearch(int arr[],int startVal,int start,int end,int k)
    {
        if(start == end)
            return end;

        int mid = start + (end - start)/2;
        if(arr[mid] - startVal == k)
            return mid;
        else
        {
            if((arr[mid] - startVal) < k)
            {
                if((arr[mid + 1] - startVal) > k)
                    return mid;
                else
                    return BinSearch(arr,startVal,mid+1,end,k);
            }
            else
                return BinSearch(arr,startVal,start,mid,k);
        }
    }
}
