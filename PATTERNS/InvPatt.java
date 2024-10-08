import java.util.*;
import java.lang.*;
import java.io.*;
//INVERTED PYRAMID
class InvPatt
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }
}
/** * * * *
 *     *
 *   *
 * *
 **/
