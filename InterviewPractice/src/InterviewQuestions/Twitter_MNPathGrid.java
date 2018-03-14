package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 12-02-2018.
 */
public class Twitter_MNPathGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(krakenCount(m,n));
    }
    public static int krakenCount(int m, int n) {
        int res;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                    arr[i][j] = 1;
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j-1];
            }
        }
        return arr[m-1][n-1];
    }

}
