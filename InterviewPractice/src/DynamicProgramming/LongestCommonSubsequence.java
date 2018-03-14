package DynamicProgramming;

import java.util.Scanner;

/**
 * Created by Joel on 13-03-2018.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();*/
        //System.out.println(findLCS(s1,s2));
        System.out.println(findLCS("abcdaf","acbcf"));

    }
    public static String findLCS(String s1,String s2)
    {
        int arr[][] = new int[s2.length()+1][s1.length()+1];
        for(int i=0;i<s2.length()+1;i++)
        {
            for(int j=0;j<s1.length()+1;j++)
            {
                if(i==0 || j==0)
                    arr[i][j] = 0;
                else if(s2.charAt(i-1) == s1.charAt(j-1))
                {
                    arr[i][j] = 1 + arr[i-1][j-1];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
                }

            }
        }
        System.out.println(arr[arr.length-1][arr[0].length-1]);
        return "";
    }
}
