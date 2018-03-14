package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 13-03-2018.
 * Creating 2 arrays, arr keeps track of how many coins make up the given value
 * coinArr at the given point says which coin (by storing the index) in the coin array contributes to the value needed
 */
public class CoinChange {
    public static void main(String[] args) {
        System.out.println(findCoins(new int[]{7,2,3,6},13));
    }
    public static List<Integer> findCoins(int[] coins, int value)
    {
        int arr[] = new int[value+1];
        int coinArr[] = new int[value+1];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.MAX_VALUE;
            coinArr[i] = -1;
        }
        arr[0] = 0;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(j >= coins[i])
                {
                    int temp = arr[j];
                    if(arr[j-coins[i]] != Integer.MAX_VALUE)
                    {
                        arr[j] = Math.min(arr[j],1+ arr[j-coins[i]]);
                        if(temp != arr[j])
                            coinArr[j] = i;
                    }
                }
            }
        }
        System.out.println(arr[arr.length-1]);
        res.add(coins[coinArr[coinArr.length-1]]);
        int val = value - coins[coinArr[coinArr.length-1]];
        while(val != 0)
        {
            res.add(coins[coinArr[val]]);
            val = val - coins[coinArr[val]];
        }
        return res;
    }
}
