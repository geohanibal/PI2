package de;

/**
 * Eine Klasse, die einen Baum repräsentiert
 * (Bitte keine Änderungen vornehmen !)
 * <p>
 * This class represents are binary tree
 * (Please don't change anything in this file !)
 * @param <E> Der Typ der Elemente
 * <p>
 *           The type of the elements in the nodes
 * @author Pascal Himmelmann und Thomas Röfer
 */
public class Tree<E>
{
    /**
     * Die Wurzel des Baums
     */
    final private Node<E> root;

    /**
     * Konstruktor für einen neuen Baum
     * @param root Die Wurzel des Baums
     */
    public Tree(final Node<E> root)
    {
        this.root = root;
    }

    /**
     * Gibt die aktuelle Wurzel des Baums zurück
     * @return Die Wurzel des Baums
     */
    public Node<E> getRoot()
    {
        return root;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        else if (!(o instanceof Tree)) {
            return false;
        }

        return getRoot() != null && getRoot().equals(((Tree<?>) o).getRoot());
    }

    /*@Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }*/
    /**
     * Liefert eine mehrzeilige Darstellung des Baums.
     * @return Ein mehrzeiliger String mit den Knoten des Baums.
     */
    @Override
    public String toString()
    {
        return "\n" + toString(root, "", "");
    }

    /**
     * Erzeugt eine mehrzeilige Darstellung eines Knotens und seiner Kinder.
     * @param node Der Knoten.
     * @param horizontal Die horizontale Kante, die vor dem Knoten stehen soll.
     * @param vertical Die vertikale Kante, die vor allen Kindknoten stehen soll.
     * @return Ein mehrzeiliger String mit den Knoten des Teilbaums.
     */
    private String toString(final Node<E> node, final String horizontal, final String vertical)
    {
        return horizontal
                + (node == null
                ? "[]"
                : node + "\n"
                + toString(node.getRightChild(), vertical + "├── ", vertical + "│   ") + "\n"
                + toString(node.getLeftChild(), vertical + "└── ", vertical + "    "));
    }
}
