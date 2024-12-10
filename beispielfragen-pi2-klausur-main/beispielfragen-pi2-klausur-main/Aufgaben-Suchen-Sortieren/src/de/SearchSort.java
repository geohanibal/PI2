package de;

/**
 * Hier folgen einige Beispielaufgaben zu Suchverfahren und Sortierverfahren
 * -Hinweis-
 * grundsätzlich sind bei allen Aufgaben KEINE Hilfsmittel erlaubt, die importiert werden müssten.
 * Ausnahmen dazu werde ich in der jeweiligen Aufgabenstellung aufzählen, wenn die betreffenden Aufgaben ohne diese
 * Hilfsmittel nur sehr umständlich zu lösen sind.
 * <p>
 * Here you will find some exercises regarding the topics sorting and search
 * -Attention-,
 * It is not allowed to import any libraries besides the one mentioned in the text of the exercises.
 * @author Pascal Himmelmann
 */
public class SearchSort
{
    /**
     * Hier soll mittels linearer Suche ein Schlüsselelement in einem Array gesucht werden.
     * Es darf angenommen werden, dass das Array nicht leer.
     * <p>
     * Here you should use linear search to identify the position of an element in an array
     * @param array Das zu durchsuchende Array
     * <p>
     *              The array in which the element should be found
     * @param element Das zu suchende Element
     * <p>
     *                The element to search
     * @return Der Index des ersten Vorkommens des gesuchten Elementes oder -1, falls es nicht enthalten ist
     * <p>
     *          The index of the first element equal to the one that should be found or -1 in case there is no such element
     */
    public static <E extends  Comparable<E>> int linearSearch(final E[] array, E element)
    {
        return 0;
    }

    /**
     * Hier soll mittels binärer Suche ein Schlüsselelement in einem Array gefunden werden.
     * Hier darf angenommen werden, dass lediglich aufsteigend sortierte nicht leere Arrays übergeben werden.
     * <p>
     * Here you should use binary search to identify the position of an element in an array.
     * You can assume the array to be sorted in ascending order and not to be empty.
     * @param array Das aufsteigend sortierte zu durchsuchende Array
     * <p>
     *              The array in which the element should be found. Can be assumed to be non-empty and sorted in ascending order
     * @param element Das zu suchende Element
     * <p>
     *                The element which should be found
     * @return Der Index des letzten Vorkommens des gesuchten Elementes oder -1, falls es nicht enthalten ist
     * <p>
     *          The index of the last element equal to the one that should be found or -1 in case there is no such element
     */
    public static <E extends Comparable<E>> int binarySearch(final E[] array, E element)
    {
        return 0;
    }

    /**
     * Hier soll ein übergebenes generisches Array mittels mergeSort aufsteigend sortiert werden.
     * Die Funktion merge() darf und soll in dieser Methode aufgerufen werden.
     * <p>
     * Here you should use mergesort-algorithm to sort a generic array in ascending order. The function ''merge''
     * which can be found done below can and should used in this function.
     * @param array Das zu sortierende Array
     * <p>
     *              The array which should be sorted
     * @param <E> Der Typ der Elemente. Dieser muss comparable sinnvoll implementieren
     * <p>
     *           The type of the elements. Can be assumed to implement Comparable
     * @return Ein aufsteigend sortiertes Array, welches die gleichen Elemente enthält wie das Eingabearray
     * <p>
     *     An array sorted in ascending order and containing exactly the same elements as the input array
     *
     */
    public static <E extends Comparable<E>> E[] mergeSort(final E[] array)
    {
        return null;
    }

    /**
     * Hier sollen zwei übergebene Arrays zu einem Array zusammengefügt werden. Dabei soll das Ergebnisarray
     * alle Elemente der beiden Arrays in aufsteigender Reihenfolge enthalten.
     * <p>
     * Here you should implement an algorithm that is able to merge two given arrays while it guarantees that the
     * output is always sorted in ascending order if the input arrays are sorted in ascending order.
     * @param array Das erste Array. Ist nach Definition aufsteigend sortiert
     * <p>
     *              The first array which can assumed to be sorted in ascending order
     * @param array2 Das zweite Array. Ist nach Definition aufsteigend sortiert
     * <p>
     *               The second array which can assumed to be sorted in ascending order
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the array
     * @return Ein aufsteigend sortiertes Array, dass alle Elemente der Eingabearrays enthält
     * <p>
     *     An array sorted in ascending order and containing exactly the same elements as the input array
     */
    public static <E extends Comparable<E>> E[] merge(final E[] array, final E[] array2)
    {
        return null;
    }

    /**
     * Hier soll ein übergebenes generisches Array mittels quickSort aufsteigend sortiert werden
     * <p>
     * Here you should use quicksort-algorithm to sort a generic array in ascending order
     * @param array Das zu sortierende Array
     * <p>
     *              The array to be sorted
     * @param <E> Der Typ der Elemente. Dieser muss comparable sinnvoll implementieren
     *
     *           The type of the elements. Can be assumed to implement Comparable
     * @return Ein aufsteigend sortiertes Array, welches die gleichen Elemente enthält, wie das Eingabearray
     * -Hinweis-
     * hier bietet sich die Verwendung einer Hilfsmethode an, um zusätzliche Parameter zur Verfügung zu haben,
     * während des Sortiervorgangs mittels QuickSort
     *
     * <p>
     *     An array sorted in ascending order and containing exactly the same elements as the input array
     * -Attention-,
     * It may help to use a second function here that has more parameters which can be used.
     */
    public static <E extends Comparable<E>> E[] quickSort(final E[] array)
    {
        return null;
    }

    /**
     * Hier soll ein übergebenes generisches Array mittels insertionSort aufsteigend sortiert werden
     * <p>
     * Here you should use insertion sort-algorithm to sort a generic array in ascending order.
     *
     * @param array Das zu sortierende Array
     * <p>
     *              The array to be sorted
     * @param <E> Der Typ der Elemente. Dieser muss comparable sinnvoll implementieren
     *
     *           The type of elements. Can be assumed to implement Comparable
     * @return Ein aufsteigend sortiertes Array, welches die gleichen Elemente enthält wie das Eingabearray
     *
     * <p>
     *     An array sorted in ascending order and containing exactly the same elements as the input array
     */
    public static <E extends Comparable<E>> E[] insertionSort(final E[] array)
    {
        return null;
    }

    /**
     * Hier soll ein übergebenes generisches Array mittels selectionSort aufsteigend sortiert werden
     * <p>
     * Here you should use selection sort-algorithm to sort a generic array in ascending order.
     *
     * @param array Das zu sortierende Array
     * <p>
     *              The array to be sorted
     * @param <E> Der Typ der Elemente. Dieser muss comparable sinnvoll implementieren
     *
     *           The type of elements. Can be assumed to implement Comparable
     * @return Ein aufsteigend sortiertes Array, welches die gleichen Elemente enthält wie das Eingabearray
     *
     * <p>
     *     An array sorted in ascending order and containing exactly the same elements as the input array
     */
    public static <E extends Comparable<E>> E[] selectionSort(final E[] array)
    {
        return null;
    }

    /**
     * Diese Klasse wandelt jede dezimal-kodierte Zahl in eine unär-kodierte Zahl um.
     * Hier sollte von euch für diese Klasse ein Comparable implementiert werden, sodass die unär-Kodierungen
     * ebenfalls miteinander verglichen werden können
     * <p>
     * This class should convert any decimal coded number into an unary coded number.
     * Your task is to implement Comparable for this class so that the unary coded numbers can also compared similar to the
     * decimal coded numbers.
     *
     */
    public static class UnaryCode implements Comparable<UnaryCode>
    {
        private final String data;

        /**
         * Erstellt eine neue unäre Kodierung zu einer gegebenen Dezimalzahl
         * <p>
         * This constructor converts a decimal coded number into an unary coded one
         * @param number Die zu kodierende Dezimalzahl
         *               <p>
         *               The decimal number to be converted.
         */
        public UnaryCode(final int number)
        {
            data = "a".repeat(Math.max(0, number));
        }

        /**
         * Gibt die Kodierung der gespeicherten Zahl aus
         * <p>
         * Returns the unary coded number
         * @return Die Kodierung der Zahl
         * <p>
         * The unary coded number
         */
        public String getCode()
        {
            return data;
        }

        /**
         * Diese Methode sollte von euch angepasst werden, sodass Comparable für diesen abstrakten Datentyp
         * sinnvoll definiert ist.
         * <p>
         * This method should be implemented so that unary numbers can be compared just the same was as decimal numbers.
         * @param o Das Objekt, mit dem verglichen werden soll
         * <p>
         *          The object which should be compared to this one
         * @return Eine negative Zahl, falls o größer ist als dieses Element,
         *          eine positive Zahl, falls o kleiner ist als dieses Element,
         *          andernfalls 0
         * <p>
         *          A negative number if o is greater than this element,
         *          a positive number if o is lesser than this element,
         *          or 0 if the elements are equal.
         *
         */
        @Override
        public int compareTo(UnaryCode o)
        {
            return 0;
        }
    }
}
