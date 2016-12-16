package CodeInterviewBookQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Joel on 15-12-2016.
 */
public class CheckStringsarePermutation {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        char stringarray1[] = str1.toCharArray();
        char stringarray2[] = str2.toCharArray();
        java.util.Arrays.sort(stringarray1);
        java.util.Arrays.sort(stringarray2);
        System.out.println(Arrays.equals(stringarray1,stringarray2));
    }*/
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        int count,flag =0;
        for(char iter : array1)
        {
            if(map.containsKey(iter))
            {
                count = map.get(iter);
                map.put(iter,count++);
            }
            else
                map.put(iter,1);

        }

        for(char iter1 : array2)
        {
            if(map.containsKey(iter1))
            {
                count = map.get(iter1);
                if(--count < 0)
                {
                    System.out.println("Strings are not a permutation");
                    flag = 1;
                    break;
                }
                map.put(iter1,count);
            }
            else
            {
                System.out.println("Strings are not a permutation");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Strings are a permutation");

    }
}
