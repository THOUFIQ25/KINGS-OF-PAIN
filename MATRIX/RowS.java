import java.util.*;
import java.lang.*;
import java.io.*;
//MATRIX ROW SUM
class RowS
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int m = w.nextInt();
        for (int i = 0; i < n; i++)
        {
            int res = 0;
            for (int j = 0; j < m; j++)
            {
                int ele = w.nextInt();
                res += ele;
            }
            System.out.println(res);
        }


    }
}
/*Sample Input

2 3



5 -1 3



19 8 -5

Your Output

7
29
*/
