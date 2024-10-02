import java.util.*;
import java.lang.*;
import java.io.*;

/*You are given an N x M binary matrix called "image". You need to perform the following operations on the matrix (in order) and 
return the resulting image:
Flip the image horizontally: 
This involves reversing the order of elements in each row of the matrix. For example, [1,0,1,0,0,0] becomes [0,0,0,1,0,1]
Invert the image: This involves replacing 0s with 1s and 1s with 0s in the entire matrix. 
For example, [0,0,0,1,0,1] becomes [1,1,1,0,1,0]*/
class ImageFlip
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int m = w.nextInt();
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                ar[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            int left = 0;
            int right = m - 1;
            while (left < right)
            {
                int t = ar[i][left];
                ar[i][left] = ar[i][right];
                ar[i][right] = t;
                left++;
                right--;
            }

        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                ar[i][j] = ar[i][j] == 0 ? 1 : 0;
            }

        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }



    }
}
/*Sample Input

2 2



1 0



0 1



Your Output

1 0 
0 1 
*/
