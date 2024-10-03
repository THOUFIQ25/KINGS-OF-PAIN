import java.util.*;
import java.lang.*;
import java.io.*;
//TRIANGLE VALIDATOR
class TriVal
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int a = w.nextInt();
        int b = w.nextInt();
        int c = w.nextInt();
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}


/*Sample Input

4 3 5

Your Output

Yes
*/
