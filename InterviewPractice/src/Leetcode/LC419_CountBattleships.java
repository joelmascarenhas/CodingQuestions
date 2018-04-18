package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC419_CountBattleships {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'X','.','.','X'},{'X','.','.','X'},{'X','.','.','X'}};
        System.out.println(countBattleships(board));

    }
    public static int countBattleships(char[][] board) {
        Set<Coordinates> visited = new HashSet<>();
        int shipCount = 0;
        Coordinates co = null;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                 co = new Coordinates(i,j);
                 if(!visited.contains(co) && board[i][j] == 'X')
                 {
                     shipCount++;
                     visited.add(co);
                     DFS(i+1,j,visited,board);
                     DFS(i,j+1,visited,board);
                 }
                 else
                 {
                     continue;
                 }
            }
        }
        return shipCount;
    }
    public static void DFS(int i,int j,Set<Coordinates> visited,char[][] board)
    {
       if(i == board.length || j == board[0].length)
           return;
       else if(board[i][j] == 'X')
       {
           visited.add(new Coordinates(i,j));
           DFS(i+1,j,visited,board);
           DFS(i,j+1,visited,board);
       }
    }
}
class Coordinates
{
    int x;
    int y;
    Coordinates(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
