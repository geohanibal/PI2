package de.uni_bremen.pi2;

/**
 * Grundschema des Algorithmenaufbaus.
 * Gesamtproblemstellung: Summieren der Elemente eines Arrays.
 * Jeweils bereits gelöstes Teilproblem: Summieren der Elemente des Arrays vor dem Index.
 * Jeweils noch offenes Teilproblem: Summieren der Elemente des Arrays ab dem Index bis
 * zum Ende.
 * Trivialfall: Index zeigt auf das Array-Ende, denn dann gibt es nichts zu tun.
 */
public class Algorithmen
{
    /**
     * Spezifikation des Ein-/Ausgabeverhaltens:
     * Die Methode berechnet die Summe der Elemente des übergebenen Arrays iterativ.
     * @param zahlen                Ein Array von Zahlen.
     * @return                      Die Summe der Elemente des Arrays.
     * @throws NullPointerException Das Array war null.
     */
    public static int summeIterativ(final int[] zahlen) // Name des Algorithmus und Parameterliste
    {
        // Vorbereitung
        int summe = 0;
        int index = 0;

        // Test auf Trivialfall (im übertragenen Sinne)
        while (index != zahlen.length) {
            // Arbeit
            summe += zahlen[index];
            ++index;
        }
        System.out.println();

        // Ergebnis
        return summe;
    }



    /**
     * Spezifikation des Ein-/Ausgabeverhaltens:
     * Die Methode berechnet die Summe der Elemente des übergebenen Arrays rekursiv.
     * @param zahlen                Ein Array von Zahlen.
     * @return                      Die Summe der Elemente des Arrays.
     * @throws NullPointerException Das Array war null.
     */
    public static int summeRekursiv(final int[] zahlen) // Name des Algorithmus und Parameterliste
    {
        // Vorbereitung
        return summeRekursiv(zahlen, 0);
    }

    private static int summeRekursiv(final int[] zahlen, final int index)
    {
        // Test auf Trivialfall
        if (index == zahlen.length) {
            // Ergebnis
            return 0;
        }
        else {
            // Arbeit
            return zahlen[index] + summeRekursiv(zahlen, index + 1);
        }
    }

    public static void main(String[] args) {
        Algorithmen alg = new Algorithmen();
        int b = alg.summeIterativ(new int[]{20,1,3,1,100});
        int a = alg.summeIterativ(new int[]{10,20});
        int c = summeIterativ(new int[]{20,1,3,1,100});

        System.out.print(c);

    }
}
