import java.util.*;
import java.lang.*;
import java.io.*;
//FREQUENCY OF CHARACTERS IN A STRING
class FreqStr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        int freq[] = new int[256];
        for (char fr: str.toCharArray())
        {
            freq[fr]++;
        }
        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i] > 0)
                System.out.println((char) i + ":" + freq[i]);
        }

    }
}
/*Sample Input

aaa bb a

Your Output

 :2
a:4
b:2
*/
