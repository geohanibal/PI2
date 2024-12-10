package de;

import org.junit.jupiter.api.Test;

import static de.GraphOperations.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Hier folgen einige Tests zu den Graphoperationen
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * Here you find some tests for the exercises provided in GraphOperations.
 * (Please don't change anything in this file)
 * @author Pascal Himmelmann
 */
class GraphOperationsTest
{
    /**
     * Hier wird die Funktionsweise der countReachableNodes-Funktion bei normalen Eingaben geprüft.
     */
    @Test
    void reachableTest1()
    {
        //Ein einfacher Graph, in dem jeder Knoten erreichbar ist
        int[][] graph = {
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
        };
        assertEquals(11, countReachableNodes(graph, 0));
        //Ein nicht zusammenhängender Graph mit 2 Zusammenhangskomponenten
        graph = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
        };
        assertEquals(5, countReachableNodes(graph, 2));
        assertEquals(6, countReachableNodes(graph, 1));
    }

    /**
     * Hier wird die Funktionsweise der countReachableNodes-Funktion bei ungewöhnlichen Eingaben geprüft.
     */
    @Test
    void reachableTest2()
    {
        //Ein Graph ohne Kanten
        int[][] graph = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        for (int i = 0;i < 11;i++)assertEquals(1, countReachableNodes(graph, i));
        //Ein 3-Clique
        graph = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        for (int i = 0;i < 3;i++)assertEquals(3, countReachableNodes(graph, i));
        //Knoten, der nicht existieren
        graph = new int[][]{
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
        };
        assertEquals(0, countReachableNodes(graph, 11));
        assertEquals(0, countReachableNodes(graph, -1));
    }

    /**
     * Hier wird die Funktionsweise der countReachableNodes-Funktion bei ungültigen Graphen
     */
    @Test
    void reachableTest3_Optional()
    {
        //Inkorrekter Graph
        int[][] graph = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1}
        };
        assertEquals(0, countReachableNodes(graph, 11));
        graph = new int[][]{
                {0, 1},
                {1, 0},
                {1, 0}
        };
        assertEquals(0, countReachableNodes(graph, 11));
        assertEquals(0, countReachableNodes(null, 11));
        assertEquals(0, countReachableNodes(new int[][]{}, 0));
    }

    /**
     * Hier wird die Funktionsweise der countEdges-Funktion bei normalen Eingaben geprüft.
     */
    @Test
    void countEdgesTest1()
    {
        //Ein einfacher Graph, in dem jeder Knoten mindestens eine Kante besitzt, ist
        int[][] graph = {
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
        };
        assertEquals(15, countEdges(graph));
        //Ein nicht zusammenhängender Graph mit 2 Zusammenhangskomponenten
        graph = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
        };
        assertEquals(12, countEdges(graph));
    }

    /**
     * Hier wird die Funktionsweise der countEdges-Funktion bei ungewöhnlichen Eingaben geprüft.
     */
    @Test
    void countEdgesTest2()
    {
        //Ein Graph ohne Kanten
        int[][] graph = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, countEdges(graph));
        //Eine 3-Clique
        graph = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        assertEquals(3, countEdges(graph));
        //Graph mit isolierten Knoten
        graph = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertEquals(2, countEdges(graph));
    }

    /**
     * Hier wird die Funktionsweise der countEdges-Funktion bei ungültigen Graphen
     */
    @Test
    void countEdgesTest3_Optional()
    {
        //Inkorrekter Graph
        int[][] graph = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1}
        };
        assertEquals(0, countEdges(graph));
        graph = new int[][]{
                {0, 1},
                {1, 0},
                {1, 0}
        };
        assertEquals(0, countEdges(graph));
        assertEquals(0, countEdges(null));
        assertEquals(0, countEdges(new int[][]{}));
    }

    /**
     * Hier wird die Funktionsweise der containsCircle-Funktion bei normalen Eingaben geprüft.
     */
    @Test
    void circleTest1()
    {
        //Ein Graph mit einem Kreis
        int[][] graph = {
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        assertTrue(containsCircle(graph));
        //Ein Graph ohne Kreise
        graph = new int[][]{
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertFalse(containsCircle(graph));
        //Ein Graph mit mehreren Kreisen
        graph = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 0},
        };
        assertTrue(containsCircle(graph));
        //Vollständiger Verbindungsgraph (4-Clique)
        graph = new int[][]{
                {0, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 0},
        };
        assertTrue(containsCircle(graph));
    }

    /**
     * Hier wird die Funktionsweise der containsCircle-Funktion bei ungewöhnlichen Eingaben geprüft.
     */
    @Test
    void circleTest2()
    {
        //Ein Graph mit nur einem Knoten
        int[][] graph = {
                {0}
        };
        assertFalse(containsCircle(graph));
        //Ein Graph mit mehreren isolierten Knoten ohne Kanten
        graph = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        assertFalse(containsCircle(graph));
        //Ein Graph, der ausschließlich aus einem einzigen Kreis besteht
        graph = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        assertTrue(containsCircle(graph));
    }

    /**
     * Hier wird die Funktionsweise der containsCircle-Funktion bei ungültigen Graphen
     */
    @Test
    void circleTest3_Optional()
    {
        //Inkorrekter Graph
        int[][] graph = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1}
        };
        assertFalse(containsCircle(graph));
        graph = new int[][]{
                {0, 1},
                {1, 0},
                {1, 0}
        };
        assertFalse(containsCircle(graph));
        assertFalse(containsCircle(null));
        assertFalse(containsCircle(new int[][]{}));
    }

    /**
     * Hier wird die Funktionsweise der shortestPath-Funktion bei normalen Eingaben geprüft.
     */
    @Test
    void shortestTest1()
    {
        //Ein einfacher Graph
        int[][] graph = {
                {0, 1, 2, -1, -1},
                {-1, 0, -1, 2, -1},
                {-1, -1, 0, 1, -1},
                {-1, -1, -1, 0, 5},
                {-1, -1, -1, -1, -1}
        };
        //Einfache Pfade
        assertEquals(8, shortestPath(graph, 0, 4));
        assertEquals(7, shortestPath(graph, 1 , 4));
        assertEquals(1, shortestPath(graph, 2 , 3));
        //Ein Graph mit Kreisen
        graph = new int[][]{
                {0, 2, -1, -1, 8, -1},
                {-1, 0, 2, 4, -1, -1},
                {-1, -1, 0, 1, -1, -1},
                {-1, -1, 1, 0, 6, -1},
                {8, -1, -1, -1, 0, 2},
                {1, -1, -1, -1, -1, 0}
        };
        //Einfache Pfade
        assertEquals(5, shortestPath(graph, 0, 3));
        assertEquals(12, shortestPath(graph, 2 , 1));
        assertEquals(1, shortestPath(graph, 3 , 2));
    }

    /**
     * Hier wird die Funktionsweise der shortestPath-Funktion bei ungewöhnlichen Eingaben geprüft.
     */
    @Test
    void shortestTest2()
    {
        //Ein Graph mit isolierten Knoten
        int[][] graph = {
                {0, 1, 3, -1, -1},
                {1, 0, 2, -1, -1},
                {3, 2, 0, -1, -1},
                {-1, -1, -1, 0, 1},
                {-1, -1, -1, 1, 0}
        };
        //Weg zu sich selbst
        assertEquals(0, shortestPath(graph, 1, 1));
        assertEquals(0, shortestPath(graph, 4, 4));
        //Weg existiert nicht
        assertEquals(-1, shortestPath(graph, 1, 4));
        assertEquals(-1, shortestPath(graph, 3, 2));
        // Nicht existierender Knoten
        assertEquals(-1, shortestPath(graph, 1, 6));
        assertEquals(-1, shortestPath(graph, 4, 5));
    }

    /**
     * Hier wird die Funktionsweise der shortestPath-Funktion bei ungültigen Graphen
     */
    @Test
    void shortestTest3_Optional()
    {
        //Inkorrekter Graph
        int[][] graph = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1}
        };
        assertEquals(shortestPath(graph, 1, 1), -1);
        graph = new int[][]{
                {0, 1},
                {1, 0},
                {1, 0}
        };
        assertEquals(shortestPath(graph, 0, 1), -1);
        assertEquals(shortestPath(null, 0, 0), -1);
        assertEquals(shortestPath(new int[][]{}, 1, 1), -1);
    }

    /**
     * Erfolgreiches Einfärben eines Graphen mit drei Farben.
     */
    @Test
    void colorizeNodesTest1()
    {
        // 0-----1     1-----2
        //  \   /|      \   /|
        //   \ / |       \ / |
        //    2  |  →     3  |
        //   / \ |       / \ |
        //  /   \|      /   \|
        // 3-----4     2-----1
        int[][] graph = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 1},
                {0, 0, 1, 0, 1},
                {0, 1, 1, 1, 0}
        };
        assertArrayEquals(new int[] {1, 2, 3, 2, 1}, colorizeNodes(graph, 3));
    }

    /**
     * Unmögliches Einfärben desselben Graphen mit zwei Farben.
     */
    @Test
    void colorizeNodesTest2()
    {
        int[][] graph = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 1},
                {0, 0, 1, 0, 1},
                {0, 1, 1, 1, 0}
        };
        assertNull(colorizeNodes(graph, 2));
    }
}
