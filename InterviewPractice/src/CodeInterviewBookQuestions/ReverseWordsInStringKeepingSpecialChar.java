package CodeInterviewBookQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/**`
 * Created by Joel on 08-03-2017.
 */
public class ReverseWordsInStringKeepingSpecialChar {
    public static void main(String[] args) {
        char col[] = new Scanner(System.in).nextLine().toCharArray();
        char tempstr[] = new char[col.length];
        StringBuffer temp = new StringBuffer();
        int j = 0;
        for(int i=0;i<col.length;i++)
        {
            if((col[i] >= 65 && col[i] <= 90)||(col[i] >= 97 && col[i] <= 122)|| (col[i] == ' '))
            {
                temp.append(col[i]);
            }
        }
        String str[] = temp.toString().split(" ");
        ArrayList<StringBuffer> arr = new ArrayList<>();
        for(String c:str)
        {
            arr.add(new StringBuffer(c));
        }
        StringBuffer finalstr = new StringBuffer();
        for(StringBuffer s:arr)
        {
            s = s.reverse();
            finalstr.append(s);
        }
        String s = finalstr.toString();
        char revarr[] = s.toCharArray();
        char reversedString[] = new char[col.length];
        j = 0;
        for(int i=0;i<col.length;i++)
        {
            if((col[i] >= 65 && col[i] <= 90)||(col[i] >= 97 && col[i] <= 122))
            {
                reversedString[i] = revarr[j];
                j++;
            }
            else
                reversedString[i] = col[i];
        }
        System.out.println(reversedString);
    }
}
