import java.util.*;
import java.lang.*;
import java.io.*;
//STRING GCD
/*Given two strings, P and Q, your task is to find the largest common divisor string S, such that both P and Q are divisible by S. In other words, there exists a string 'S' for which P = S + S + ... + S and Q = S + S + ... + S. If such a string S exists, output the largest possible S, otherwise, print -1.



Note: A string X is divisible by string Y if and only if X can be obtained by concatenating Y with itself one or more times.*/
class GCDStr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String p = w.nextLine();
        String q = w.nextLine();
        if (!(p + q).equals(q + p))
        {
            System.out.println("-1");
            return;
        }
        int gcdlen = gcd(p.length(), q.length());
        System.out.println(p.substring(0, gcdlen));

    }
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
/*Sample Input

ABABAB

ABAB

Your Output

AB
*/
