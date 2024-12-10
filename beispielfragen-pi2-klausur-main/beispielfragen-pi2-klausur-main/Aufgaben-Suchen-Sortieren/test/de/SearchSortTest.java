package de;

import org.junit.jupiter.api.Test;

import static de.SearchSort.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Hier folgen einige Tests zu den Suchverfahren und Sortierverfahren
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * Here you will find some tests for the exercises provided in SearchSort
 * (Please don't change anything in this file !)
 * @author Pascal Himmelmann
 */
class SearchSortTest
{
    /**
     * Hier wird getestet, dass ein enthaltenes Element in einem nicht leeren Array gefunden werden kann
     */
    @Test
    void linearSearchTest1()
    {
        Integer[] array = {1, 4, 7, 9, 3, 8, 2};
        int index = linearSearch(array, 7);
        assertEquals(2, index);
        index = linearSearch(array, 2);
        assertEquals(array.length - 1, index);
        index = linearSearch(array, 1);
        assertEquals(0, index);
    }

    /**
     * Hier wird getestet, dass die Funktion mit ungewöhnlichen Eingaben umgehen kann
     */
    @Test
    void linearSearchTest2()
    {
        Integer[] array = {1, 1, 1};
        int index = linearSearch(array, 1);
        assertEquals(0, index);
        index = linearSearch(array, 2);
        assertEquals(-1, index);
        index = linearSearch(new Integer[]{1}, 1);
        assertEquals(0, index);
    }

    /**
     * Hier wird getestet, dass ein enthaltenes Element in einem nicht leeren Array gefunden werden kann
     */
    @Test
    void binarySearchTest1()
    {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(array, 4);
        assertEquals(3, index);
        index = binarySearch(array, 10);
        assertEquals(array.length - 1, index);
        index = binarySearch(array, 1);
        assertEquals(0, index);
    }

    /**
     * Hier wird getestet, dass die Funktion mit ungewöhnlichen Eingaben umgehen kann
     */
    @Test
    void binarySearchTest2()
    {
        Integer[] array = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 10, 10, 10, 10};
        int index = binarySearch(array, 2);
        assertEquals(5, index);
        index = binarySearch(array, 4);
        assertEquals(-1, index);
        array = new Integer[]{1};
        index = binarySearch(array, 1);
        assertEquals(0, index);
    }

    /**
     * Hier wird ein regulärer Sortiervorgang mittels mergeSort getestet
     */
    @Test
    void mergeSortTest1()
    {
        String[] array = {"A", "Z", "B", "Y", "X", "C", "F", "E"};
        String[] solution = {"A", "B", "C", "E", "F", "X", "Y", "Z"};
        Comparable<String>[] newArray = mergeSort(array);
        assertArrayEquals(solution, newArray);
    }

    /**
     * Hier werden Spezialfälle getestet in Bezug auf mergeSort
     */
    @Test
    void mergeSortTest2()
    {
        String[] array = {"A"};
        Comparable<String>[] newArray = mergeSort(array);
        assertArrayEquals(array, newArray);
        array = new String[]{"A", "B", "A", "B", "A", "C"};
        String[] solution = {"A", "A", "A", "B", "B", "C"};
        newArray = mergeSort(array);
        assertArrayEquals(solution, newArray);
        assertNull(mergeSort(null));
    }

    /**
     * Hier wird die Funktionsweise der Funktion merge getestet
     */
    @Test
    void mergeTest()
    {
        // Gleich lange Eingaben
        String[] a1 = {"A", "B", "D", "G"};
        String[] a2 = {"C", "E", "F", "H"};
        String[] result = {"A", "B", "C", "D", "E", "F", "G", "H"};
        assertArrayEquals(result, merge(a1, a2));
        // Erstes Array ist länger
        a1 = new String[]{"A", "B", "D", "G"};
        a2 = new String[]{"C", "E", "H"};
        result = new String[]{"A", "B", "C", "D", "E", "G", "H"};
        assertArrayEquals(result, merge(a1, a2));
        // Zweites Array ist länger
        a1 = new String[]{"A", "B"};
        a2 = new String[]{"C", "E", "H"};
        result = new String[]{"A", "B", "C", "E", "H"};
        assertArrayEquals(result, merge(a1, a2));
        // Sehr kleine Arrays
        a1 = new String[]{"A"};
        a2 = new String[]{"C"};
        result = new String[]{"A", "C"};
        assertArrayEquals(result, merge(a1, a2));
        // Duplikate
        a1 = new String[]{"A", "A", "B", "B", "Z"};
        a2 = new String[]{"B", "B", "C", "Y", "Z"};
        result = new String[]{"A", "A", "B", "B", "B", "B", "C", "Y", "Z", "Z"};
        assertArrayEquals(result, merge(a1, a2));
    }

    /**
     * Hier wird ein regulärer Sortiervorgang mittels quickSort getestet
     */
    @Test
    void quickSortTest1()
    {
        String[] array = {"A", "Z", "B", "Y", "X", "C", "F", "E"};
        String[] solution = {"A", "B", "C", "E", "F", "X", "Y", "Z"};
        String[] newArray = quickSort(array);
        assertArrayEquals(solution, newArray);
    }

    /**
     * Hier werden Spezialfälle getestet in Bezug auf quickSort
     */
    @Test
    void quickSortTest2()
    {
        String[] array = {"A"};
        String[] newArray = quickSort(array);
        assertArrayEquals(array, newArray);
        array = new String[]{"A", "B", "A", "B", "A", "C"};
        String[] solution = {"A", "A", "A", "B", "B", "C"};
        newArray = quickSort(array);
        assertArrayEquals(solution, newArray);
        assertNull(quickSort(null));
    }

    /**
     * Hier wird ein regulärer Sortiervorgang mittels insertionSort getestet
     */
    @Test
    void insertionSortTest1()
    {
        String[] array = {"A", "Z", "B", "Y", "X", "C", "F", "E"};
        String[] solution = {"A", "B", "C", "E", "F", "X", "Y", "Z"};
        String[] newArray = insertionSort(array);
        assertArrayEquals(solution, newArray);
    }

    /**
     * Hier werden Spezialfälle getestet in Bezug auf insertionSort
     */
    @Test
    void insertionSortTest2()
    {
        String[] array = {"A"};
        String[] newArray = insertionSort(array);
        assertArrayEquals(array, newArray);
        array = new String[]{"A", "B", "A", "B", "A", "C"};
        String[] solution = {"A", "A", "A", "B", "B", "C"};
        newArray = insertionSort(array);
        assertArrayEquals(solution, newArray);
        assertNull(insertionSort(null));
    }

    /**
     * Hier wird ein regulärer Sortiervorgang mittels selectionSort getestet
     */
    @Test
    void selectionSortTest1()
    {
        String[] array = {"A", "Z", "B", "Y", "X", "C", "F", "E"};
        String[] solution = {"A", "B", "C", "E", "F", "X", "Y", "Z"};
        String[] newArray = selectionSort(array);
        assertArrayEquals(solution, newArray);
    }

    /**
     * Hier werden Spezialfälle getestet in Bezug auf selectionSort
     */
    @Test
    void selectionSortTest2()
    {
        String[] array = {"A"};
        String[] newArray = selectionSort(array);
        assertArrayEquals(array, newArray);
        array = new String[]{"A", "B", "A", "B", "A", "C"};
        String[] solution = {"A", "A", "A", "B", "B", "C"};
        newArray = selectionSort(array);
        assertArrayEquals(solution, newArray);
        assertNull(selectionSort(null));
    }

    /**
     * Hier wird getestet, ob sich 2 unäre Kodierungen miteinander vergleichen lassen
     */
    @Test
    void unaryCodeTest1()
    {
        UnaryCode data = new UnaryCode(10);
        assertEquals("aaaaaaaaaa", data.getCode());
        UnaryCode data2 = new UnaryCode(5);
        assertEquals("aaaaa", data2.getCode());
        assertTrue(data.compareTo(data2) > 0);
        assertTrue(data2.compareTo(data) < 0);
        assertEquals(0, data.compareTo(new UnaryCode(10)));
    }

    /**
     * Hier wird getestet, ob sich eine Liste von unären Kodierungen sortieren lässt
     */
    @Test
    void unaryCodeTest2()
    {
        UnaryCode d2 = new UnaryCode(2);
        UnaryCode d4 = new UnaryCode(4);
        UnaryCode d6 = new UnaryCode(6);
        UnaryCode d10 = new UnaryCode(10);
        UnaryCode d100 = new UnaryCode(100);

        UnaryCode[] data = {d4, d2, d100, d10, d6};
        UnaryCode[] solution = {d2, d4, d6, d10, d100};

        assertArrayEquals(solution, mergeSort(data));
    }
}
