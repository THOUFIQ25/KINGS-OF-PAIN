import java.util.*;
import java.lang.*;
import java.io.*;
//COMPRESS THE STRING
class ComStr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.next();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i - 1))
                count++;
            else
            {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(sb.toString());
    }
}
/*Sample Input

aaabbbbhhheaaAsssssss

Your Output

a3b4h3e1a2A1s7
*/
