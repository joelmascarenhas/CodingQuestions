package InterviewQuestions;

/**
 * Created by Joel on 05-03-2018.
 */
public class Cerner_NumberPalindromeCheck {
    public static void main(String[] args) {
        int res[] = NumberCheck(123);
        System.out.println(res[0] + "   " + res[1]);
    }
    public static int[] NumberCheck(int num)
    {
        int res[] = new int[2];
        int count = 0;
        int temp = num;
        while(true)
        {
            int newNumber = temp + reverseNumber(temp);
            if(checkPalindrome(newNumber))
            {
                res[0] = count;
                res[1] = newNumber;
                break;
            }
            else
            {
                count++;
                temp = newNumber;
            }
        }

        return res;
    }
    public static int reverseNumber(int num)
    {
        StringBuilder str = new StringBuilder().append(num);
        return Integer.parseInt(str.reverse().toString());
    }

    public static boolean checkPalindrome(int num)
    {
        StringBuilder str = new StringBuilder().append(num);
        if(Integer.parseInt(str.reverse().toString()) == num)
            return true;
        else return false;
    }


}
