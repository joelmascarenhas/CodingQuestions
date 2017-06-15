package HackerRank;

import java.util.*;
import java.lang.*;

/**
 * Created by Joel on 14-06-2017.
 */
public class WoC33_TransformToPalindrome {
    private static Map<Integer,HashSet<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        for(int a0 = 0; a0 < k; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            addKeyValue(x,y);
            addKeyValue(y,x);
        }
        int[] a = new int[m];
        for(int a_i=0; a_i < m; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(findLongestPalindrome(a));
    }
    public static void addKeyValue(int key,int value)
    {
        if(map.containsKey(key))
            map.get(key).add(value);
        else
        {
            HashSet<Integer> temp_add = new HashSet<>();
            temp_add.add(value);
            map.put(key,temp_add);
        }
    }
    public static int findLongestPalindrome(int[] a)
    {
        int[][] dp_arr = new int[a.length][a.length];
        int max = a.length;
        for(int k=0;k<a.length;k++)
        {
            for(int i=0,j=k;i<max-k && j<max;i++,j++)
            {
                if(i == j)
                    dp_arr[i][j] = 1;
                else if((a[i] == a[j]) || (checkDFS(a[i],a[j])))
                {
                    dp_arr[i][j] = 2 + dp_arr[i+1][j-1];
                }
                else
                    dp_arr[i][j] = Math.max(dp_arr[i][j-1],dp_arr[i+1][j]);
            }
        }
        return dp_arr[0][a.length-1];
    }
    public static boolean checkDFS(int num1,int num2)
    {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(num1);
        while(!stack.isEmpty())
        {
         int temp = stack.pop();
         if(temp == num2)
            return true;
         HashSet<Integer> temp_set = map.get(temp);
         if(temp_set == null)
             continue;
         visited.add(temp);
         for(int a:temp_set)
            {
                if(visited.contains(a))
                    continue;
                stack.push(a);
            }
        }
        return false;
    }
}

