package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Joel on 17-05-2018.
 */
public class LC406_QueueReconstructionByHeight {
    static class QueueObject implements Comparable<QueueObject>
    {
        int h;
        int k;
        QueueObject(int h,int k)
        {
            this.h = h;
            this.k = k;
        }

        @Override
        public int compareTo(QueueObject o) {
            if(o.h - this.h == 0)
                return this.k - o.k;
            return o.h - this.h;

        }
    }
    public static void main(String[] args) {
        int[][] result = reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});
        for(int i=0;i<result.length;i++)
            System.out.println("("+result[i][0]+","+result[i][1]+")");
    }
    public static int[][] reconstructQueue(int[][] people)
    {
        if(people.length == 0)
            return new int[0][0];
        List<QueueObject> result = new LinkedList<>();
        List<QueueObject> list = new ArrayList<>();
        int[][] retArr = new int[people.length][people[0].length];
        for(int i=0;i<people.length;i++)
        {
            list.add(new QueueObject(people[i][0],people[i][1]));
        }
        Collections.sort(list);
        for(QueueObject q:list)
        {
            result.add(q.k,q);
        }
        for(int i=0;i<people.length;i++)
        {
            retArr[i][0] = result.get(i).h;
            retArr[i][1] = result.get(i).k;
        }
        return retArr;
    }
}
