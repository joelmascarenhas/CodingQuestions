package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Joel on 02-11-2017.
 */
public class LiveRamp_HolidayScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findRange(arr));
    }
    public static int findRange(int arr[])
    {
        Map<Integer,Integer> map = new HashMap<>();
        int len=arr.length,startpos=0,endpos=0;
        for(int i=0;i<len;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<len;i++)
        {
            int val=map.get(arr[i]);
            val-=1;
            if(val == 0)
            {
                startpos=i;
                break;
            }
            else{
                map.put(arr[i],val);
            }
        }

        for(int i=len-1;i>=startpos;i--)
        {
            int val=map.get(arr[i]);
            val-=1;
            if(val == 0)
            {
                endpos=i;
                break;
            }
            else{
                map.put(arr[i],val);
            }
        }
        return (endpos-startpos+1);
    }
}
