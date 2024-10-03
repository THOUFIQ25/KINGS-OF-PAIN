import java.util.*;
import java.lang.*;
import java.io.*;
//CATALAN NUMBER
/*First Few Catalan Numbers

The first few Catalan numbers are:

    C0==1
    C1==1
    C2==2
    C3==5
    C4==14
    C5==42*/
class CatalanNum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        System.out.println(iscat(n));
    }
    public static int iscat(int n)
    {
        if (n == 0)
            return 1;
        int cat = 1;
        for (int i = 1; i <= n; i++)
        {
            cat = cat * (2 * (2 * i - 1)) / (i + 1);
        }
        return cat;

    }
}


/*Sample Input

3

Your Output

5
*/
