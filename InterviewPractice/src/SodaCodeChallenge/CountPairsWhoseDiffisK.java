package SodaCodeChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 18-02-2017.
 */
public class CountPairsWhoseDiffisK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Size");
        int no = scanner.nextInt();
        System.out.println("Enter Diff No");
        int diff = scanner.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Countpairs(arr,diff));
    }
    public static int Countpairs(int arr[],int diff)
    {
        Set<Integer> set = new HashSet<Integer>();
        int temp=0,count=0;
        for(int a:arr)
        {
            if(set.contains(a))
                continue;
            else
                set.add(a);
        }

        for(int a:arr)
        {
            temp = diff + a;
            if(set.contains(temp))
                count+=1;
        }
        return count;
    }
}
