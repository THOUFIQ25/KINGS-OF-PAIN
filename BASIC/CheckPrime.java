/*check prime or not*/


import java.util.*;
import java.lang.*;
import java.io.*;

class CheckPrime
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int t=w.nextInt();
        while(t-->0)
        {
        int n = w.nextInt();
        boolean prime = true;
        if (n <= 1)
        {
            System.out.println("No");
            continue;
        }
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                prime = false;
                break;
        }
        if (prime)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    }
}
/*
Sample Input

3

3

11

15

Your Output

Yes
Yes
No
*/
