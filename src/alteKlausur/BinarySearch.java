package alteKlausur;




import java.util.Comparator;

/**
 * Aufgabe 3: Implementierung der binären Suche (20 %).
 *
 * Außer dem Comparator dürfen keine Klassen der Laufzeitbibliothek
 * verwendet werden.
 */
public class BinarySearch {
    /**
     * Implementiert eine binäre Suche in einem Array. Die Anzahl der Vergleiche
     * zwischen Objekten der Klasse T darf log_2(array.length) + 1 nicht
     * überschreiten.
     *
     * @param array Das Array, in dem gesucht wird. Es ist entsprechend der
     *              Ordnungsrelation aufsteigend sortiert und wird nicht null
     *              sein und seine Elemente ebenfalls nicht.
     * @param key   Der Wert, nach dem gesucht wird. Wird nicht null sein.
     * @param order Die Ordungsrelation, nach der das Array sortiert ist.
     * @return Der Index der Fundstelle. Ist der gesuchte Wert nicht
     * enthalten, wird -1 zurückgegeben.
     */
    public static <E> int binarySearch(final E[] array, final E key, final Comparator<E> order) {
        if (array.length == 0){
            return -1;}
        int bottom = 0;
        int top = array.length;

        while(bottom + 1 < top) {
            final int middle = bottom + (top - bottom) / 2;
            if (order.compare(key, array[middle]) >= 0) {
                bottom = middle;
            } else {
                top = middle;
            }
        }
        final int comp = order.compare(key, array[bottom]);

        return comp == 0 ? bottom : -1;
    }

}