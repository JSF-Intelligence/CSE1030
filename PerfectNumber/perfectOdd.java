import java.lang.Math;
import java.io.PrintStream;

/**
 * This program sequentially searches for an odd perfect number.
 * A perfect number has the property of being the sum of it's factors
 * not including itself. For example 6 = 1 + 2 + 3, 28 = 1 + 2 + 4
 * + 7 +14. The exsistance of an odd perfect number is an open question
 * in mathematics. Mathematitians have determined that if one exists
 * it will have at least 300 digits. If this were a genuine attempt to
 * find a perfect odd I would use the BigInteger number class in place
 * of the primitive type Integer. However the purpose of this is simply
 * to illustrate that humans cannot detemine if a program written using
 * a very short algorithm halts. For the sake of readabiity and
 * simplicity we'll be using Integer.
 */

class perfectOdd
{
    final static int PERIOD = 100000;

    public static boolean isPerfect(int n)
    {
        int sum = 0;
        int i;
        for (i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main (String args[])
    {
        PrintStream out = System.out;
        out.printf("\nStarting search for odd perfect number...");
        boolean found = false;
        int i = 1;
        while (found == false)
        {
            if (isPerfect(i))
            {
                out.printf("\n%d is an odd perfect number\n\n", i);
                found = true;
            }
            if (i % PERIOD == 1)
            {
                out.printf("\n%d number(s) tested", i);
            }
            i += 2;
        }
        return;
    }
}

