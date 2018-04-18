package Leetcode;

/**
 * Created by Joel on 16-04-2018.
 */
public class LC796_RotateString {
    public static void main(String[] args) {
        //System.out.println(checkRotation("abcde","cdeab")); //True
        System.out.println(checkRotation("abcde","abced")); //False

    }

    public static boolean checkRotation(String a,String b)
    {
        if(a.length() != b.length())
            return false;
        if(new String(a+a).contains(b))
            return true;
        else
            return false;
    }
}
