import java.util.*;
import java.lang.*;
import java.io.*;
//QUADRATIC EQUATION
class QuadEq
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        double a = w.nextDouble();
        double b = w.nextDouble();
        double c = w.nextDouble();
        double dis = b * b - 4 * a * c;
        if (dis > 0)
        {
            double r1 = (-b - Math.sqrt(dis)) / (2 * a);
            double r2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.printf("%.2f %.2f \n", r1, r2);
        }
        else if (dis == 0)
        {
            double r = (-b) / (2 * a);
            System.out.printf("%.2f %.2f \n", r, r);

        }
        else
            System.out.println("Imaginary roots");
    }
}
