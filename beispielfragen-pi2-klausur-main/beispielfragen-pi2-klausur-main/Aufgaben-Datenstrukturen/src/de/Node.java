package de;


/**
 * Der Knoten einer SingleLinkedList
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * This class provides a node for a SingleLinkedList
 * (Please don't change anything !)
 * @param <E> Der Typ des Werts, der im Knoten gespeichert werden kann.
 * <p>
 *           Type of the elements that should be saved
 * @author Pascal Himmelmann
 */
public class Node<E>
{
    /** Der im Knoten gespeicherte Wert. */
    private final E value;

    /** Der Nachfolgeknoten. Ist null, wenn es keinen gibt. */
    private Node<E> next;

    /**
     * Konstruktor für einen Knoten ohne Nachfolger.
     * @param value Der im Knoten gespeicherte Wert.
     */
    public Node(final E value)
    {
        this(value, null);
    }

    /**
     * Konstruktor für einen Knoten.
     * @param value Der im Knoten gespeicherte Wert.
     * @param next Der Nachfolgeknoten
     */
    public Node(final E value, final Node<E> next)
    {
        this.value = value;
        this.next = next;
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
     * Gibt den Nachfolgeknoten aus
     * @return Der Nachfolgeknoten
     */
   public Node<E> getNext()
   {
       return next;
   }

    /**
     * Setzt den Nachfolgeknoten der Liste.
     * @param next Der Nachfolgeknoten der Liste oder null, falls es keinen gibt
     */
   public void setNext(Node<E> next)
   {
       this.next = next;
   }

}
