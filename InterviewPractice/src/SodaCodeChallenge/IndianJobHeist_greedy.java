package SodaCodeChallenge;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joel on 18-02-2017.
 */
public class IndianJobHeist_greedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Testcases");
        int t = scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println(checkcombination());
        }
    }
    public static String checkcombination()
    {
        Scanner scanner = new Scanner(System.in);
        int robcount = scanner.nextInt();
        int time = scanner.nextInt();
        int arr[] = new int[robcount];
        for(int i=0;i<robcount;i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int timeleft1 = time;
        int timeleft2 = time;
        for(int j=robcount-1;j>=0;j--)
        {
            if(arr[j] > Math.max(timeleft1,timeleft2))
                return "NO";
            else if(timeleft1 > timeleft2)
                timeleft1-= arr[j];
            else
                timeleft2-= arr[j];
        }
        return "YES";
    }
}
