package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC778_RisingWater {
    public static void main(String[] args) {
        //int[][] grid = new int[][]{{0,2},{1,3}};
        //int[][] grid = new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        //int[][] grid = new int[][]{{0,1,2,3,4},{12,13,14,15,16},{24,23,22,21,5},{11,17,18,19,20},{10,9,8,7,6}};
        int[][] grid = new int[][]{{10,12,4,6},{9,11,3,5},{1,7,13,8},{2,0,15,14}};
        System.out.println(swimInWater(grid));
    }
    public static int swimInWater(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int i = row-1,j = col - 1;
        Point left = null,right = null,up = null,down = null;
        int result = grid[i][j];
        Set<Point> set = new HashSet<>();
        List<Point> points = new ArrayList<>();
        set.add(new Point(i,j,grid[i][j]));
        while(true)
        {
            if(checkValid(i,j-1,row,col,set))
                left = new Point(i,j-1,grid[i][j-1]);
            if(checkValid(i,j+1,row,col,set))
                right = new Point(i,j+1,grid[i][j+1]);
            if(checkValid(i-1,j,row,col,set))
                up = new Point(i-1,j,grid[i-1][j]);
            if(checkValid(i+1,j,row,col,set))
                down = new Point(i+1,j,grid[i+1][j]);
            points.add(left);
            points.add(right);
            points.add(up);
            points.add(down);

            Point res = findMin(points);
            set.add(res);
            if(res.val > result)
                result = res.val;
            i = res.i;
            j = res.j;
            left = right = up = down = null;
            points.clear();
            if(i == 0 && j == 0)
                break;
        }
        return result;
    }
    public static boolean checkValid(int i, int j, int row, int col, Set<Point> set)
    {
        if(i < 0 || j < 0 || i >= row || j >= col || set.contains(new Point(i,j,0)))
            return false;
        else return true;
    }
    public static Point findMin(List<Point> list)
    {
        int min = Integer.MAX_VALUE;
        Point result = null;
        for(Point pt:list)
        {
            if(pt != null && pt.val < min)
            {
                min = pt.val;
                result = pt;
            }
        }
        return result;
    }
}
class Point
{
    int i;
    int j;
    int val;
    Point(int i,int j,int val)
    {
        this.i = i;
        this.j = j;
        this.val = val;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (i != point.i) return false;
        return j == point.j;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        return result;
    }
}