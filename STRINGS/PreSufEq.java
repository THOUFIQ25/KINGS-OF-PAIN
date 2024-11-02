import java.util.*;
import java.lang.*;
import java.io.*;
//PREFIX AND SUFFIX EQUALITY
class PreSufEq
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String inp = w.nextLine();
        String[] parts = inp.split(" ");
        String s = parts[0];
        String t = parts[1];
        boolean ispre = s.startsWith(t);
        boolean issuff = s.endsWith(t);
        System.out.println((ispre && issuff) ? "yes" : "No");

    }
}
/*Sample Input

halloweenhallo hallo

Your Output

yes
*/
