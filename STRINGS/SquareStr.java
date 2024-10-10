import java.util.*;
import java.lang.*;
import java.io.*;
//CHECK THE SQUARE STRING

/*Given a string, you have to check whether it is a square string. A string is said to be square if it is some string written twice in a row. For example, the strings "cc", "zazazaza", and "papa" are square. But "abc", and "abaaaabb" are not square.*/
class SquareStr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        if (str.length() % 2 == 0)
        {
            String fh = str.substring(0, str.length() / 2);
            String sh = str.substring(str.length() / 2);
            if (fh.equals(sh))
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
/*Sample Input

aabaabaabaab

Your Output

yes
*/
