package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 19-03-2017.
 */
public class BestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        String res = rotate(x,y);
        System.out.println(res);
    }
    static String rotate(String x, String y) {
        String str1 = x.toLowerCase()+x.toLowerCase();
        String str2 = y+y;
        char max1 = x.charAt(0);
        int pos = 0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i) > max1)
            {
                pos = i;
                max1 = x.charAt(i);
            }
            else if(x.charAt(i) == max1)
            {
                String substr1 = str1.substring(i,i+x.length());
                String maxstr2 = str1.substring(pos,pos+x.length());
                for(int k=0;k< maxstr2.length();k++)
                {
                    if(maxstr2.charAt(k) < substr1.charAt(k))
                    {
                        max1 = x.charAt(i);
                        pos = i;
                    }
                }
            }
        }
        String res1 = str1.substring(pos,pos+x.length());

        max1 = y.charAt(0);
        pos = 0;
        for(int i=0;i<y.length();i++)
        {
            if(y.charAt(i) > max1)
            {
                max1 = y.charAt(i);
                pos = i;
            }
            else if(y.charAt(i) == max1)
            {
                String substr1 = str2.substring(i,i+y.length());
                String maxstr2 = str2.substring(pos,pos+y.length());
                for(int k=0;k< maxstr2.length();k++)
                {
                    if(maxstr2.charAt(k) < substr1.charAt(k))
                    {
                        max1 = y.charAt(i);
                        pos = i;
                    }
                }
            }
        }
        String res2 = str2.substring(pos,pos+y.length());

        return (res1+res2);
    }

}
