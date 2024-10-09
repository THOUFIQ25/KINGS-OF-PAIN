import java.util.*;
import java.lang.*;
import java.io.*;
//PALINDROMIC PATTERN
class PalindPat
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char)('A' + j - 1) + " ");
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print((char)('A' + j - 1) + " ");

            }
            System.out.println();
        }

    }
}
/*Sample Input

5

Your Output

A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A 
*/
