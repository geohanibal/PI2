package alteKlausur;


/**
 * Ein einfacher Knoten für eine einfach verkettete Liste.
 * @param <E> Der Typ des Werts, der im Knoten gespeichert wird.
 */
class Elem<E> {
    private E value;
    private Elem<E> next;

    public Elem(E value) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Elem<E> getNext() {
        return next;
    }

    public void setNext(Elem<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value + (next != null ? " -> " + next.toString() : "");
    }
}