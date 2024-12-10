package de;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Eine Klasse, die einen Iterator für die Nodes einer SingleLinkedList bereitstellt
 * (Hier bitte keine Änderungen vornehmen !)
 * <p>
 * This class provides an iterator for my nodes in the SingleLinkedList
 * (Please don't change anything here !)
 * @param <E> Der Typ der Elemente
 * @author Pascal Himmelmann
 */
public class SLL<E> implements Iterable<E>
{
    /**
     * Der Kopf der Liste
     */
    final private Node<E> head;

    /**
     * Erzeugt eine neue SingleLinkedList
     * @param head Der Kopf der Liste
     */
    public SLL(final Node<E> head)
    {
        this.head = head;
    }

    /**
     * Gibt den aktuellen Kopf der Liste zurück
     * @return Der Kopf der Liste
     */
    public Node<E> getHead()
    {
        return head;
    }

    /**
     * Ein Iterator für die SLL-Klasse
     * @return Ein Iterator für die SLL-Klasse
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            Node<E> pos = head;

            /**
             * Überprüft, ob ein weiteres Element vorhanden ist
             * @return True falls ja, sonst nein
             */
            @Override
            public boolean hasNext() {
                return pos != null;
            }

            /**
             * Gibt das nächste Element aus, falls vorhanden
             * @return Das nächste Element, falls vorhanden
             */
            @Override
            public E next() {
                if(hasNext())
                {
                    final E value = pos.getValue();
                    pos = pos.getNext();
                    return value;
                }
                throw new NoSuchElementException("No more nodes are in the list");
            }
        };
    }
}
