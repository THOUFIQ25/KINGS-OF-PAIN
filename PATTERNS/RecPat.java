import java.util.*;
import java.lang.*;
import java.io.*;
//RECTANGLE PATTERN
/*Input

5



Output

5432*

543*1

54*21

5*321

*4321*/
class RecPat
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(n - j);
            }
            System.out.println();
        }

    }
}
