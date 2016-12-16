package HackerRank;

import java.util.Scanner;

/**
 * Created by Joel on 15-12-2016.
 */
public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        for(int iter=k;iter < n;iter++)
        {
            System.out.print(a[iter] + " ");
        }
        for(int iter1=0;iter1 < k;iter1++)
        {
            System.out.print(a[iter1] + " ");
        }

    }
}
