import java.util.*;
import java.lang.*;
import java.io.*;
//FLOYD PATTERN 1
class Floyd1
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
/*Sample Input

6

Your Output

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
*/
