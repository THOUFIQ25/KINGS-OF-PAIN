import java.util.*;
import java.lang.*;
import java.io.*;
//STRING ROTATION
class StrRot
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        String a = w.next();
        String b = w.next();
        if ((b + b).contains(a))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
/*Sample Input

5

hello lohel

Your Output

Yes
*/
