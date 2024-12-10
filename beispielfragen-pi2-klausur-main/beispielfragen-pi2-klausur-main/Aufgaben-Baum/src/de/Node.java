package de;


/**
 * Der Knoten eines Binärbaums
 * (Bitte keine Änderungen vornehmen !)
 * <p>
 * The node of a binary tree
 * (Please don't change anything in ths file !)
 * @param <E> Der Typ des Werts, der im Knoten gespeichert werden kann.
 * <p>
 *           The type of the elements in the nodes
 * @author Pascal Himmelmann
 */
public class Node<E>
{
    /** Der im Knoten gespeicherte Wert. */
    private final E value;

    /** Der linke Nachfolgeknoten. Ist null, wenn es keinen gibt. */
    private Node<E> leftChild;

    /** Der rechte Nachfolgeknoten. Ist null, wenn es keinen gibt. */
    private Node<E> rightChild;

    /**
     * Konstruktor für ein Blatt.
     * @param value Der im Knoten gespeicherte Wert.
     */
    public Node(final E value)
    {
        this(value, null, null);
    }

    /**
     * Konstruktor für einen Knoten.
     * @param value Der im Knoten gespeicherte Wert.
     * @param leftChild Der linke Nachfolgeknoten
     * @param rightChild Der rechte Nachfolgeknoten
     */
    public Node(final E value, final Node<E> leftChild, final Node<E> rightChild)
    {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
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
     * Gibt den linken Nachfolgeknoten aus
     * @return Der linke Nachfolgeknoten
     */
   public Node<E> getLeftChild()
   {
       return leftChild;
   }

    /**
     * Gibt den rechten Nachfolgeknoten aus
     * @return Der rechte Nachfolgeknoten
     */
    public Node<E> getRightChild()
    {
        return rightChild;
    }

    /**
     * Setzt den linken Nachfolgeknoten der Liste.
     * @param leftChild Der linke Nachfolgeknoten der Liste oder null, falls es keinen gibt
     */
   public void setLeftChild(Node<E> leftChild)
   {
       this.leftChild = leftChild;
   }

    /**
     * Setzt den rechten Nachfolgeknoten der Liste.
     * @param rightChild Der rechte Nachfolgeknoten der Liste oder null, falls es keinen gibt
     */
    public void setRightChild(Node<E> rightChild)
    {
        this.rightChild = rightChild;
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
        if (!(o instanceof Node)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        Node<E> other = (Node<E>) o;
        return value != null && value.equals(other.getValue()) &&
                compareNode(other.getLeftChild(), leftChild) &&
                compareNode(other.getRightChild(), rightChild);
    }

    /**
     * Diese Methode vergleicht 2 Knoten miteinander
     * @param first Der erste Knoten
     * @param second Der zweite Knoten
     * @return True bei Gleichheit, sonst False
     */
    private boolean compareNode(Node<E> first, Node<E> second)
    {
        return (first == null && second == null) ||
                (first != null && first.equals(second)) ||
                (second != null && second.equals(first));
    }

    /*@Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild("+value+") =" + leftChild + "\n" +
                ", rightChild("+value+") =" + rightChild +
                '}';
    }*/

    @Override
    public String toString() {
        return value.toString();
    }
}
