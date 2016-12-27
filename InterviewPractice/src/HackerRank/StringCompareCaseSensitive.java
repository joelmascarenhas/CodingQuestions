package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Joel on 26-12-2016.
 */
public class StringCompareCaseSensitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String,Integer> dict = new HashMap<>();
        String magazine[] = new String[m];
        int count = 0,currcount,tempcount;
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
            if(dict.containsKey(magazine[magazine_i]))
            {
                currcount = dict.get(magazine[magazine_i]);
                dict.put(magazine[magazine_i],currcount+1);

            }
            else
                dict.put(magazine[magazine_i],1);
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            if(dict.containsKey(ransom[ransom_i])) {
                tempcount = dict.get(ransom[ransom_i]);
                if (tempcount <= 0)
                    break;
                else {
                    count += 1;
                    tempcount -= 1;
                    dict.put(ransom[ransom_i], tempcount);
                }
            }
        }
        if(count == ransom.length)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
