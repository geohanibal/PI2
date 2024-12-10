package de;

import org.junit.jupiter.api.Test;

import static de.Algorithms.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Hier folgen einige Tests zu den Algorithmen damit ihr eure Antworten und Ansätze leichter überprüfen könnt.
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * Here I provide some tests to you so you can easily check your answers and ideas.
 * (Please don't change anything in this file !)
 * @author Pascal Himmelmann
 */
class AlgorithmsTest
{
    /**
     * Dieser Test überprüft die grundlegende Funktionalität des Cashier-Algorithmus bei unterschiedlichen Eingaben
     */
    @Test
    void cashierTest1()
    {
        int price = 22;
        int[] solution = {0, 0, 1, 0, 0, 1, 0};
        assertArrayEquals(solution, cashier(price));
        price = 75;
        solution = new int[]{0, 1, 1, 0, 1, 0, 0};
        assertArrayEquals(solution, cashier(price));
        price = 144;
        solution = new int[]{1, 0, 2, 0, 0, 2, 0};
        assertArrayEquals(solution, cashier(price));
    }

    /**
     * Dieser Test überprüft die Funktionalität des Cashier-Algorithmus bei ungewöhnlichen Eingaben
     */
    @Test
    void cashierTest2()
    {
        int price = 188;
        int[] solution = {1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(solution, cashier(price));
        price = 0;
        solution = new int[]{0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(solution, cashier(price));
        price = 1;
        solution = new int[]{0, 0, 0, 0, 0, 0, 1};
        assertArrayEquals(solution, cashier(price));
    }

    /**
     * Dieser Test überprüft, dass Filter bei unterschiedlichen Eingaben korrekt arbeitet
     */
    @Test
    void filterTest1()
    {
        String[] list = {"A", "B", "B", "B", "C"};
        String[] solution = {"A", "B", "C"};
        assertArrayEquals(solution, filter(list));
        list = new String[]{"C", "B", "C", "B", "C"};
        solution = new String[]{"C", "B"};
        assertArrayEquals(solution, filter(list));
        list = new String[]{"A", "B", "C", "D", "E"};
        assertArrayEquals(list, filter(list));
    }

    /**
     * Dieser Test überprüft, dass Filter bei ungewöhnlichen Eingaben korrekt arbeitet
     */
    @Test
    void filterTest2()
    {
        String[] list = {"A", "A", "A", "A", "A"};
        String[] solution = {"A"};
        assertArrayEquals(solution, filter(list));
        assertArrayEquals(solution, filter(solution));
        assertNull(filter(null));
    }

    /**
     * Dieser Test überprüft, dass die ersten Catalan-Zahlen korrekt berechnet werden
     */
    @Test
    void catalanTest1()
    {
        final int[] cat4 = {1, 1, 2, 5};
        final int[] cat7 = {1, 1, 2, 5, 14, 42, 132};
        assertArrayEquals(cat4, catalan(4));
        assertArrayEquals(cat7, catalan(7));
    }

    /**
     * Dieser Test überprüft, dass der Catalan-Algorithmus mit ungewöhnlichen Eingaben umgehen kann
     */
    @Test
    void catalanTest2()
    {
        assertArrayEquals(new int[]{1}, catalan(1));
        assertNull(catalan(0));
        assertNull(catalan(-1));
    }

    /**
     * Dieser Test überprüft, dass die put-Methode korrekt arbeitet
     */
    @Test
    void QueueTest1()
    {
        DataQueue queue = new DataQueue(2);
        assertTrue(queue.put(4));
        assertTrue(queue.put(6));
        assertFalse(queue.put(8));
        queue = new DataQueue(0);
        assertFalse(queue.put(8));
    }

    /**
     * Dieser Test überprüft, dass die get-Methode korrekt arbeitet
     */
    @Test
    void QueueTest2()
    {
        DataQueue queue = new DataQueue(5);
        assertTrue(queue.put(4));
        assertEquals(4, queue.get());
        assertTrue(queue.put(2));
        assertTrue(queue.put(6));
        assertTrue(queue.put(4));
        assertEquals(2, queue.get());
        assertEquals(6, queue.get());
        assertEquals(4, queue.get());
        assertEquals(-1, queue.get());
    }

    /**
     * Dieser Test überprüft, dass die push-Methode korrekt arbeitet
     */
    @Test
    void StackTest1()
    {
        DataStack stack = new DataStack(2);
        assertTrue(stack.push(4));
        assertTrue(stack.push(6));
        assertFalse(stack.push(8));
        stack = new DataStack(0);
        assertFalse(stack.push(8));
    }

    /**
     * Dieser Test überprüft, dass die pop-Methode korrekt arbeitet
     */
    @Test
    void StackTest2()
    {
        DataStack stack = new DataStack(5);
        assertTrue(stack.push(4));
        assertEquals(4, stack.pop());
        assertTrue(stack.push(6));
        assertTrue(stack.push(4));
        assertTrue(stack.push(2));
        assertEquals(2, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(-1, stack.pop());
    }

    /**
     * Hier wird die anagram-Methode mit gewöhnlichen Eingaben getestet
     */
    @Test
    void anagramTest1()
    {
        //Korrekte Eingabe
        String word1 = "ABCDEFG";
        String word2 = "CBGFEAD";
        assertTrue(anagram(word1, word2));
        //Falsche Eingabe
        word1 = "ABDEFG";
        word2 = "CBGEAD";
        assertFalse(anagram(word1, word2));
        //unterschiedliche Längen
        word1 = "ABD";
        word2 = "CBGEAD";
        assertFalse(anagram(word1, word2));
        word1 = "ABDEFG";
        word2 = "CBG";
        assertFalse(anagram(word1, word2));
    }

    /**
     * Hier wird die anagram-Methode mit ungewöhnlichen Eingaben getestet
     */
    @Test
    void anagramTest2()
    {
        //Duplikate
        String word1 = "AACAAC";
        String word2 = "CAAAAC";
        assertTrue(anagram(word1, word2));
        //Identität
        word1 = "ABCCBA";
        assertTrue(anagram(word1, word1));
        //Ein Element
        word1 = "AAA";
        assertFalse(anagram(word1, "A"));
        assertTrue(anagram("A", "A"));
        //NULL-Werte
        word1 = "ABIDE";
        assertFalse(anagram(word1, null));
        assertFalse(anagram(null, word1));
        assertFalse(anagram(null, null));
        //Das leere Wort
        assertFalse(anagram("", "       "));
        assertTrue(anagram("", ""));
        //Nur die Anzahl unterscheidet sich
        assertFalse(anagram("AAB", "ABB"));
    }

    /**
     * Hier wird die identicalParts-Methode mit gewöhnlichen Eingaben getestet
     */
    @Test
    void identicalPartsTest1()
    {
        //Korrekte Eingabe
        String word = "ABAB";
        assertTrue(identicalParts(word));
        //Falsche Eingabe (ungerade Länge)
        word = "ABCAB";
        assertFalse(identicalParts(word));
        //Falsche Eingabe (gerade Länge)
        word = "BAGGAB";
        assertFalse(identicalParts(word));
        //Falsche Eingabe (ohne Duplikate)
        word = "ABCD";
        assertFalse(identicalParts(word));
        //Korrekte Eingabe mit 5 Teilen
        word = "BAGBAGBAGBAGBAG";
        assertTrue(identicalParts(word));
    }

    /**
     * Hier wird die identicalParts-Methode mit ungewöhnlichen Eingaben getestet
     */
    @Test
    void identicalPartsTest2()
    {
        //Nur Duplikate (gerade Länge)
        String word = "AAAAAA";
        assertTrue(identicalParts(word));
        //Nur Duplikate (ungerade Länge)
        word = "AAA";
        assertTrue(identicalParts(word));
        //Ein Element
        word = "B";
        assertFalse(identicalParts(word));
        //Das leere Wort
        word = "";
        assertFalse(identicalParts(word));
        //Zerlegung in Leerzeichen
        word = "      ";
        assertTrue(identicalParts(word));
        //NULL Eingaben
        assertFalse(identicalParts(null));
        //Sehr große Eingabe
        assertTrue(identicalParts("( a".repeat(100)));
    }

    /**
     * Dieser Test testet die equals-Methode der SpecialSet-Klasse
     */
    @Test
    void specialSetTest1() {
        // The equal set without changes
        SpecialSet<Integer> set1 = new SpecialSet<>(new Integer[]{1, 2, 3, 4});
        SpecialSet<Integer> set2 = new SpecialSet<>(new Integer[]{1, 2, 3, 4});
        assertEquals(set2, set1);
        // Changing the order
        set2 = new SpecialSet<>(new Integer[]{4, 3, 1, 2});
        assertEquals(set2, set1);
        // duplicates
        set1 = new SpecialSet<>(new Integer[]{4, 4, 4, 4, 4, 2, 2, 2, 3, 1, 3, 1, 3, 2});
        assertEquals(set2, set1);
        // a different set which is a subset
        set2 = new SpecialSet<>(new Integer[]{1, 1, 2, 2});
        assertNotEquals(set2, set1);
        // a different set which is no subset
        set2 = new SpecialSet<>(new Integer[]{5, 6, 7, 8, 9});
        assertNotEquals(set2, set1);
    }

    /**
     * Dieser Test testet die equals-Methode der SpecialSet-Klasse mit ungewöhnlichen Eingaben
     */
    @Test
    void specialSetTest2() {
        // The identity
        SpecialSet<Integer> set1 = new SpecialSet<>(new Integer[]{1, 2, 3, 4});
        assertEquals(set1, set1);
        // Only one element
        SpecialSet<Integer> set2 = new SpecialSet<>(new Integer[]{1});
        SpecialSet<Integer> set3 = new SpecialSet<>(new Integer[]{0});
        SpecialSet<Integer> set4 = new SpecialSet<>(new Integer[]{0});
        assertNotEquals(set1, set2);
        assertNotEquals(set1, set3);
        assertNotEquals(set2, set3);
        assertEquals(set4, set3);
        // The empty set
        set2 = new SpecialSet<>(null);
        set3 = new SpecialSet<>(null);
        assertEquals(set3, set2);
        assertNotEquals(set1, set3);
        // Set is null
        assertNotEquals(set1, null);
    }

    /**
     * Testet das Verhalten des Algorithmus bei rein positiven Arrays
     */
    @Test
    void testSubArraySumSmallPositive()
    {
        int[] testArray1 = {1, 2, 3};
        assertEquals(6, maxSubArraySum(testArray1));
    }

    /**
     * Testet das Verhalten des Algorithmus bei sowohl positiven als auch negativen Einträgen, hierbei muss die
     * maximale Summe über eine negative Zahl hinweg gebildet werden
     */
    @Test
    void testSubArraySumSmallNegative()
    {
        int[] testArray1 = {1, 2, -1, 4, -2};
        assertEquals(6, maxSubArraySum(testArray1));
    }

    /**
     * Testet das Verhalten des Algorithmus bei rein negativen Arrays
     */
    @Test
    void testSubArraySumOnlyNegative()
    {
        int[] testArray1 = {-1, -2, -4, -7, -11, -1};
        assertEquals(0, maxSubArraySum(testArray1));
    }

    /**
     * Testet das Verhalten des Algorithmus bei einer größeren Eingabe
     */
    @Test
    void testSubArraySumLarge()
    {
        int[] testArray1 = {1, 2, 3, -3, 3, 2, -1, 5, 6, -6, 3};
        assertEquals(18, maxSubArraySum(testArray1));
    }

    /**
     * Testet das Verhalten des Algorithmus bei leerer Eingabe
     */
    @Test
    void testSubArraySumEmpty()
    {
        int[] testArray1 = {};
        assertThrows(IllegalArgumentException.class, () -> maxSubArraySum(testArray1));
    }

    /**
     * Testet das Verhalten des Algorithmus bei einer NULL-Eingabe
     */
    @Test
    void testSubArraySumNull()
    {
        assertThrows(IllegalArgumentException.class, () -> maxSubArraySum(null));
    }
}
