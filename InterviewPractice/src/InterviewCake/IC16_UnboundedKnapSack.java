package InterviewCake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 07-03-2018.
 */
public class IC16_UnboundedKnapSack {
    public static void main(String[] args) {
        List<CakeType> list = new ArrayList();
        /*TC1
        list.add(new CakeType(2,15));
        list.add(new CakeType(3,35));
        list.add(new CakeType(7,160));
        System.out.println(maxValue(list,15))*/

        /*TC2
        list.add(new CakeType(1,10));
        list.add(new CakeType(3,40));
        list.add(new CakeType(4,50));
        list.add(new CakeType(5,70));
        System.out.println(maxValue(list,8));*/

        /*TC3
        list.add(new CakeType(1,1));
        list.add(new CakeType(50,30));
        System.out.println(maxValue(list,100));*/

        /*TC4
        System.out.println(maxValue(null,10));*/

        /*TC5*/
        System.out.println(maxValue(new ArrayList<CakeType>(),10));
    }
    public static int maxValue(List<CakeType> list,int weight)
    {
        if(list == null || weight == 0 || list.size() == 0)
            return 0;

        int[][] arr = new int[list.size()][weight+1];
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<=weight;j++)
            {
                if(j==0)
                    arr[i][j] = 0;
                else
                {
                    if(j < list.get(i).weight)
                    {
                        if(i == 0)
                            arr[i][j] = arr[i][j-1];
                        else
                            arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
                    }
                    else
                        {
                            if(i == 0)
                                arr[i][j] = Math.max(arr[i][j-1],list.get(i).value + arr[i][j - list.get(i).weight]);
                            else
                                arr[i][j] = Math.max(arr[i-1][j],list.get(i).value + arr[i][j - list.get(i).weight]);
                        }
                }
            }
        }
        return arr[arr.length-1][arr[0].length-1];
    }


}

class CakeType
{
    int weight;
    int value;
    public CakeType(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
    }
}
