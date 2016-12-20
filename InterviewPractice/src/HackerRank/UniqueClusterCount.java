package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Joel on 20-12-2016.
 */
public class UniqueClusterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        double nobuttons;
        int buttons = 0,sum = 0,max =0;
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int a_i=0; a_i < n; a_i++)
        {
            nobuttons = Math.ceil((float) a[a_i] / p);
            buttons = (int) nobuttons;
            if(buttons > max)
                max = buttons;
            else if(buttons <= max)
                max = max + 1;
            sum = sum + max;
        }
        System.out.println(sum);
    }
}
