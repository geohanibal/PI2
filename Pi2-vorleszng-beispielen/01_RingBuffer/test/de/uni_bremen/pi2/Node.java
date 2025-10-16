package de.uni_bremen.pi2;

public class Node <E>{
    /**De worte geschpeicherte werte*/
    private E info;

    /**Der link Knote*/
    private final Node<E> left;

    /** recht*/
    private final Node<E> right;

    /** Konstruktor für Knoten ohne geschpeicherte Werte*/
    public Node(final E info) {
        this(info,null,null);
    }

    public Node(final E info, final Node<E> left, final Node<E> right){
        this.info = info;
        this.left = left;
        this.right = right;
    }
}
