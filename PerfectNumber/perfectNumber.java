import java.lang.Math;
import java.io.PrintStream;

/**
 * This program sequentially searches for perfect numbers.
 * A perfect number has the property of being the sum of it's factors
 * not including itself. For example 6 = 1 + 2 + 3, 28 = 1 + 2 + 4
 * + 7 +14.
 */

class perfectNumber
{
    final static int PERIOD =  10000000;
    final static int LIMIT = 1000000000;

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
        out.printf("\nStarting search for perfect numbers...");
        int i = 1;
        while (i < LIMIT)
        {
            if (isPerfect(i))
            {
                out.printf("\n%d is a perfect number\n", i);
            }
            if (i % PERIOD == 0)
            {
                out.printf("\n%d number(s) tested", i);
            }
            i ++;
        }
        return;
    }
}

