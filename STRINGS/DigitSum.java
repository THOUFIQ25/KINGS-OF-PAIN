import java.util.*;
import java.lang.*;
import java.io.*;
//DIGIT SUM 
class DigitSum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String n = w.nextLine();
        int sum = 0;
        for (char num: n.toCharArray())
        {
            sum += num - '0';
        }
        System.out.println(sum);
    }
}
/*Example

Input

164



Output

11



Explanation



1 + 6 + 4 = 11  */
