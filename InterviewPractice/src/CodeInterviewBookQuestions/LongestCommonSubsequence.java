package CodeInterviewBookQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 31-01-2017.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2;
        System.out.println("String 1");
        str1 = scanner.next();
        System.out.println("String 2");
        str2 = scanner.next();
        System.out.println(checkSubsequence(str1,str2));

    }
    public static String checkSubsequence(String str1,String str2)
    {
        int[][] arr = new int[str1.length()+1][str2.length()+1];
        String result = "";
        for(int i=0;i<str1.length()+1;i++)
        {

            for(int j=0;j<str2.length()+1;j++)
            {
                if(i == 0 || j == 0)
                    arr[i][j] = 0;
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    arr[i][j] = arr[i-1][j-1] + 1;
                }
                else
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);

            }
        }
        System.out.println("LCS = "+arr[str1.length()][str2.length()]);

        //Backtracking
        for(int i=str1.length(),j=str2.length();i>0&&j>0;)
        {
            if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    result+= str1.charAt(i-1);
                    i-= 1;
                    j-= 1;
                }
            else if(arr[i][j] == arr[i][j-1])
                j-= 1;
            else
                i-= 1;

        }

        return new StringBuffer(result).reverse().toString();
    }
}

