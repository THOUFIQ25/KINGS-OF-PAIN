import java.util.*;
import java.lang.*;
import java.io.*;
//NUMBER OF RECTANGLES
class NoRec
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int count = 0;
        for (int rows = 1; rows <= n; rows++)
        {
            for (int col = rows; rows * col <= n; col++)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
/*Sample Input

6

Your Output

8
*/
