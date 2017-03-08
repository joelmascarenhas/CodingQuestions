package CodeInterviewBookQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Joel on 07-03-2017.
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sent = scanner.nextLine();
        String collection[] = sent.split(" ");
        ArrayList<StringBuffer> arr = new ArrayList<>();
        for(String s:collection)
        {
            arr.add(new StringBuffer(s));
        }
        StringBuffer finalstr = new StringBuffer();
        for(StringBuffer a:arr)
        {
            a = a.reverse();
            finalstr.append(a);
            finalstr.append(" ");
        }
        System.out.println(finalstr);
   }
}
