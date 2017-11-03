package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 01-11-2017.
 */
public class PureStorage_CountPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(countPalin(str));
    }
    public static int countPalin(String str)
    {
        /*int size = str.length();
        int arr[][] = new int[size+1][size+1];
        for(int i=0;i<size;i++)
            arr[i][i] = 1;

        for(int j=2;j<=size;j++)
        {
            for(int k=0;k<size;k++)
            {
                int pos = j + k - 1;
                if(pos < size)
                {
                    if(str.charAt(k) == str.charAt(pos))
                        arr[k][pos] = arr[k][pos-1] + arr[k+1][pos] + 1;
                    else
                        arr[k][pos] = arr[k][pos-1] + arr[k+1][pos] - arr[k+1][pos-1];
                }
            }
        }
        return arr[0][size-1];*/

        int size = str.length(),counter,start,end;
        int result = size;
        for(int i=1;i< size - 1;i++)
        {
            counter = 0;
            start = i-1;
            end=i+1;
            while((start >= 0 && end < size) && (str.charAt(start--) == str.charAt(end++)))
            {
                counter++;
            }
            result+=counter;
            counter = 0;
            start = i - 1;
            end = i;
            while((start >= 0 && end < size) && (str.charAt(start--) == str.charAt(end++)))
            {
                counter++;
            }
            result+=counter;
        }
        return result;
    }
}
