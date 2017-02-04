package CodeInterviewBookQuestions;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Joel on 03-02-2017.
 */
public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Size");
        int no = scanner.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Sum");
        int sum = scanner.nextInt();
        System.out.println(Countofpairs(arr,sum));
    }
    static int Countofpairs(int arr[],int sum)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp,count=0;
        for(int a:arr)
        {
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else
                map.put(a,1);
        }
        for(int a:arr)
        {
            temp = sum - a;
            if((temp == a)&&(map.get(a)>1))
            {
                count+=map.get(a)-1;
            }
            else if(map.containsKey(temp)&&(temp!=a))
                count+=map.get(temp);
        }
        return (count%2==0)?count/2:(count/2)+1;
    }
}
