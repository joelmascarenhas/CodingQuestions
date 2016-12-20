package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Joel on 15-12-2016.
 */
public class MakingAnagramsbyDeletions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int delcount = 0,i=0,j=0;
        for(;i<arr1.length && j<arr2.length;)
        {
            if(arr1[i] == arr2[j])
            {
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j])
            {
                delcount++;
                j++;
            }
            else
            {
                delcount++;
                i++;
            }
        }
        delcount+= arr1.length - i + arr2.length - j;
        System.out.println(delcount);
    }
}
