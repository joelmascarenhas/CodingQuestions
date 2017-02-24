package InterviewQuestions;

/**
 * Created by Joel on 07-02-2017.
 */
public class NoOfIslands {
    public static void main(String[] args) {
        int arr1[][]=  new int[][] {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 1}
        };
        int arr[][]=  new int[][] {{0, 0, 0},
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
                {0, 0, 1},
                {1, 1, 0}
        };
        Islands I = new Islands();
        System.out.println("Number of islands is: "+ I.countNoOfIslands(arr));
    }
}
class Islands
{
    boolean checkifposvalid(int arr[][],int rows,int cols,int i,int j,boolean visited[][])
    {
        return (i >= 0) && (i < rows) &&
                (j >= 0) && (j < cols) &&
                (arr[i][j]==1 && !visited[i][j]);
    }

    public void runDFS(int arr[][],int rows,int cols,int i,int j,boolean visited[][])
    {
        //Elements around the given cell
        int rowIndicesAround[] = new int[]{-1, 0, 0, 1};
        int colIndicesAround[] = new int[]{0, -1, 1, 0};

        visited[i][j] = true;

        for(int it=0;it<rowIndicesAround.length;it++)
        {
            if(checkifposvalid(arr,rows,cols,i+rowIndicesAround[it],j+colIndicesAround[it],visited))
                runDFS(arr,rows,cols,i+rowIndicesAround[it],j+colIndicesAround[it],visited);
        }
    }
    public int countNoOfIslands(int arr[][])
    {
    int rows = arr.length;
    int cols = arr[0].length;
    boolean visited[][] = new boolean[rows][cols];
    int count = 0;
    for(int i = 0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if(arr[i][j] == 1 && visited[i][j]==false)
            {
                runDFS(arr,rows,cols,i,j,visited);
                count++;
            }
        }
    }
    return count;
    }
}
