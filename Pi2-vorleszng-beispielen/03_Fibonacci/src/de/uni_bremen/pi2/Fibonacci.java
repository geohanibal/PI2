package de.uni_bremen.pi2;

/**
 * Zwei Implementierungen der Berechnung der Fibonacci-Zahlen.
 * @author Thomas Röfer
 */
public class Fibonacci
{
    /**
     * Naive Implementierung.
     * @param n Die wievielte Fibonacci-Zahl soll berechnet werden?
     * @return Die n-te Fibonacci-Zahl.
     */
    public static long fibonacci(final long n)
    {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Verbesserte Implementierung.
     * @param n Die wievielte Fibonacci-Zahl soll berechnet werden?
     * @return Die n-te Fibonacci-Zahl.
     */
    public static long fibonacciFast(final long n)
    {
        return fibonacciFast2(n)[0];
    }

    /**
     * Der Kern der verbesserten Implementierung.
     * @param n Die wievielte Fibonacci-Zahl soll berechnet werden?
     * @return Ein Paar aus n-ter und n-1-ter Fibonacci-Zahl.
     */
    private static long[] fibonacciFast2(final long n)
    {
        if (n < 2) {
            return new long[]{n, 0};
        }
        else {
            final long[] pair = fibonacciFast2(n - 1);
            return new long[] {pair[0] + pair[1], pair[0]};
        }
    }
}
