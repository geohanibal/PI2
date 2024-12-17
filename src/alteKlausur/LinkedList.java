package alteKlausur;

/**
 * Aufgabe 2: Aneinanderhängen zweier einfach verketteter Listen (20 %).
 *
 * Es dürfen keine Klassen der Laufzeitbibliothek verwendet werden.
 */
public class LinkedList {
    /**
     * Die Methode hängt zwei einfach verkettete Listen aneinander.
     * Die beiden Ursprungslisten dürfen sich dabei verändern.
     *
     * @param first  Das erste Element der ersten einfach verketteten Liste.
     *               Ist die Liste leer, ist es null. Diese Liste bildet den
     *               Anfang der Ergebnisliste.
     * @param second Das erste Element der zweiten einfach verketteten Liste.
     *               Ist die Liste leer, ist es null. Diese Liste bildet das
     *               Ende der Ergebnisliste, d.h. sie wird an die andere
     *               Liste angehängt.
     * @return Das erste Element der Verkettung der Listen "first" und
     * "second".
     */
    public static <E> Elem<E> concat(final Elem<E> first, final Elem<E> second) {
        if (first == null) {
            return second;
        } else {
            first.setNext(concat(first.getNext(), second));
            return first;
        }
    }
}