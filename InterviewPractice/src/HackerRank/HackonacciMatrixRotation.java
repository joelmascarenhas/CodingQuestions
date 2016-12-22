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
        HashMap<Integer,Long> rotmatrix = new HashMap<>();
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

        newmatrix = rotatematrix(matrix);
        rotmatrix.put(1,checkdiff(matrix,newmatrix));
        newmatrix = rotatematrix(newmatrix);
        rotmatrix.put(2,checkdiff(matrix,newmatrix));
        newmatrix = rotatematrix(newmatrix);
        rotmatrix.put(3,checkdiff(matrix,newmatrix));
        long count = 0;

        for(int a0 = 0; a0 < q; a0++){
            int angle = in.nextInt();
            int times = (angle / 90)% 4;

            if(rotmatrix.containsKey(times))
                count = rotmatrix.get(times);
            else
                count = 0;
            fud.add(count);
        }
        for(long var:fud)
        {
            System.out.println(var);
        }

    }
    public static long checkdiff(boolean[][] matrix1,boolean[][] matrix2)
    {
        long count = 0;
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1.length;j++)
            {
                if(matrix1[i][j] != matrix2[i][j])
                    count++;
            }
        }
        return count;
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
        int result = (int)(n%7l);
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


