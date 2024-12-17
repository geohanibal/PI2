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



        @Test
        void testTreeHeightNullRoot() {
            // Test mit null als Wurzel
            assertEquals(0, TreHeigh.treeHeight(null), "Höhe eines leeren Baums sollte 0 sein.");
        }

        @Test
        void testTreeHeightSingleRoot() {
            // Test mit einem einzigen Knoten
            Node root = new Node(null, null);
            assertEquals(1, TreHeigh.treeHeight(root), "Höhe eines Baums mit einem Knoten sollte 1 sein.");
        }

        @Test
        void testTreeHeightBalancedTree() {
            // Test mit einem balancierten Baum
            Node leftChild = new Node(null, null);
            Node rightChild = new Node(null, null);
            Node root = new Node(leftChild, rightChild);
            assertEquals(2, TreHeigh.treeHeight(root), "Höhe eines balancierten Baums sollte korrekt berechnet werden.");
        }

        @Test
        void testTreeHeightUnbalancedTree() {
            // Test mit einem unbalancierten Baum
            Node leftChild = new Node(new Node(null, null), null);
            Node root = new Node(leftChild, null);
            assertEquals(3, TreHeigh.treeHeight(root), "Höhe eines unbalancierten Baums sollte korrekt berechnet werden.");
        }
    }



