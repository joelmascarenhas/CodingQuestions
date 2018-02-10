package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 09-02-2018.
 */
public class NextCapital_StringManipulation {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int no = scanner.nextInt();
            String[] str = new String[no];
            for(int i=0;i<no;i++)
            {
                str[i] = scanner.next();
            }
            strengthenPasswords(str);
            for(int i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
            }

    }
    public static String[] strengthenPasswords(String[] passwords) {

            String[] res = new String[passwords.length];
            char arr[];
            for(int i=0;i<passwords.length;i++)
            {
                res[i] = passwords[i].replace('s','5');
                res[i] = res[i].replace('S','5');
                if(res[i].length()%2 == 0)
                {
                    char tempStart = convertCase(res[i].charAt(0));
                    char tempEnd = convertCase(res[i].charAt(res[i].length()-1));
                    arr = res[i].toCharArray();
                    arr[0] = tempEnd;
                    arr[arr.length-1] = tempStart;
                    res[i] = new String(arr);
                }
                else
                {
                    if(res[i].length() > 1 && Character.isDigit(res[i].charAt(res[i].length()/2)))
                    {
                        int len = res[i].length()/2;
                        int val = Character.getNumericValue(res[i].charAt(res[i].length()/2));
                        String resStart = res[i].substring(0,len);
                        String resEnd = res[i].substring(len+1,res[i].length());
                        res[i] = resStart+ String.valueOf(val*2) + resEnd;
                    }
                }
                if(res[i].toLowerCase().contains("nextcapital"))
                {
                    int val = res[i].toLowerCase().indexOf("nextcapital");
                    char[] arrnew = res[i].toCharArray();
                    char temp = arrnew[val+3];
                    arrnew[val+3] = arrnew[val];
                    arrnew[val+3] = temp;

                    temp = arrnew[val+2];
                    arrnew[val+2] = arrnew[val+1];
                    arrnew[val+1] = temp;
                    res[i] = new String(arrnew);
                }

            }
        return res;
    }

    public static char convertCase(char letter)
    {
        char res;
        if(Character.isUpperCase(letter))
            res = Character.toLowerCase(letter);
        else
            res = Character.toUpperCase(letter);
        return res;
    }
}

