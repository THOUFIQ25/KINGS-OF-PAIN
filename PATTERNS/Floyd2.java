import java.util.*;
import java.lang.*;
import java.io.*;
//FLOYD PATTERN 2
class Floyd2
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int currentnum = 1;
        for (int i = 1; i <= n; i++)
        {
            int val = currentnum;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(val + " ");
                val += (n - j);
            }
            currentnum++;
            System.out.println();
        }

    }
}
/*Sample Input

5

Your Output

1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
*/
