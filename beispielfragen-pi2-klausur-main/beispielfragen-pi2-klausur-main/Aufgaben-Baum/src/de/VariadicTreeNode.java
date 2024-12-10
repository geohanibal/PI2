package de;

import java.util.ArrayList;

/**
 * Diese Klasse stellt den Knoten eines variadischen Baums beliebiger Ordnung dar
 * (Bitte keine Änderungen vornehmen !)
 * <p>
 * This class represents a node of a variadic tree of any order
 * (Please don't change anything in this file !)
 * @param <E> Der Typ der Elemente
 * <p>
 *           Type of the elements in the nodes
 * @author Pascal Himmelmann
 */
public class VariadicTreeNode<E>
{
    /** Der im Knoten gespeicherte Wert. */
    private final E value;

    /** Die Liste der Nachfolgeknoten. */
    private final ArrayList<VariadicTreeNode<E>> children;

    /**
     * Konstruktor für ein Blatt.
     * @param value Der im Knoten gespeicherte Wert.
     */
    public VariadicTreeNode(final E value)
    {
        this(value, new ArrayList<>());
    }

    /**
     * Konstruktor für einen Knoten.
     * @param value Der im Knoten gespeicherte Wert.
     * @param children Die Liste der Nachfolgeknoten
     */
    public VariadicTreeNode(final E value, final ArrayList<VariadicTreeNode<E>> children)
    {
        this.value = value;
        this.children = children;
    }

    /**
     * Liefert die im Knoten gespeicherte Information.
     * @return Der im Knoten gespeicherte Wert.
     */
    public E getValue()
    {
        return value;
    }

    /**
     * Gibt die Liste aller Kindknoten des Knotens aus
     * @return Die Liste aller Kinder dieses Knotens
     */
    public ArrayList<VariadicTreeNode<E>> getChildren()
    {
        return children;
    }

    /**
     * Fügt dem Knoten ein Kind hinzu
     * @param child Der Kindknoten, der angehangen werden soll
     */
    public void addChild(final VariadicTreeNode<E> child)
    {
        children.add(child);
    }

    /**
     * Entfernt einen Knoten aus der Liste der Kindknoten dieses Knotens
     * @param child Der zu entfernende Knoten
     */
    public void removeChild(final VariadicTreeNode<E> child)
    {
        children.remove(child);
    }

    /**
     * Vergleicht dieses Objekt mit einem anderen Objekt
     * @param o Das andere Objekt
     * @return True bei Gleichheit, sonst False
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (!(o instanceof VariadicTreeNode)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        VariadicTreeNode<E> other = (VariadicTreeNode<E>) o;
        return value != null && value.equals(other.getValue()) &&
                children.equals(other.getChildren());
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", Children("+value+") =" + children.toString() + "\n" +
                '}';
    }
}