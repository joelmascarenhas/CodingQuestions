package InterviewQuestions;

/**
 * Created by Joel on 05-12-2017.
 */
public class PureStorage_BreakingBinarySearch {
    public static void main(String[] args) {
        int size = 5;
        System.out.println(size);
        int[] arr = new int[]{1,2,3,4,5};
        String str = "";
        for(int i=0;i<arr.length;i++)
        {
            str+= String.valueOf(arr[i]) + " ";
        }
        System.out.println(str);
        int target = 3;
        System.out.println(target);
    }
}
