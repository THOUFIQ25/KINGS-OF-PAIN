import java.util.*;
import java.lang.*;
import java.io.*;
//AREA OF POLYGON 
/*Print the area of a given polygon. The polygon consists of N vertices (x1, y1), (x2, y2), …, (xN, yN). The vertices (xi, yi) and (xi+1, yi+1) are adjacent for i = 1, 2, …, N−1, and the vertices (x1, y1) and (xN, yN) are also adjacent.
 */
class AReaPol
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++)
        {
            x[i] = w.nextInt();
            y[i] = w.nextInt();
        }
        long area = 0;
        for (int i = 0; i < n; i++)
        {
            int j = (i + 1) % n;
            area += (long) x[i] * y[j] - y[i] * x[j];
        }
        System.out.println(Math.abs(area));
    }
}
/*Sample Input

4

1 1

4 2

3 5

1 4

Your Output

16
*/
