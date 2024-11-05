import java.util.*;
import java.lang.*;
import java.io.*;
//NcR
class NcR
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int r = w.nextInt();
        int res = (fact(n)) / ((fact(n - r)) * fact(r));
        System.out.println(res);
    }
    public static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
        {
            res = res * i;
        }
        return res;
    }
}
/*Sample Input

5 3

Your Output

10
*/
