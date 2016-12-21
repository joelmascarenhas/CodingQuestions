package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Joel on 21-12-2016.
 */
public class HackonacciMatrixRotation {
    static HashMap<Integer,Long> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        boolean matrix[][] = new boolean[n][n];
        boolean newmatrix[][] = new boolean[n][n];
        ArrayList<Long> fud = new ArrayList<>();
        boolean no;
        double ans = 0;
        map.put(1,1l);
        map.put(2,2l);
        map.put(3,3l);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans = Math.pow(((i+1)*(j+1)),2);
                no = hackonacci((long)ans);
                matrix[i][j] = no;
            }
        }
        for(int a0 = 0; a0 < q; a0++){
            int angle = in.nextInt();
            int times = (angle / 90)% 4;
            if(times == 0)
                newmatrix = matrix;
            else if(times == 1)
                newmatrix = rotatematrix(matrix);
            else if(times == 2)
            {
                newmatrix = rotatematrix(matrix);
                newmatrix = rotatematrix(newmatrix);
            }
            else if(times == 3)
            {
                newmatrix = rotatematrix(matrix);
                newmatrix = rotatematrix(newmatrix);
                newmatrix = rotatematrix(newmatrix);
            }

            long count = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(matrix[i][j] != newmatrix[i][j])
                        count++;
                }
            }
            fud.add(count);
        }
        for(long var:fud)
        {
            System.out.println(var);
        }

    }

    public static boolean[][] rotatematrix(boolean[][] matrix) {
        final int m = matrix.length;
        boolean[][] ret = new boolean[m][m];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < m; c++) {
                ret[c][m-1-r] = matrix[r][c];
            }
        }
        return ret;
    }

    public static boolean hackonacci(long n)
    {
        int result = (int)n%7;
        switch(result)
        {
            case 0:
            case 1:
            case 3:
            case 6:
                return false;
        }
        return true;
    }
}


