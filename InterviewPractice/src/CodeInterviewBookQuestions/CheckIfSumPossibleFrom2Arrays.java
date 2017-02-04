package CodeInterviewBookQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Joel on 04-02-2017.
 */
public class CheckIfSumPossibleFrom2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st Array Size");
        int no = scanner.nextInt();
        System.out.println("Enter Elements");
        int a[] = new int[no];
        for(int i=0;i<no;i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println("2nd Array Size");
        no = scanner.nextInt();
        System.out.println("Enter Elements");
        int b[] = new int[no];
        for(int i=0;i<no;i++)
        {
            b[i] = scanner.nextInt();
        }
        int TotSum = scanner.nextInt();
        System.out.println("TotalSum possible from 2 matrices = " + CheckTotalSumPossible(a,b,TotSum));
    }
    static boolean CheckTotalSumPossible(int a[],int b[],int TotSum)
    {
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        for(int i:a)
        {
            if(!set.contains(i))
                set.add(i);
        }
        for(int j:b)
        {
            temp = TotSum - j;
            if(set.contains(temp))
                return true;
        }
        return false;
    }
}
