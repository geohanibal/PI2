package de;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static de.TreeOperations.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Hier folgen einige Tests zu den Baumoperationen
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * here you will find some tests for the exercises provided in TreeOperations
 * (Please don't change anything in this file !)
 * @author Pascal Himmelmann
 */
class TreeOperationsTest
{
    /**
     * Testet das Verhalten der Insert-Methode bei verschiedenen Eingaben
     */
    @Test
    void insertTest1()
    {
        //Nur ein Blatt vorhanden → Links einfügen
        Tree<String> tree = new Tree<>(new Node<>("A"));
        Tree<String> solution = new Tree<>(new Node<>("A", new Node<>("B"), null));
        assertEquals(solution, new Tree<>(insert(tree.getRoot(), "B")));
        //Linker Nachfolger vorhanden → Rechts einfügen
        tree = new Tree<>(new Node<>("A", new Node<>("B"), null));
        solution = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(solution, new Tree<>(insert(tree.getRoot(), "C")));
        //Mehrere Nachfolger vorhanden → Abstieg nötig einfügen
        tree = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), new Node<>("F"))));
        solution = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("Z"), new Node<>("D")),
                new Node<>("C", new Node<>("E"), new Node<>("F"))));
        assertEquals(solution, new Tree<>(insert(tree.getRoot(), "Z")));
    }

    /**
     * Testet das Verhalten der Insert-Methode bei ungewöhnlichen Eingaben
     */
    @Test
    void insertTest2()
    {
        //Null als Element übergeben
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(tree, new Tree<>(insert(tree.getRoot(), null)));
        // Null als Baum
        assertEquals(new Tree<>(new Node<>("A")), new Tree<>(insert(null, "A")));
    }

    /**
     * Testet das Verhalten der InsertIntoSearchTree-Methode bei verschiedenen Eingaben
     */
    @Test
    void insertIntoSearchTest1()
    {
        // Nur ein Knoten vorhanden - Links einfügen
        Tree<Integer> tree = new Tree<>(new Node<>(2));
        Tree<Integer> solution = new Tree<>(new Node<>(2, new Node<>(1), null));
        assertEquals(solution, new Tree<>(insertIntoSearchTree(tree.getRoot(), 1)));

        // Nur ein Knoten vorhanden - Rechts einfügen
        tree = new Tree<>(new Node<>(2));
        solution = new Tree<>(new Node<>(2, null, new Node<>(3)));
        assertEquals(solution, new Tree<>(insertIntoSearchTree(tree.getRoot(), 3)));

        // Komplexer Baum - Links einfügen
        tree = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4)),
                new Node<>(7, new Node<>(6), new Node<>(9))));
        solution = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1, new Node<>(0), null), new Node<>(4)),
                new Node<>(7, new Node<>(6), new Node<>(9))));
        assertEquals(solution, new Tree<>(insertIntoSearchTree(tree.getRoot(), 0)));

        // Komplexer Baum - Rechts einfügen
        tree = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4)),
                new Node<>(7, new Node<>(6), new Node<>(9))));
        solution = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4)),
                new Node<>(7, new Node<>(6), new Node<>(9, null, new Node<>(11)))));
        assertEquals(solution, new Tree<>(insertIntoSearchTree(tree.getRoot(), 11)));

        // Komplexer Baum - In der Mitte einfügen
        tree = new Tree<>(new Node<>(10, new Node<>(5, new Node<>(2), new Node<>(7)),
                new Node<>(15, new Node<>(12), new Node<>(22))));
        solution = new Tree<>(new Node<>(10, new Node<>(5, new Node<>(2),
                new Node<>(7, new Node<>(6), new Node<>(8))),
                new Node<>(15, new Node<>(12), new Node<>(22))));

        tree = new Tree<>(insertIntoSearchTree(tree.getRoot(), 6));
        tree = new Tree<>(insertIntoSearchTree(tree.getRoot(), 8));

        assertEquals(solution, tree);

        solution = new Tree<>(new Node<>(10, new Node<>(5, new Node<>(2),
                new Node<>(7, new Node<>(6), new Node<>(8))),
                new Node<>(15, new Node<>(12, new Node<>(11), new Node<>(14)), new Node<>(22))));

        tree = new Tree<>(insertIntoSearchTree(tree.getRoot(), 11));
        tree = new Tree<>(insertIntoSearchTree(tree.getRoot(), 14));

        assertEquals(solution, tree);
    }

    /**
     * Testet das Verhalten der InsertIntoSearchTree-Methode bei ungewöhnlichen Eingaben
     */
    @Test
    void insertIntoSearchTest2()
    {
        //Null als Element übergeben
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(tree, new Tree<>(insertIntoSearchTree(tree.getRoot(), null)));
        // Null als Baum
        assertEquals(new Tree<>(new Node<>("A")), new Tree<>(insertIntoSearchTree(null, "A")));

        // Duplikate einfügen immer rechts
        tree = new Tree<>(new Node<>("B"));
        Tree<String> solution = new Tree<>(new Node<>("B", null, new Node<>("B", null, new Node<>("B"))));
        assertEquals(solution, new Tree<>(insertIntoSearchTree(insertIntoSearchTree(tree.getRoot(), "B"), "B")));
    }

    /**
     * Testet das Verhalten der delete-Methode bei verschiedenen Eingaben
     */
    @Test
    void deleteTest1()
    {
        //Ein Knoten ohne Nachfolger wird gelöscht
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        Tree<String> solution = new Tree<>(new Node<>("A", null, new Node<>("C")));
        assertEquals(solution, new Tree<>(delete(tree.getRoot(), "B")));
        //Ein Knoten mit einem Nachfolger löschen
        tree = new Tree<>(new Node<>("A", null, new Node<>("C")));
        solution = new Tree<>(new Node<>("C"));
        assertEquals(solution, new Tree<>(delete(tree.getRoot(), "A")));
        //Knoten mit mehreren Nachfolgern löschen
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"), new Node<>("F")), new Node<>("C")));
        solution = new Tree<>(new Node<>("B", new Node<>("E", null, new Node<>("F")), new Node<>("C")));
        assertEquals(solution, new Tree<>(delete(tree.getRoot(), "A")));
    }

    /**
     * Testet das Verhalten der delete-Methode bei ungewöhnlichen Eingaben
     */
    @Test
    void deleteTest2()
    {
        //Nicht enthaltenes Element
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(tree, new Tree<>(delete(tree.getRoot(), "D")));
        //Einziges Element löschen
        tree = new Tree<>(new Node<>("A"));
        assertNull(delete(tree.getRoot(), "A"));
    }

    /**
     * Testet das Verhalten der delete-Methode bei mehreren Löschoperationen
     */
    @Test
    void deleteTest3()
    {
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("A"), null),
                new Node<>("C", null, new Node<>("A"))));
        Tree<String> solution = new Tree<>(new Node<>("B", null, new Node<>("C")));
        assertEquals(solution, new Tree<>(delete(tree.getRoot(), "A")));
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), null),
                new Node<>("B", null, new Node<>("C"))));
        solution = new Tree<>(new Node<>("A", new Node<>("C"), new Node<>("C")));
        assertEquals(solution, new Tree<>(delete(tree.getRoot(), "B")));
        // Hier wird der komplette Baum gelöscht
        tree = new Tree<>(new Node<>("A", new Node<>("A", new Node<>("A"), null),
                new Node<>("A", null, new Node<>("A"))));
        assertNull(delete(tree.getRoot(), "A"));
    }

    /**
     * Testet das Verhalten der delete-Methode in den Fehlerfällen
     */
    @Test
    void deleteTest4_Fehlerfall()
    {
        //Null als Element übergeben
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(tree, new Tree<>(delete(tree.getRoot(), null)));
        //NUll als Baum
        assertNull(delete(null, "A"));
    }

    /**
     * Testet das Verhalten der countLeaves-Methode auf verschiedenen Eingaben
     */
    @Test
    void countLeavesTest1()
    {
        //Ein Baum mit mehreren Blättern (balanciert)
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(4, countLeaves(tree.getRoot()));
        //Ein Baum mit mehreren Blättern (unbalanciert)
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D"), null), null), null));
        assertEquals(5, countLeaves(tree.getRoot()));
        //Ein großer Baum
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("D", new Node<>("H"),
                new Node<>("K")), new Node<>("E")), new Node<>("C", new Node<>("F"),
                new Node<>("G", new Node<>("J"), new Node<>("I")))));
        assertEquals(12, countLeaves(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der countLeaves-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void countLeavesTest2()
    {
        //Eine einzelne Wurzel
        Tree<String> tree = new Tree<>(new Node<>("A"));
        assertEquals(2, countLeaves(tree.getRoot()));
        //Ein leerer Baum
        assertEquals(1, countLeaves(null));
    }

    /**
     * Testet das Verhalten der countNodes-Methode auf verschiedenen Eingaben
     */
    @Test
    void countNodesTest1()
    {
        //Ein Baum mit mehreren Knoten (balanciert)
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(3, countNodes(tree.getRoot()));
        //Ein Baum mit mehreren Knoten (unbalanciert)
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D"), null), null), null));
        assertEquals(4, countNodes(tree.getRoot()));
        //Ein großer Baum
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("D", new Node<>("H"),
                new Node<>("K")), new Node<>("E")), new Node<>("C", new Node<>("F"),
                new Node<>("G", new Node<>("J"), new Node<>("I")))));
        assertEquals(11, countNodes(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der countNodes-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void countNodesTest2()
    {
        //Eine einzelne Wurzel
        Tree<String> tree = new Tree<>(new Node<>("A"));
        assertEquals(1, countNodes(tree.getRoot()));
        //Ein leerer Baum
        assertEquals(0, countNodes(null));
    }

    /**
     * Testet das Verhalten der getHeight-Methode auf verschiedenen Eingaben
     */
    @Test
    void getHeightTest1()
    {
        //Ein Baum mit mehreren Knoten (balanciert)
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B"), new Node<>("C")));
        assertEquals(2, getHeight(tree.getRoot()));
        //Ein Baum mit mehreren Knoten (unbalanciert)
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C", new Node<>("D"), null), null), null));
        assertEquals(4, getHeight(tree.getRoot()));
        //Ein großer Baum
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("D", new Node<>("H"),
                new Node<>("K")), new Node<>("E")), new Node<>("C", new Node<>("F"),
                new Node<>("G", new Node<>("J"), new Node<>("I")))));
        assertEquals(4, getHeight(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der getHeight-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void getHeightTest2()
    {
        //Eine einzelne Wurzel
        Tree<String> tree = new Tree<>(new Node<>("A"));
        assertEquals(1, getHeight(tree.getRoot()));
        //Ein leerer Baum
        assertEquals(0, getHeight(null));
    }

    /**
     * Testet das Verhalten der getPath-Methode auf verschiedenen Eingaben
     */
    @Test
    void pathTest1()
    {
        //Ein Pfad der Länge 2 nach links
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"), new Node<>("G")), new Node<>("C")));
        assertEquals(2, getPath(tree.getRoot(), "E"));
        //Ein Pfad der Länge 3 nach rechts
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"), new Node<>("G")),
                new Node<>("C", new Node<>("D", new Node<>("Z"), null), new Node<>("Y"))));
        assertEquals(3, getPath(tree.getRoot(), "Z"));
    }

    /**
     * Testet das Verhalten der getPath-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void pathTest2()
    {
        //Ein Pfad der Länge 0
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"), new Node<>("G")), new Node<>("C")));
        assertEquals(0, getPath(tree.getRoot(), "A"));
    }

    /**
     * Testet das Verhalten der getPath-Methode bei den Fehlerfällen
     */
    @Test
    void pathTest3_Fehlerfall()
    {
        //Ein Pfad der Länge -1
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"), new Node<>("G")),
                new Node<>("C", new Node<>("D", new Node<>("Z"), null), new Node<>("Y"))));
        assertEquals(-1, getPath(tree.getRoot(), "O"));
        //Null als Element
        assertEquals(-1, getPath(tree.getRoot(), null));
        //Null als Baum
        assertEquals(-1, getPath(null, "A"));
        //Null darf niemals gefunden werden
        assertEquals(-1, getPath(null, null));
    }

    /**
     * Testet das Verhalten der longestPath-Methode auf verschiedenen Eingaben
     */
    @Test
    void longestPathTest1()
    {
        //Ein balancierter Baum mit Weg über die Wurzel
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("E"),
                new Node<>("G")), new Node<>("C", new Node<>("Y"), new Node<>("Z"))));
        assertEquals(4, longestPath(tree.getRoot()));
        //Ein unbalancierter Baum mit Weg nicht über die Wurzel
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C",
                new Node<>("D", null, new Node<>("G")), null),
                new Node<>("E", null, new Node<>("Z", new Node<>("J"), null))), new Node<>("H")));
        assertEquals(6, longestPath(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der longestPath-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void longestPathTest2()
    {
        //Ein Baum mit nur einem Pfad
        Tree<String> tree = new Tree<>(new Node<>("A", null, new Node<>("B")));
        assertEquals(1, longestPath(tree.getRoot()));
        //Ein Baum ohne Pfade
        tree = new Tree<>(new Node<>("A"));
        assertEquals(0, longestPath(tree.getRoot()));

    }

    /**
     * Testet das Verhalten der longestPath-Methode bei den Fehlerfällen
     */
    @Test
    void longestPathTest3_Fehlerfall()
    {
        //Ein leerer Baum
        assertEquals(-1, longestPath(null));

    }

    /**
     * Testet das Verhalten der isSortedTree-Methode auf verschiedenen Eingaben
     */
    @Test
    void sortedTest1()
    {
        //Ein sortierter Baum (balanciert)
        Tree<Integer> tree = new Tree<>(new Node<>(5, new Node<>(4, new Node<>(3), new Node<>(2))
                , new Node<>(3, new Node<>(2), new Node<>(1))));
        assertTrue(isSortedTree(tree.getRoot()));
        //Ein sortierter Baum (unbalanciert)
        tree = new Tree<>(new Node<>(5, new Node<>(4, null, new Node<>(2
                , new Node<>(1), new Node<>(0))), null));
        assertTrue(isSortedTree(tree.getRoot()));
        //Ein unsortierter Baum (balanciert)
        tree = new Tree<>(new Node<>(7, new Node<>(4, new Node<>(6), new Node<>(2))
                , new Node<>(3, new Node<>(0), new Node<>(1))));
        assertFalse(isSortedTree(tree.getRoot()));
        //Ein unsortierter Baum (unbalanciert)
        tree = new Tree<>(new Node<>(5, new Node<>(4, null, new Node<>(2
                , new Node<>(1), new Node<>(25))), null));
        assertFalse(isSortedTree(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der isSortedTree-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void sortedTest2()
    {
        // Ein einzelner Knoten ist sortiert
        Tree<Integer> tree = new Tree<>(new Node<>(3));
        assertTrue(isSortedTree(tree.getRoot()));
        // Auch gleiche Elemente sind sortiert
        tree = new Tree<>(new Node<>(3, new Node<>(3, new Node<>(2, new Node<>(2), null), null),
                new Node<>(3, null, new Node<>(2, null, new Node<>(2)))));
        assertTrue(isSortedTree(tree.getRoot()));
        //Ein leerer Baum ist sortiert
        assertTrue(isSortedTree(null));
        //Ein einzelner Pfad wird korrekt geprüft
        tree = new Tree<>(new Node<>(3, null, new Node<>(333)));
        assertTrue(isSortedTree(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der balanced-Methode auf verschiedenen Eingaben
     */
    @Test
    void balancedTest1()
    {
        // Ein perfekt balancierter Baum
        Tree<Integer> tree = new Tree<>(new Node<>(3, new Node<>(4, new Node<>(5), new Node<>(7)),
                new Node<>(5, new Node<>(4), new Node<>(3))));
        assertTrue(balanced(tree.getRoot()));
        // Ein balancierter Baum, der links höher ist
        tree = new Tree<>(new Node<>(3, new Node<>(4, new Node<>(5), null),
                new Node<>(5)));
        assertTrue(balanced(tree.getRoot()));
        // Ein balancierter Baum, der rechts höher ist
        tree = new Tree<>(new Node<>(3, new Node<>(4),
                new Node<>(5, null, new Node<>(7))));
        assertTrue(balanced(tree.getRoot()));
        // Ein unbalancierter Baum, der rechts höher ist
        tree = new Tree<>(new Node<>(3, new Node<>(4),
                new Node<>(5, null, new Node<>(7, null, new Node<>(5)))));
        assertFalse(balanced(tree.getRoot()));
        // Ein unbalancierter Baum, der links höher ist
        tree = new Tree<>(new Node<>(3, new Node<>(4, new Node<>(5, new Node<>(4), null), null),
                new Node<>(5)));
        assertFalse(balanced(tree.getRoot()));

        // Ein unbalancierter Baum mit zwei langen Ketten
        tree = new Tree<>(
                new Node<>( 1,
                        new Node<>( 1,
                                new Node<>( 1,
                                        new Node<>( 1 ),
                                        null ),
                                null ),
                        new Node<>( 1,
                                null,
                                new Node<>( 1,
                                        null,
                                        new Node<>( 1 ) ) ) )
        );
        assertFalse( balanced( tree.getRoot() ) );
    }

    /**
     * Testet das Verhalten der balanced-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void balancedTest2()
    {
        //Ein einzelner Knoten ist balanciert
        Tree<String> tree = new Tree<>(new Node<>("A"));
        assertTrue(balanced(tree.getRoot()));
        //Ein Listenbaum ist unbalanciert
        tree = new Tree<>(new Node<>("A", new Node<>("B",
                new Node<>("C", new Node<>("D"), null), null), null));
        assertFalse(balanced(tree.getRoot()));
        //Ein leerer Baum ist balanciert
        assertTrue(balanced(null));
        //Ein einzelner Pfad ist balanciert
        tree = new Tree<>(new Node<>("A", null, new Node<>("A")));
        assertTrue(balanced(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der variability-Methode auf verschiedenen Eingaben
     */
    @Test
    void variabilityTest1()
    {
        //ein balancierter und sortierter Baum
        Tree<Integer> tree = new Tree<>(new Node<>(5, new Node<>(4, new Node<>(2), new Node<>(2)),
                new Node<>(3, new Node<>(1), new Node<>(1))));
        assertEquals(4, variability(tree.getRoot()));
        //Ein unbalancierter und unsortierter Baum
        tree = new Tree<>(new Node<>(5, new Node<>(2, new Node<>(10, null,
                new Node<>(5, new Node<>(1), null)), null), new Node<>(7)));
        assertEquals(9, variability(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der variability-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void variabilityTest2()
    {
        //Ein einzelner Knoten hat keine Variabilität
        Tree<Integer> tree = new Tree<>(new Node<>(5));
        assertEquals(0, variability(tree.getRoot()));
        //Ein nicht trivialer Baum ohne Variabilität
        tree = new Tree<>(new Node<>(5, new Node<>(5, null, new Node<>(5)),
                new Node<>(5, new Node<>(5), new Node<>(5))));
        assertEquals(0, variability(tree.getRoot()));
        //Ein einzelner Pfad mit großer Variabilität
        tree = new Tree<>(new Node<>(0, null, new Node<>(125)));
        assertEquals(125, variability(tree.getRoot()));
    }

    /**
     * Testet das Verhalten der variability-Methode in Fehlerfällen
     */
    @Test
    void variabilityTest3_Fehlerfall()
    {
        //Ein leerer Baum hat Variabilität -1
        assertEquals(-1, variability(null));
    }

    /**
     * Testet das Verhalten der merge-Methode auf verschiedenen Eingaben
     */
    @Test
    void mergeTest1()
    {
        //2 normale Bäume werden vereinigt
        Tree<String> tree1 = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)));
        Tree<String> tree2 = new Tree<>(new Node<>("Z", new Node<>("Y", null, new Node<>("X")),
                new Node<>("V", new Node<>("W"), null)));
        Tree<String> solution = new Tree<>(new Node<>("P", new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)),
                new Node<>("Z", new Node<>("Y", null, new Node<>("X")),
                        new Node<>("V", new Node<>("W"), null))));
        assertEquals(solution, new Tree<>(merge(tree1.getRoot(), tree2.getRoot(), "P")));
        //Zwei Bäume mit gleicher Wurzel werden vereinigt
        tree1 = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")), null));
        tree2 = new Tree<>(new Node<>("A", null, new Node<>("Z", new Node<>("X"), new Node<>("Y"))));
        solution = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("Z", new Node<>("X"), new Node<>("Y"))));
        assertEquals(solution, new Tree<>(merge(tree1.getRoot(), tree2.getRoot(), null)));
        //Zwei Bäume, die nicht vereinigt werden können
        tree1 = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)));
        tree2 = new Tree<>(new Node<>("Z", new Node<>("Y", null, new Node<>("X")),
                new Node<>("V", new Node<>("W"), null)));
        assertNull(merge(tree1.getRoot(), tree2.getRoot(), null));
    }

    /**
     * Testet das Verhalten der merge-Methode auf ungewöhnlichen Eingaben
     */
    @Test
    void mergeTest2()
    {
        //Einer der Bäume ist leer
        Tree<String> tree1 = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)));
        Tree<String> tree2 = new Tree<>(new Node<>("Z", new Node<>("Y", null, new Node<>("X")),
                new Node<>("V", new Node<>("W"), null)));
        Tree<String> solution = new Tree<>(new Node<>("P", new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)), null));
        assertEquals(solution, new Tree<>(merge(tree1.getRoot(), null, "P")));
        solution = new Tree<>(new Node<>("P", null, new Node<>("Z", new Node<>("Y", null, new Node<>("X")),
                new Node<>("V", new Node<>("W"), null))));
        assertEquals(solution, new Tree<>(merge(null, tree2.getRoot(), "P")));
        //Beide Bäume sind leer
        assertNull(merge(null, null, null));
        assertEquals(new Node<>("X"), merge(null, null, "X"));
        //Einen Baum mit sich selbst vereinen
        tree1 = new Tree<>(new Node<>("A", new Node<>("B", null, new Node<>("D")),
                new Node<>("C", new Node<>("E"), null)));
        tree2 = new Tree<>(new Node<>("Z", null,
                new Node<>("V", new Node<>("W"), null)));
        solution = new Tree<>(new Node<>("Z", new Node<>("V", new Node<>("W"), null),
                new Node<>("V", new Node<>("W"), null)));
        assertNull(merge(tree1.getRoot(), tree1.getRoot(), null));
        assertEquals(solution, new Tree<>(merge(tree2.getRoot(), tree2.getRoot(), null)));
        //Vereinigungen mit null sind ohne neuen Knoten nicht erlaubt
        assertNull(merge(tree2.getRoot(), null, null));
        assertNull(merge(null, tree2.getRoot(), null));
        //Einzelne Knoten vereinen
        assertEquals(new Node<>("A"), merge(new Node<>("A"), new Node<>("A"), null));
        tree1 = new Tree<>(new Node<>("A", new Node<>("A"), new Node<>("A")));
        assertEquals(tree1, new Tree<>(merge(new Node<>("A"), new Node<>("A"), "A")));
    }

    /**
     * Hier wird die rotate-Funktion mit gewöhnlichen Eingaben getestet.
     */
    @Test
    void rotateTest1()
    {
        //Einfache Rechtsrotation
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), null), null));
        Tree<String> solution = new Tree<>(new Node<>("B", new Node<>("C"), new Node<>("A")));
        assertEquals(solution, new Tree<>(rotate(tree.getRoot(), "A", true)));
        //Einfache Linksrotation
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), new Node<>("E"))
                , new Node<>("D", null, new Node<>("G", null, new Node<>("H")))));
        solution = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), new Node<>("E"))
                , new Node<>("G", new Node<>("D"), new Node<>("H"))));
        assertEquals(solution, new Tree<>(rotate(tree.getRoot(), "D", false)));
        //Schwierige Rechtsrotation
        tree = new Tree<>(new Node<>("D", new Node<>("B", new Node<>("A"), new Node<>("C")),
                new Node<>("F", new Node<>("E"), null)));
        solution = new Tree<>(new Node<>("B", new Node<>("A"), new Node<>("D", new Node<>("C"),
                new Node<>("F", new Node<>("E"), null))));
        assertEquals(solution, new Tree<>(rotate(tree.getRoot(), "D", true)));
        //Schwierige Linksrotation
        tree = new Tree<>(new Node<>("B", new Node<>("A"), new Node<>("D", new Node<>("C"),
                new Node<>("F", new Node<>("E"), null))));
        solution = new Tree<>(new Node<>("D", new Node<>("B", new Node<>("A"), new Node<>("C")),
                new Node<>("F", new Node<>("E"), null)));
        assertEquals(solution, new Tree<>(rotate(tree.getRoot(), "B", false)));

    }

    /**
     * Hier wird die rotate-Funktion mit ungewöhnlichen Eingaben getestet.
     */
    @Test
    void rotateTest2()
    {
        //Ein Element
        assertEquals(new Node<>("A"), rotate(new Node<>("A"), "A", true));
        assertEquals(new Node<>("A"), rotate(new Node<>("A"), "A", false));
        //NULL-Eingaben oder nicht enthalten
        assertNull(rotate(null, "A", true));
        assertNull(rotate(null, "A", false));
        assertEquals(new Node<>("A"), rotate(new Node<>("A"), null, true));
        assertEquals(new Node<>("A"), rotate(new Node<>("A"), null, false));
        assertNull(rotate(null, null, false));
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), null), null));
        assertEquals(tree, new Tree<>(rotate(tree.getRoot(), "P", true)));
        assertEquals(tree, new Tree<>(rotate(tree.getRoot(), "P", false)));
        //Identitätstest
        assertEquals(tree, new Tree<>(rotate(rotate(tree.getRoot(), "A", true), "B", false)));
    }

    /**
     * Hier wird die search-Funktion mit gewöhnlichen Eingaben getestet.
     */
    @Test
    void searchTest1()
    {
        //Die Wurzel wird gesucht
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), null), null));
        assertEquals("A", search(tree.getRoot(), "A").getValue());
        //Innerer Knoten wird gesucht
        tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), new Node<>("E"))
                , new Node<>("D", null, new Node<>("G", null, new Node<>("H")))));
        assertEquals("D", search(tree.getRoot(), "D").getValue());
        //Blatt wird gesucht
        tree = new Tree<>(new Node<>("D", new Node<>("B", new Node<>("A"), new Node<>("C")),
                new Node<>("F", new Node<>("E"), null)));
        assertEquals("E", search(tree.getRoot(), "E").getValue());
    }

    /**
     * Hier wird die search-Funktion mit ungewöhnlichen Eingaben getestet.
     */
    @Test
    void searchTest2()
    {
        //Ein Element
        assertEquals("A", search(new Node<>("A"), "A").getValue());
        //NULL-Eingaben oder nicht enthalten
        assertNull(search(null, "A"));
        Tree<String> tree = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), new Node<>("E"))
                , new Node<>("D", null, new Node<>("G", null, new Node<>("H")))));
        assertNull(search(tree.getRoot(), null));
        assertNull(search(tree.getRoot(), "Z"));
        assertNull(search(null, null));
        //Der Baum darf nicht verändert werden
        Tree<String> tree2 = new Tree<>(new Node<>("A", new Node<>("B", new Node<>("C"), new Node<>("E"))
                , new Node<>("D", null, new Node<>("G", null, new Node<>("H")))));
        assertEquals("C", search(tree.getRoot(), "C").getValue());
        assertEquals(tree2, tree);
    }

    /**
     * Hier wird die searchInSearchTree-Funktion mit gewöhnlichen Eingaben getestet.
     */
    @Test
    void searchSearchTreeTest1()
    {
        //Die Wurzel wird gesucht
        Tree<Integer> tree = new Tree<>(new Node<>(3, new Node<>(2, new Node<>(1), null), null));
        assertEquals(3, searchInSearchTree(tree.getRoot(), 3).getValue());
        //Innerer Knoten wird gesucht
        tree = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4))
                , new Node<>(7, null, new Node<>(9, null, new Node<>(11)))));
        assertEquals(7, searchInSearchTree(tree.getRoot(), 7).getValue());
        //Blatt wird gesucht
        tree = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4)),
                new Node<>(7, new Node<>(6), null)));
        assertEquals(6, searchInSearchTree(tree.getRoot(), 6).getValue());
    }

    /**
     * Hier wird die searchInSearchTree-Funktion mit ungewöhnlichen Eingaben getestet.
     */
    @Test
    void searchInSearchTreeTest2()
    {
        //Ein Element
        assertEquals(1, searchInSearchTree(new Node<>(1), 1).getValue());
        //NULL-Eingaben oder nicht enthalten
        assertNull(searchInSearchTree(null, 2));
        Tree<Integer> tree = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4))
                , new Node<>(7, null, new Node<>(11, null, new Node<>(13)))));
        assertNull(searchInSearchTree(tree.getRoot(), null));
        assertNull(searchInSearchTree(tree.getRoot(), 2));
        assertNull(searchInSearchTree(null, null));
        //Der Baum darf nicht verändert werden
        Tree<Integer> tree2 = new Tree<>(new Node<>(5, new Node<>(3, new Node<>(1), new Node<>(4))
                , new Node<>(7, null, new Node<>(11, null, new Node<>(13)))));
        assertEquals(1, searchInSearchTree(tree.getRoot(), 1).getValue());
        assertEquals(tree2, tree);
    }

    /**
     * Hier wird die UnionFind-Methode mit gewöhnlichen Eingaben getestet
     */
    @Test
    void unionFindTest1()
    {
        //Normaler Pfad
        UnionFindNode<String> tree = new UnionFindNode<>(new UnionFindNode<>(new UnionFindNode<>("A"), "B"), "C");
        assertEquals("A", getUnionRoot(tree));
        //Langer Pfad
        tree = new UnionFindNode<>(new UnionFindNode<>(new UnionFindNode<>(new UnionFindNode<>(new UnionFindNode<>("P"), "H"),
                "A"), "B"), "C");
        assertEquals("P", getUnionRoot(tree));
    }

    /**
     * Hier wird die UnionFind-Methode mit ungewöhnlichen Eingaben getestet
     */
    @Test
    void unionFindTest2()
    {
        //Ein Element
        UnionFindNode<String> tree = new UnionFindNode<>("E");
        assertEquals("E", getUnionRoot(tree));
        //Keine Wurzel
        assertNull(getUnionRoot(null));
    }

    /**
     * Hier wird das Verhalten der maximumDegree-Methode auf gewöhnlichen Eingaben geprüft
     */
    @Test
    void maximumDegreeTest1()
    {
        //Perfekt balancierter variadischer Baum der Ordnung 3
        ArrayList<VariadicTreeNode<String>> CH = new ArrayList<>();
        ArrayList<VariadicTreeNode<String>> CG = new ArrayList<>();
        ArrayList<VariadicTreeNode<String>> CZ = new ArrayList<>();
        VariadicTreeNode<String> LeafA = new VariadicTreeNode<>("A");
        VariadicTreeNode<String> LeafB = new VariadicTreeNode<>("B");
        VariadicTreeNode<String> LeafC = new VariadicTreeNode<>("C");
        VariadicTreeNode<String> LeafD = new VariadicTreeNode<>("D");
        VariadicTreeNode<String> LeafE = new VariadicTreeNode<>("E");
        VariadicTreeNode<String> LeafF = new VariadicTreeNode<>("F");
        CH.add(LeafA);
        CH.add(LeafB);
        CH.add(LeafC);
        CG.add(LeafD);
        CG.add(LeafE);
        CG.add(LeafF);
        CZ.add(new VariadicTreeNode<>("H", CH));
        CZ.add(new VariadicTreeNode<>("G", CG));
        VariadicTreeNode<String> tree = new VariadicTreeNode<>("Z", CZ);
        assertEquals(maximumDegree(tree), 3);

        //Ein großer, unbalancierter variadischer Baum (Der maximale Grad direkt in der Wurzel)
        ArrayList<VariadicTreeNode<String>> C2T = new ArrayList<>();
        C2T.add(new VariadicTreeNode<>("H", CH));
        C2T.add(new VariadicTreeNode<>("H", CH));
        C2T.add(new VariadicTreeNode<>("G", CG));
        C2T.add(new VariadicTreeNode<>("G", CG));
        C2T.add(new VariadicTreeNode<>("R"));
        tree = new VariadicTreeNode<>("T", C2T);
        assertEquals(maximumDegree(tree), 5);

        //Ein großer, unbalancierter variadischer Baum (Der maximale Grad nicht in der Wurzel)
        ArrayList<VariadicTreeNode<String>> C3T = new ArrayList<>();
        C3T.add(new VariadicTreeNode<>("T", C2T));
        tree = new VariadicTreeNode<>("W", C3T);
        assertEquals(maximumDegree(tree), 5);
    }

    /**
     * Hier wird das Verhalten der maximumDegree-Methode auf ungewöhnlichen Eingaben geprüft
     */
    @Test
    void maximumDegreeTest2()
    {
        //NULL als Eingabe
        assertEquals(maximumDegree(null), -1);
        //Nur ein Knoten
        assertEquals(maximumDegree(new VariadicTreeNode<>("D")), 0);
        // Variadischer Baum mit Grad 1
        ArrayList<VariadicTreeNode<String>> child = new ArrayList<>();
        child.add(new VariadicTreeNode<>("D"));
        assertEquals(maximumDegree(new VariadicTreeNode<>("Z", child)), 1);
    }

    /**
     * Hier wird das Verhalten der countVariadicNodes-Methode auf gewöhnlichen Eingaben geprüft
     */
    @Test
    void countVariadicNodesTest1()
    {
        //Perfekt balancierter variadischer Baum der Ordnung 3
        ArrayList<VariadicTreeNode<String>> CH = new ArrayList<>();
        ArrayList<VariadicTreeNode<String>> CG = new ArrayList<>();
        ArrayList<VariadicTreeNode<String>> CZ = new ArrayList<>();
        VariadicTreeNode<String> LeafA = new VariadicTreeNode<>("A");
        VariadicTreeNode<String> LeafB = new VariadicTreeNode<>("B");
        VariadicTreeNode<String> LeafC = new VariadicTreeNode<>("C");
        VariadicTreeNode<String> LeafD = new VariadicTreeNode<>("D");
        VariadicTreeNode<String> LeafE = new VariadicTreeNode<>("E");
        VariadicTreeNode<String> LeafF = new VariadicTreeNode<>("F");
        CH.add(LeafA);
        CH.add(LeafB);
        CH.add(LeafC);
        CG.add(LeafD);
        CG.add(LeafE);
        CG.add(LeafF);
        CZ.add(new VariadicTreeNode<>("H", CH));
        CZ.add(new VariadicTreeNode<>("G", CG));
        VariadicTreeNode<String> tree = new VariadicTreeNode<>("Z", CZ);
        assertEquals(9, countVariadicNodes(tree));

        //Ein großer, unbalancierter variadischer Baum mit Duplikaten und einem großen Verzweigungsgrad in der Wurzel
        ArrayList<VariadicTreeNode<String>> C2T = new ArrayList<>();
        C2T.add(new VariadicTreeNode<>("H", CH));
        C2T.add(new VariadicTreeNode<>("H", CH));
        C2T.add(new VariadicTreeNode<>("G", CG));
        C2T.add(new VariadicTreeNode<>("G", CG));
        C2T.add(new VariadicTreeNode<>("R"));
        tree = new VariadicTreeNode<>("T", C2T);
        assertEquals(18, countVariadicNodes(tree));

        //Ein großer, unbalancierter variadischer Baum mit einem Wurzelknoten des Grades 1
        ArrayList<VariadicTreeNode<String>> C3T = new ArrayList<>();
        C3T.add(new VariadicTreeNode<>("T", C2T));
        tree = new VariadicTreeNode<>("W", C3T);
        assertEquals(19, countVariadicNodes(tree));
    }

    /**
     * Hier wird das Verhalten der countVariadicNodes-Methode auf ungewöhnlichen Eingaben geprüft
     */
    @Test
    void countVariadicNodesTest2()
    {
        //NULL als Eingabe
        assertEquals(-1, countVariadicNodes(null));
        //Nur ein Knoten
        assertEquals(1, countVariadicNodes(new VariadicTreeNode<>("D")));
        // Variadischer Baum mit Grad 1
        ArrayList<VariadicTreeNode<String>> child = new ArrayList<>();
        child.add(new VariadicTreeNode<>("D"));
        assertEquals(2, countVariadicNodes(new VariadicTreeNode<>("Z", child)));
    }

    /**
     * Hier wird das Verhalten der sumNodes-Methode auf gewöhnlichen Eingaben geprüft
     */
    @Test
    void sumNodesTest1() {
        //Ein kleiner balancierter Baum
        Tree<Integer> tree = new Tree<>(new Node<>(1, new Node<>(5), new Node<>(8)));
        assertEquals(14, (sumNodes(tree.getRoot())));
        //Ein größerer balancierter Baum mit DoubleWerten
        Tree<Double> tree2  = new Tree<>(new Node<>(4.8, new Node<>(6.2, new Node<>(8.5), new Node<>(15.5)),
                new Node<>(7.1, new Node<>(35.9), new Node<>(42.0))));
        assertEquals(120, sumNodes(tree2.getRoot()));
        //Ein unbalancierter Baum
        tree = new Tree<>(new Node<>(5, new Node<>(6, new Node<>(9), new Node<>(15)),
                new Node<>(7, new Node<>(36), new Node<>(42, new Node<>(8, new Node<>(20, null, new Node<>(30)), null), null))));
        assertEquals(178, sumNodes(tree.getRoot()));
        //Negative Werte enthalten
        tree = new Tree<>(new Node<>(-5, new Node<>(6, new Node<>(-9), new Node<>(15)),
                new Node<>(7, new Node<>(36), new Node<>(42))));
        assertEquals(92, sumNodes(tree.getRoot()));
        //Eine LinkedList als Eingabe
        Tree<Float> tree3 = new Tree<>(new Node<>((float)5.25, new Node<>((float)5.75, new Node<>((float)7.01, new Node<>((float)7.99), null), null), null));
        assertEquals(26, sumNodes(tree3.getRoot()));
    }

    /**
     * Hier wird das Verhalten der sumNodes-Methode auf ungewöhnlichen Eingaben geprüft
     */
    @Test
    void sumNodesTest2() {
        //Testet, wenn es nur die Wurzel gibt, in der nur ein Wert steht
        Tree<Integer> tree = new Tree<>(new Node<>(1));
        assertEquals(1, sumNodes(tree.getRoot()));
    }

    /**
     * Hier wird das Verhalten der sumNodes-Methode in Fehlerfällen
     */
    @Test
    void sumNodesTest3_Fehlerfall() {
        //Testet, dass -1 wiedergegeben werden soll, wenn der Baum nicht übergeben wird
        assertEquals(-1, sumNodes(null));
    }

    /**
     * Testet verschiedene Fälle des Nim-Spiels.
     */
    @Test
    void nimNegaMaxTest()
    {
        // Nimm alle verfügbaren Hölzer.
        assertArrayEquals(new int[] {1, 1}, TreeOperations.nimNegaMax(1));
        assertArrayEquals(new int[] {2, 1}, TreeOperations.nimNegaMax(2));
        assertArrayEquals(new int[] {3, 1}, TreeOperations.nimNegaMax(3));

        // Bei vier Hölzern kann nicht gewonnen werden, egal welcher Zug.
        assertEquals(-1, TreeOperations.nimNegaMax(4)[1]);

        // Sorge dafür, dass die Gegenspieler:in noch vier Hölzer hat, sodass sie
        // nicht gewinnen kann.
        assertArrayEquals(new int[] {1, 1}, TreeOperations.nimNegaMax(5));
        assertArrayEquals(new int[] {2, 1}, TreeOperations.nimNegaMax(6));
        assertArrayEquals(new int[] {3, 1}, TreeOperations.nimNegaMax(7));
    }
}
