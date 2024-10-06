import java.util.*;
import java.lang.*;
import java.io.*;
//TRIANGLE PATTERN
/* *
 * *
 * * *
 * * * *
 * * * * *    */
class TrgPatt
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
