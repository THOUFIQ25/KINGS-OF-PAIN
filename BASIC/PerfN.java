import java.util.*;
import java.lang.*;
import java.io.*;
//PERFECT NUMBER 
//A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding the number itself. For example, 6 is a perfect number because the divisors of 6 (excluding 6 itself) are 1, 2, and 3, and their sum is 6.
class PerfN
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        System.out.println(isperfect(n));

    }
    public static boolean isperfect(int n)
    {
        if (n < 2)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
                if (i != n / i)

                    sum += n / i;
            }
        }
        return sum == n;
    }
}
/*Sample Input

6

Your Output

true
*/
