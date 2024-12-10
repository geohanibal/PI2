package de;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Hier folgen einige Beispielaufgaben zu Graphoperationen
 * -Hinweis-
 * grundsätzlich sind bei allen Aufgaben KEINE Hilfsmittel erlaubt, die importiert werden müssten.
 * Ausnahmen dazu werde ich in der jeweiligen Aufgabenstellung aufzählen, wenn die betreffenden Aufgaben ohne diese
 * Hilfsmittel nur sehr umständlich zu lösen sind.
 * Eine Ausnahme von dieser Regel stellt hier die Bibliothek Math dar (insbesondere Math.min und Math.max).
 * Die Verwendung beider Methoden sei hier grundsätzlich erlaubt, wenn ihr es für sinnvoll erachtet.
 * Außerdem ist hier in allen Aufgaben die Verwendung geeigneter Datenstrukturen sinnvoll um effizient arbeiten zu
 * können, die Verwendung einer ArrayList ist daher ebenfalls immer erlaubt.
 * -Hinweis2-
 * in allen Aufgaben müssen die Graphen zu Beginn auf Gültigkeit geprüft werden, was grundsätzlich nicht leicht ist und
 * daher für euch hier optional ist. Entsprechende Testfälle sind markiert.
 * -Hinweis3-
 * in allen Aufgaben empfehle ich hier die Verwendung von Hilfsmethoden
 * <p>
 * Here you will find some exercises dealing with the topic of graphs.
 * -Attention-,
 * In all those exercises which you will find here only some libraries are allowed to use. Anything else must not
 * be imported.
 * - You are allowed to use all functions from the Math-library (You will most likely need Math.min and Math.max).
 * - You can use all data structure introduced in the lecture (Especially ArrayList will be very helpful)
 * -Attention2-,
 * In all exercises you usually have to perform some kind of test that the provided graphs are actually correct graphs
 * according to the definitions from the lecture. As this is not so easy I will make this an optional task for you and
 * all test cases regarding this checks will be marked as such.
 * -Attention3-,
 * In all exercises it may be helpful to use one or more additional functions to solve them.
 * @author Pascal Himmelmann
 */
public class GraphOperations
{
    /**
     * Hier soll die Anzahl der Knoten gezählt werden, die von einem übergebenen Knoten aus erreichbar sind in
     * beliebig vielen Schritten. Also alle Knoten, zu denen vom übergebenen Knoten aus ein Weg existiert.
     * Kein Knoten darf doppelt gezählt werden und der Startknoten selbst zählt als von sich selbst aus erreichbar.
     * <p>
     * Here you should count the amount of nodes which could be reached in any number of steps from a specific node in
     * a graph i.e. the number of nodes which are connected to a specific node by a path.
     * Don't count nodes twice if they can be reached on different paths. Also note that a node is always reachable
     * by itself.
     * @param graph Der übergebene ungerichtete Graph als Adjazenzmatrix. Die Knoten werden hier einfach mittels der Indizes
     *              in der Matrix identifiziert und besitzen somit keinen speziellen Namen.
     * <p>
     *              An undirected graph encoded as adjacency matrix. Nodes are represented by their indices and hence have no names.
     * @param node Der Knoten, von dem aus die Suche gestartet werden soll.
     * <p>
     *             The node from which the search should start.
     * @return Die Anzahl der Knoten, die von node aus erreichbar sind oder 0, falls node nicht in dem Graph existiert
     *          oder ein ungültiger Graph übergeben wurde.
     * <p>
     *          The amount of nodes reachable from the given node or 0 if the node is not part of the given graph or the
     *          graph itself is not valid.
     */
   public static int countReachableNodes(int[][] graph, int node)
   {
        return 0;
   }

    /**
     * Hier soll die Anzahl der in einem Graphen vorhandenen Kanten gezählt werden.
     * Keine Kante darf doppelt gezählt werden.
     * <p>
     * Here you should count the amount of edges existing in a given graph. No edge should be counted twice
     * @param graph Der übergebene ungerichtete Graph als Adjazenzmatrix. Die Knoten werden hier einfach mittels der Indizes
     *                    in der Matrix identifiziert und besitzen somit keinen speziellen Namen.
     * <p>
     *              An undirected graph encoded as adjacency matrix. Nodes are represented by their indices and hence have no names.
     * @return Die Anzahl der Kanten in einem Graph oder 0, falls der Graph ungültig ist.
     * <p>
     *          The amount of edges existing in the given graph or 0 if the input was no valid graph
     */
    public static int countEdges(int[][] graph)
    {
        return 0;
    }

    /**
     * Hier soll der übergebene gerichtete Graph dahingehend überprüft werden, ob er Kreise enthält. Ein Kreis sei
     * hierbei definiert als ein Pfad von einem beliebigen Knoten zu sich selbst, der mindestens die Länge 1 besitzt.
     * <p>
     * Here you should check if there are loops existing in a given directed graph. We define a loop as a path with
     * minimal length of 1 starting and ending at the same node.
     * @param graph Der übergebene gerichtete Graph als Adjazenzmatrix. Die Knoten werden hier einfach mittels der Indizes
     *                         in der Matrix identifiziert und besitzen somit keinen speziellen Namen.
     * <p>
     *              A directed graph encoded as adjacency matrix. Nodes are represented by their indices and hence have no names.
     * @return True, falls der Graph mindestens einen Kreis enthält, sonst False.
     *          Inkorrekte Graphen als Eingabe führen zur Rückgabe False
     * <p>
     *          True if the graph contains loops and false if not. Inputs which are no valid graphs will lead to the
     *          output to be false.
     */
    public static boolean containsCircle(int[][] graph)
    {
        return false;
    }

    /**
     * Hier soll der kürzeste Weg von einem Startknoten zu einem Zielknoten in einem übergebenen gerichteten Graph
     * gefunden werden und dessen komplette Länge zurückgegeben werden.
     * <p>
     * Here you should find the shortest path from a starting node to another given node inside a directed graph.
     * @param graph Der übergebene gerichtete Graph als Adjazenzmatrix. Die Knoten werden hier einfach mittels der Indizes
     *                      in der Matrix identifiziert und besitzen somit keinen speziellen Namen. Jede Reihe stellt die
     *                      ausgehenden Kanten des Knotens dar, die Kosten entsprechen dem Eintrag. -1 impliziert, dass keine Kante
     *                      existiert. Negative Kosten sind ausgeschlossen.
     *              Beispiel:
     *              [0, -1, 8]
     *              [3, 0, -1]
     *              [-1, 2, -1]
     *              Hier existiert eine Kante von Knoten 1 zu Knoten 3 mit Kosten 8, eine Kante mit Kosten 3 von Knoten
     *              2 zu Knoten 1 und eine Kante von Knoten 3 zu Knoten 2 mit Kosten 2, weitere Kanten existieren nicht.
     *
     * <p>
     *              A directed graph encoded as adjacency matrix. Nodes are represented by their indices and hence have no names.
     *              Each row represents the outgoing edges of the specific node with the number being the cost.
     *              -1 indicates that there exists no edge between these nodes. Negative costs are not possible.
     *              Example:
     *              [0, -1, 8]
     *              [3, 0, -1]
     *              [-1, 2, -1]
     *              Here exists an edge from node 1 to node 3 with cost 8, an edge with cost 3 from edge
     *              2 to edge 1 and an edge from node 3 to node 2 with cost 2, no more edges exist.
     * @param start Der Startknoten
     *              <p>
     *              The starting node
     *
     * @param end Der Zielknoten
     *            <p>
     *            The node to reach
     *
     * @return Die Länge des kürzesten Weges vom Startknoten zum Zielknoten im gegebenen Graph oder -1, falls einer
     *          der Knoten nicht im Graph enthalten ist oder kein Weg existiert.
     *          Inkorrekte Graphen als Eingabe führen ebenfalls zur Rückgabe -1
     * <p>
     *          The length of the shortest path from starting node to end node or -1 if one of the nodes is not part of the
     *          graph or no path exists between them. Inputs which are no valid graphs will also lead to the
     *          output to be -1.
     */
    public static int shortestPath(int[][] graph, int start, int end)
    {
        return 0;
    }

    /**
     * Einfärben der Knoten eines ungerichteten Graphen mit Backtracking. Knoten, zwischen denen eine Kante verläuft, dürfen
     * nicht dieselbe Farbe bekommen.
     * <p>
     *     Colorizing the nodes of a undirected graph with backtracking. Different colors must be assigned to adjacent nodes.
     * @param graph Der übergebene ungerichtete Graph als Adjazenzmatrix. Die Knoten werden hier einfach mittels der Indizes
     *              in der Matrix identifiziert und besitzen somit keinen speziellen Namen.
     * <p>
     *              An undirected graph encoded as adjacency matrix. Nodes are represented by their indices and hence have no names.
     * @param numOfColors Die maximale Anzahl der zu vergebenen Farben.
     * <p>
     *                    The maximum number of colors that can be assigned.
     * @return Die Farben pro Knoten in derselben Reihenfolge wie in der Adjazenzmatrix. Als Farben werden einfach die
     * Zahlen 1 bis (einschließlich) numOfColors verwendet. Kann der Graph mit der zur Verfügung stehenden Anzahl an Farben
     * nicht eingefärbt werden, wird null zurückgegeben.
     * <p>
     *     The colors per nodes in the same order as in the adjacency matrix. Colors are simply represented by the numbers
     *     1 to numOfColors (inclusive). If the graph cannot be colorized with the available number of colors, null is
     *     returned.
     */
    public static int[] colorizeNodes(int[][] graph, int numOfColors)
    {
        return null; // Ersetzen / replace
    }
}
