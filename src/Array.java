package de.uni_bremen.pi2;

/**
 * Aufgabe 1: Vergrößern der Kapazität eines Arrays dynamischer Größe (20 %).
 *
 * Außer der Konstante Integer.MAX_VALUE dürfen keine Klassen der
 * Laufzeitbibliothek verwendet werden.
 */
public class Array
{
    /**
     * Berechnen einer neuen Kapazität für das dynamische Array. Das Array soll
     * sich ausgehend von der aktuellen Kapazität in Zweierpotenzen vergrößern,
     * wenn ein neuer Index nicht mehr hineinpasst. Würde eine solche
     * Vergrößerung den Wert Integer.MAX_VALUE überschreiten, wird die Kapazität
     * auf Integer.MAX_VALUE begrenzt.
     * @param currentCapacity Die bisherige Kapazität des Arrays. Mindestens 0.
     * @param indexThatMustFit Ein Index, der nun auch in das Array passen muss.
     *         Ist mindestens 0 und kleiner als Integer.MAX_VALUE.
     * @return Die neue Kapazität des Arrays. Wenn keine Vergrößerung nötig war,
     *         ist sie identisch zur bisherigen Kapazität. Ansonsten ist sie um
     *         eine Zweipotenz größer, es sei denn, die bisherige Kapazität war
     *         0 (dann ist sie mindestens 1) oder die Maximalkapazität wurde
     *         erreicht (dann ist sie Integer.MAX_VALUE).
     */
    public static int resizeIfNecessary(final int currentCapacity, final int indexThatMustFit)
    {
        int capacity = currentCapacity == 0 ? 1 : currentCapacity;

        while(indexThatMustFit >= capacity) {
            // Maximalkapazität bedeutet Integer.MAX_VALUE
            capacity = capacity > Integer.MAX_VALUE/2 ? Integer.MAX_VALUE : capacity * 2;
        }
        return capacity;


    }


}
