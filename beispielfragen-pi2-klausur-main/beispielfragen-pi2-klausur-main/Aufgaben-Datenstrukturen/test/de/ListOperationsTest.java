package de;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static de.ListOperations.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Hier folgen einige Tests zu den Listenoperationen
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * Here you will find some tests for the exercises provided for lists
 * (Please don't change anything in this file !)
 * @author Pascal Himmelmann
 */
class ListOperationsTest
{
    /**
     * Testet, dass in eine nicht leere Liste ein Element erfolgreich eingefügt wird
     */
    @Test
    void insertTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insert(list.getHead(), "P"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass null korrekt behandelt wird durch die "insert()"- Methode
     */
    @Test
    void insertTest2()
    {
        SLL<Integer> list = new SLL<>(new Node<>(1, new Node<>(2, new Node<>(3))));
        SLL<Integer> newList = new SLL<>(insert(list.getHead(), null));
        assertNotNull(newList.getHead());
        Iterator<Integer> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass korrekt in eine leere Liste eingefügt wird
     */
    @Test
    void insertTest3()
    {
        SLL<String> newList = new SLL<>(insert(null, "G"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("G", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass in eine nicht leere Liste ein Element erfolgreich eingefügt wird
     */
    @Test
    void insertAtTest1()
    {
        //Am Ende einfügen
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insertAt(list.getHead(), "P", "C"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertFalse(iterator.hasNext());

        //Am Anfang einfügen
        newList = new SLL<>(insertAt(newList.getHead(), "F", null));
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("F", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertFalse(iterator.hasNext());

        //In der Mitte einfügen
        newList = new SLL<>(insertAt(newList.getHead(), "P", "B"));
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("F", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("P", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertFalse(iterator.hasNext());

        //Umgang mit Duplikaten
        newList = new SLL<>(insertAt(newList.getHead(), "F", "P"));
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("F", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("P", iterator.next());
        assertEquals("F", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass null korrekt behandelt wird durch die "insert()"- Methode
     */
    @Test
    void insertAtTest2()
    {
        SLL<Integer> list = new SLL<>(new Node<>(1, new Node<>(2, new Node<>(3))));
        SLL<Integer> newList = new SLL<>(insertAt(list.getHead(), null, 2));
        newList = new SLL<>(insertAt(newList.getHead(), null, null));
        assertNotNull(newList.getHead());
        Iterator<Integer> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass korrekt in eine leere Liste eingefügt wird
     */
    @Test
    void insertAtTest3()
    {
        SLL<String> newList = new SLL<>(insertAt(null, "G", null));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("G", iterator.next());
        assertFalse(iterator.hasNext());

        //Anchor existiert nicht
        newList = new SLL<>(insertAt(newList.getHead(), "G", "F"));
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("G", iterator.next());
        assertFalse(iterator.hasNext());

    }

    /**
     * Testet, dass in eine nicht leere Liste eine Teilliste erfolgreich eingefügt wird (In der Mitte)
     */
    @Test
    void insertPartTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insertPart(list.getHead(), new Node<>("P", new Node<>("H")), "B"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("P", iterator.next());
        assertEquals("H", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass in eine nicht leere Liste eine Teilliste erfolgreich eingefügt wird (Am Anfang)
     */
    @Test
    void insertPartTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insertPart(list.getHead(), new Node<>("P", new Node<>("H")), null));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("P", iterator.next());
        assertEquals("H", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass in eine nicht leere Liste eine Teilliste erfolgreich eingefügt wird (Am Ende)
     */
    @Test
    void insertPartTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insertPart(list.getHead(), new Node<>("P", new Node<>("H")), "C"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("P", iterator.next());
        assertEquals("H", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass mit außergewöhnlichen Eingaben umgegangen werden kann
     */
    @Test
    void insertPartTest4()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(insertPart(list.getHead(), null, "B"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(insertPart(null, list.getHead(), null));
        assertNotNull(newList.getHead());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(insertPart(null, null, null));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltenes Element erfolgreich gelöscht wird (In der Mitte)
     */
    @Test
    void deleteTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(delete(list.getHead(), "B"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltenes Element erfolgreich gelöscht wird (Am Ende)
     */
    @Test
    void deleteTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(delete(list.getHead(), "C"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltenes Element erfolgreich gelöscht wird (Am Anfang)
     */
    @Test
    void deleteTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(delete(list.getHead(), "A"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass die Liste mit einem nicht vorhandenen Element umgehen kann beim Löschvorgang
     */
    @Test
    void deleteTest4()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(delete(list.getHead(), "P"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass eine leere Liste korrekt behandelt wird beim Löschvorgang
     */
    @Test
    void deleteTest5()
    {
        SLL<String> newList = new SLL<>(delete(null, "P"));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltener Abschnitt erfolgreich gelöscht wird (In der Mitte)
     */
    @Test
    void deletePartTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D")))));
        SLL<String> newList = new SLL<>(deletePart(list.getHead(), new Node<>("B", new Node<>("C"))));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltener Abschnitt erfolgreich gelöscht wird (Am Anfang)
     */
    @Test
    void deletePartTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D")))));
        SLL<String> newList = new SLL<>(deletePart(list.getHead(), new Node<>("A", new Node<>("B"))));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass aus einer nicht leeren Liste ein enthaltener Abschnitt erfolgreich gelöscht wird (Am Ende)
     */
    @Test
    void deletePartTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D")))));
        SLL<String> newList = new SLL<>(deletePart(list.getHead(), new Node<>("C", new Node<>("D"))));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass mit außergewöhnlichen Eingaben umgegangen werden kann
     */
    @Test
    void deletePartTest4()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D")))));
        SLL<String> newList = new SLL<>(deletePart(list.getHead(), new Node<>("B", new Node<>("D"))));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(deletePart(list.getHead(), null));
        assertNotNull(newList.getHead());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(deletePart(list.getHead(), list.getHead()));
        assertNull(newList.getHead());
        newList = new SLL<>(deletePart(null, new Node<>("A")));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass ein Tausch zweier bestehender Elemente möglich ist (In der Mitte)
     */
    @Test
    void swapTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("E"))))));
        SLL<String> newList = new SLL<>(swap(list.getHead(), "B", "C"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("D", iterator.next());
        assertEquals("E", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass ein Tausch zweier bestehender Elemente möglich ist (Anfang und Ende)
     */
    @Test
    void swapTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("E"))))));
        SLL<String> newList = new SLL<>(swap(list.getHead(), "A", "E"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("E", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass ein Tausch nicht möglich ist, falls eines der Elemente nicht enthalten ist in der Liste
     */
    @Test
    void swapTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("E"))))));
        SLL<String> newList = new SLL<>(swap(list.getHead(), "B", "P"));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertEquals("E", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass mit einer leeren Liste umgegangen werden kann
     */
    @Test
    void swapTest4()
    {
        SLL<String> newList = new SLL<>(swap(null, "A", "B"));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass zwei nicht leere Listen erfolgreich konkateniert werden können
     */
    @Test
    void concatenateTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("F")))));
        SLL<String> list2 = new SLL<>(new Node<>("G", new Node<>("H")));
        SLL<String> newList = new SLL<>(concatenate(list.getHead(), list2.getHead()));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("F", iterator.next());
        assertEquals("G", iterator.next());
        assertEquals("H", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass eine leere Liste erfolgreich an eine nicht leere Liste konkateniert werden kann
     */
    @Test
    void concatenateTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(concatenate(list.getHead(), null));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass eine nicht leere Liste erfolgreich an eine leere Liste konkateniert werden kann
     */
    @Test
    void concatenateTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(concatenate(null, list.getHead()));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass 2 leere Listen korrekt konkateniert werden können
     */
    @Test
    void concatenateTest4()
    {
        SLL<String> newList = new SLL<>(concatenate(null, null));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass ein Index korrekt ermittelt wird, falls das Element enthalten ist (In der Mitte)
     */
    @Test
    void searchTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int index = search(list.getHead(), "B");
        assertEquals(1, index);
    }

    /**
     * Testet, dass ein Index korrekt ermittelt wird, falls das Element enthalten ist (Am Ende)
     */
    @Test
    void searchTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int index = search(list.getHead(), "C");
        assertEquals(2, index);
    }

    /**
     * Testet, dass ein Index korrekt ermittelt wird, falls das Element enthalten ist (Am Anfang)
     */
    @Test
    void searchTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int index = search(list.getHead(), "A");
        assertEquals(0, index);
    }

    /**
     * Testet, dass ein Index korrekt ermittelt wird, falls das Element nicht enthalten ist
     */
    @Test
    void searchTest4()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int index = search(list.getHead(), "P");
        assertEquals(-1, index);
    }

    /**
     * Testet, dass die Methode mit einer leeren Eingabe umgehen kann
     */
    @Test
    void searchTest5()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int index = search(null, "B");
        assertEquals(-1, index);
        index = search(list.getHead(), null);
        assertEquals(-1, index);
    }

    /**
     * Testet, dass die Methode countOccurrences auf regulären Eingaben korrekt funktioniert.
     */
    @Test
    void countOccurrencesTest1()
    {
        // Element kommt einmal vor (Am Anfang)
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        assertEquals(1, countOccurrences(list.getHead(), "A"));

        // Element kommt einmal vor (Am Ende)
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        assertEquals(1, countOccurrences(list.getHead(), "C"));

        // Element kommt einmal vor (In der Mitte)
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("E"))))));
        assertEquals(1, countOccurrences(list.getHead(), "C"));

        // Element kommt mehrfach vor (Anfang und Ende)
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("A"))))));
        assertEquals(2, countOccurrences(list.getHead(), "A"));

        // Element kommt mehrfach vor (Anfang und Mitte)
        list = new SLL<>(new Node<>("C", new Node<>("B", new Node<>("C", new Node<>("D", new Node<>("A"))))));
        assertEquals(2, countOccurrences(list.getHead(), "C"));

        // Element kommt mehrfach vor (Ende und Mitte)
        list = new SLL<>(new Node<>("C", new Node<>("B", new Node<>("A", new Node<>("D", new Node<>("A"))))));
        assertEquals(2, countOccurrences(list.getHead(), "A"));

        // Element kommt mehrfach vor (Anfang, Ende und Mitte)
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("A", new Node<>("D", new Node<>("A"))))));
        assertEquals(3, countOccurrences(list.getHead(), "A"));
    }

    /**
     * Testet, dass die Methode countOccurrences auf ungewöhnlichen Eingaben korrekt funktioniert.
     */
    @Test
    void countOccurrencesTest2()
    {
        // Element kommt nicht vor
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        assertEquals(0, countOccurrences(list.getHead(), "E"));
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("A", new Node<>("D", new Node<>("A"))))));
        assertEquals(0, countOccurrences(list.getHead(), "C"));

        // Element kommt ausschließlich vor
        list = new SLL<>(new Node<>("A", new Node<>("A", new Node<>("A"))));
        assertEquals(3, countOccurrences(list.getHead(), "A"));
        list = new SLL<>(new Node<>("A", new Node<>("A", new Node<>("A", new Node<>("A", new Node<>("A"))))));
        assertEquals(5, countOccurrences(list.getHead(), "A"));

        // Nur ein Element
        list = new SLL<>(new Node<>("A"));
        assertEquals(1, countOccurrences(list.getHead(), "A"));
        list = new SLL<>(new Node<>("C"));
        assertEquals(0, countOccurrences(list.getHead(), "A"));

        // Leere Listen oder leere Elemente
        assertEquals(0, countOccurrences(null, "A"));
        assertEquals(0, countOccurrences(list.getHead(), null));
        assertEquals(0, countOccurrences(null, null));
    }

    /**
     * Testet das Verhalten der isSorted-Methode bei gewöhnlichen Eingaben
     */
    @Test
    void isSortedTest1()
    {
        // Eine sortierte Liste
        SLL<Integer> list = new SLL<>(new Node<>(1, new Node<>(2, new Node<>(3))));
        assertTrue(isSorted(list.getHead()));

        // Eine am Ende unsortierte Liste
        list = new SLL<>(new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(0)))));
        assertFalse(isSorted(list.getHead()));

        // Eine am Anfang unsortierte Liste
        list = new SLL<>(new Node<>(4, new Node<>(2, new Node<>(3, new Node<>(5)))));
        assertFalse(isSorted(list.getHead()));

        // Eine in der Mitte unsortierte Liste
        list = new SLL<>(new Node<>(1, new Node<>(2, new Node<>(5, new Node<>(3, new Node<>(4))))));
        assertFalse(isSorted(list.getHead()));

        // Eine lange sortierte Liste mit Duplikaten
        list = new SLL<>(new Node<>(1, new Node<>(1, new Node<>(3,
                new Node<>(3, new Node<>(4, new Node<>(4)))))));
        assertTrue(isSorted(list.getHead()));
    }

    /**
     * Testet das Verhalten der isSorted-Methode bei ungewöhnlichen Eingaben
     */
    @Test
    void isSortedTest2()
    {
        // Eine Liste mit einem Element
        assertTrue(isSorted(new Node<>(1)));

        // Eine leere Liste
        assertTrue(isSorted(null));

        // Eine Liste mit nur Duplikaten
        assertTrue(isSorted(new Node<>(1, new Node<>(1, new Node<>(1)))));

    }

    /**
     * Testet, dass eine nicht leere Liste erfolgreich einmal oder zweimal dupliziert werden kann
     */
    @Test
    void duplicateTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(duplicate(list.getHead(), 1));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        //Jetzt für loop = 2
        list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        newList = new SLL<>(duplicate(list.getHead(), 2));
        assertNotNull(newList.getHead());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass eine nicht leere Liste erfolgreich mehrfach dupliziert werden kann
     */
    @Test
    void duplicateTest2_Optional()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B")));
        SLL<String> newList = new SLL<>(duplicate(list.getHead(), 3));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass ein einzelnes Element häufig dupliziert werden kann
     */
    @Test
    void duplicateTest3_Optional()
    {
        SLL<String> list = new SLL<>(new Node<>("A"));
        SLL<String> newList = new SLL<>(duplicate(list.getHead(), 99));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        for (int i = 0; i < 100; i++) {
            assertEquals("A", iterator.next());
        }
        assertFalse(iterator.hasNext());
    }
    /**
     * Testet, dass mit außergewöhnlichen Eingaben richtig umgegangen wird
     */
    @Test
    void duplicateTest4()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(duplicate(list.getHead(), 0));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(duplicate(list.getHead(), -1));
        assertNull(newList.getHead());
        newList = new SLL<>(duplicate(null, 1));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass eine nicht leere Liste erfolgreich umgedreht werden kann (Ungerade Länge)
     */
    @Test
    void reverseTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        SLL<String> newList = new SLL<>(reverse(list.getHead()));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("C", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass eine nicht leere Liste erfolgreich umgedreht werden kann (Gerade Länge)
     */
    @Test
    void reverseTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D")))));
        SLL<String> newList = new SLL<>(reverse(list.getHead()));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("D", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, dass mit außergewöhnlichen Eingaben umgegangen werden kann
     */
    @Test
    void reverseTest3()
    {
        SLL<String> list = new SLL<>(new Node<>("A"));
        SLL<String> newList = new SLL<>(reverse(list.getHead()));
        assertNotNull(newList.getHead());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
        newList = new SLL<>(reverse(null));
        assertNull(newList.getHead());
    }

    /**
     * Testet, dass die Länge einer nicht leere Liste erfolgreich ermittelt werden kann
     */
    @Test
    void lengthTest1()
    {
        SLL<String> list = new SLL<>(new Node<>("A", new Node<>("B", new Node<>("C"))));
        int length = length(list.getHead());
        assertEquals(3, length);
    }

    /**
     * Testet, dass mit außergewöhnlichen Eingaben umgegangen werden kann
     */
    @Test
    void lengthTest2()
    {
        SLL<String> list = new SLL<>(new Node<>("A"));
        int length = length(list.getHead());
        assertEquals(1, length);
        length = length(null);
        assertEquals(0, length);
    }

    /**
     * Testet, ob sortedSet korrekt erzeugt werden können
     */
    @Test
    void sortedSetTest1()
    {
        //Hier wird eine unsortierte Liste ohne Duplikate übergeben
        SLL<String> list = new SLL<>(new Node<>("B", new Node<>("D", new Node<>("A", new Node<>("C")))));
        SortedSet<String> set = new SortedSet<>(list.getHead());
        SLL<String> newList = new SLL<>(set.getFirst());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
        //Hier wird eine Liste mit Duplikaten übergeben
        list = new SLL<>(new Node<>("A", new Node<>("D", new Node<>("A", new Node<>("D")))));
        set = new SortedSet<>(list.getHead());
        newList = new SLL<>(set.getFirst());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
        //Hier wird eine vorsortierte Liste übergeben
        list = new SLL<>(new Node<>("A", new Node<>("A", new Node<>("B", new Node<>("C")))));
        set = new SortedSet<>(list.getHead());
        newList = new SLL<>(set.getFirst());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        //Hier wird eine falsch herum vorsortierte Liste übergeben
        list = new SLL<>(new Node<>("D", new Node<>("C", new Node<>("C", new Node<>("A")))));
        set = new SortedSet<>(list.getHead());
        newList = new SLL<>(set.getFirst());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Testet, ob sortedSet mit ungewöhnlichen Eingaben umgehen können
     */
    @Test
    void sortedSetTest2()
    {
        //Hier wird eine Liste mir nur einem Element übergeben
        SLL<String> list = new SLL<>(new Node<>("A"));
        SortedSet<String> set = new SortedSet<>(list.getHead());
        SLL<String> newList = new SLL<>(set.getFirst());
        Iterator<String> iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
        //Hier wird eine Liste mir nur einem Element sowie Duplikaten übergeben
        list = new SLL<>(new Node<>("A", new Node<>("A", new Node<>("A", new Node<>("A")))));
        set = new SortedSet<>(list.getHead());
        newList = new SLL<>(set.getFirst());
        iterator = newList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertFalse(iterator.hasNext());
        //Hier wird eine leere Liste übergeben
        assertNull(new SortedSet<Integer>(null).getFirst());
    }
}
