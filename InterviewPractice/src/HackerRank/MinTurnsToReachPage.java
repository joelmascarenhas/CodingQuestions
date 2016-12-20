package HackerRank;

import java.util.Scanner;

/**
 * Created by Joel on 19-12-2016.
 */
public class MinTurnsToReachPage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextInt();
        float p = in.nextInt();
        int flageven = 0;
        if(n%2==0)
            flageven = 1;

        if(flageven == 1)
            System.out.println((int)(Math.min((int)p/2,Math.ceil((n-p)/2))));
        else
            System.out.println((int)(Math.min((int)p/2,(int)(n-p)/2)));


    }
}
