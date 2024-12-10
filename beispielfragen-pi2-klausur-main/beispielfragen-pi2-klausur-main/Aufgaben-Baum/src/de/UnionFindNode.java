package de;

/**
 * Bei dieser Klasse handelt es sich um eine Realisierung eines Knotens einer einfachen UnionFindStruktur
 * (Bitte keine Änderungen vornehmen !)
 * <p>
 * This class represents a node of a union find structure
 * (Please don't change anything in this file !)
 * @param <E> Der Typ der Elemente
 * <p>
 *           Type of the elements in the nodes
 * @author Pascal Himmelmann
 */
public class UnionFindNode<E>
{
    /** Der Elternknoten. */
    private final UnionFindNode<E> parent;

    /** Der Wert im Knoten. */
    private final E value;

    /**
     * Ein Konstruktor um eine Wurzel zu erzeugen, diese zeigt nach Definition auf sich selbst als Wurzel
     * @param value Der Wert der Wurzel
     */
    public UnionFindNode(final E value)
    {
        this.parent = this;
        this.value = value;
    }

    /**
     * Ein Konstruktor zur Erzeugung eines Knotens in der UnionFind-Struktur
     * @param parent Der Elternknoten des Knotens
     * @param value Der Wert des Knotens
     */
    public UnionFindNode(final UnionFindNode<E> parent, final E value)
    {
        this.parent = parent;
        this.value = value;
    }

    /**
     * Gibt den Elternknoten des Knotens zurück
     * @return Der Elternknoten des Knotens
     */
    public UnionFindNode<E> getParent()
    {
        return parent;
    }

    /**
     * Gibt den Wert des Knotens zurück
     * @return Der Wert des Knotens
     */
    public E getValue()
    {
        return value;
    }
}
