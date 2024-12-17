package alteKlausur;

/**
 * Aufgabe 4: Höhe eines Binärbaums (20 %).
 * 
 * Es dürfen keine Methoden der Laufzeitbibliothek außer "Math.max"
 * verwendet werden.
 */
public class TreeHeight
{
    /**
     * Bestimmt die Höhe eines Binärbaums.
     * @param root Die Wurzel des Baums. Kann null sein.
     * @return Die Höhe des Baums. Dabei zählt null als Knoten.
     */
    public static int treeHeight(final Node root)
    {

        return root == null ? 0 : 1 + Math.max(treeHeight(root.getLeft()), treeHeight(root.getRight()));
    }
}
