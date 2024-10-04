import java.util.*;
import java.lang.*;
import java.io.*;
//PONIT LOCATION
class PointLoc
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int x1 = w.nextInt();
        int y1 = w.nextInt();
        int x2 = w.nextInt();
        int y2 = w.nextInt();
        int x3 = w.nextInt();
        int y3 = w.nextInt();
        int cost = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
        String res = (cost > 0) ? "LEFT" : (cost < 0) ? "RIGHT" : "TOUCH";
        System.out.println(res);

    }
}
/*Sample Input

1 1 5 3 2 3

Your Output

LEFT
*/
