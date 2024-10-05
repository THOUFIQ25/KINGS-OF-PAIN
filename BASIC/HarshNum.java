import java.util.*;
import java.lang.*;
import java.io.*;
//HARSHAD NUMBER
class HarshNum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int n1 = n;
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        String res = (n1 % sum == 0) ? "Yes" : "No";
        System.out.println(res);

    }
}
/*Input

18



Output

Yes



Explanation



18 / (1 + 8) = 2

As 18 is divisible by the sum of its digits, it is a Harshad number.*/
