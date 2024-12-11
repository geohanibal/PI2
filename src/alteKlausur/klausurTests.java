package alteKlausur;

import org.junit.jupiter.api.Test;
import static Aufgaben.Algorithms.*;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
public class klausurTests {
    @Test
    void testBinarySearchFound() {
        Integer[] array = {1, 3, 5, 7, 9};
        Comparator<Integer> comparator = Integer::compare;

        // Test: Suche nach vorhandenen Elementen
        assertEquals(0, BinarySearch.binarySearch(array, 1, comparator)); // Element 1
        assertEquals(2, BinarySearch.binarySearch(array, 5, comparator)); // Element 5
        assertEquals(4, BinarySearch.binarySearch(array, 9, comparator)); // Element 9
    }

    @Test
    void testBinarySearchNotFound() {
        Integer[] array = {1, 3, 5, 7, 9};
        Comparator<Integer> comparator = Integer::compare;

        // Test: Suche nach nicht vorhandenen Elementen
        assertEquals(-1, BinarySearch.binarySearch(array, 0, comparator)); // Element 0
        assertEquals(-1, BinarySearch.binarySearch(array, 2, comparator)); // Element 2
        assertEquals(-1, BinarySearch.binarySearch(array, 10, comparator)); // Element 10
    }

    @Test
    void testBinarySearchEmptyArray() {
        Integer[] array = {};
        Comparator<Integer> comparator = Integer::compare;

        // Test: Suche in einem leeren Array
        assertEquals(-1, BinarySearch.binarySearch(array, 5, comparator)); // Irgendein Element
    }

    @Test
    void testBinarySearchSingleElement() {
        Integer[] array = {42};
        Comparator<Integer> comparator = Integer::compare;

        // Test: Suche in einem Array mit einem einzigen Element
        assertEquals(0, BinarySearch.binarySearch(array, 42, comparator)); // Element gefunden
        assertEquals(-1, BinarySearch.binarySearch(array, 7, comparator)); // Element nicht gefunden
    }

    @Test
    void testBinarySearchStrings() {
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        Comparator<String> comparator = String::compareTo;

        // Test: Suche nach vorhandenen und nicht vorhandenen Elementen
        assertEquals(0, BinarySearch.binarySearch(array, "apple", comparator)); // Element "apple"
        assertEquals(3, BinarySearch.binarySearch(array, "date", comparator)); // Element "date"
        assertEquals(-1, BinarySearch.binarySearch(array, "grape", comparator)); // Element "grape" nicht vorhanden
    }
}
