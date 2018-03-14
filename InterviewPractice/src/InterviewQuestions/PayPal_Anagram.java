package InterviewQuestions;

/**
 * Created by Joel on 27-02-2018.
 */
public class PayPal_Anagram {
    public static void main(String[] args) {
        int res[] = getMinimumDifference(new String[]{"tea","act","toe"},new String[]{"ate","acts","tea"});
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
    public static int [] getMinimumDifference(String a[], String b[])
    {
        int len = a.length;
        int[] result = new int[len];
        for(int i=0;i<len;i++)
        {
            int count[] = new int[26];
            for(int k=0;k<26;k++)
            {
                count[k] = 0;
            }
            char[] str1 = a[i].toCharArray();
            char[] str2 = b[i].toCharArray();
            if(str1.length != str2.length)
            {
                result[i] = -1;
            }
            else
            {
                for(int j=0;j<str1.length;j++)
                {
                    count[str1[j]-'a']+=1;
                    count[str2[j]-'a']-=1;
                }
                int sum =0;
                for(int j=0;j<26;j++)
                {
                    if(count[j] > 0)
                        sum+=count[j];
                }
                result[i] = sum;
            }
        }
        return result;
    }
}
