package de;

/**
 * Aufgabe 3: Zusammenführen zweier bereits sortierter Listen (20 %).
 * 
 * Außer dem Comparable dürfen keine Klassen der Laufzeitbibliothek 
 * verwendet werden.
 */
public class Merge
{
    /**
     * Implementiert das Zusammenführen zweier bereits sortierter, einfach
     * verketteter Listen zu einer neuen, ebenfalls sortierten, verketteten
     * Liste. Die Anzahl der Vergleiche zwischen Objekten der Klasse T
     * darf die gemeinsame Länge der beiden Listen nicht überschreiten.
     * Die Ergebnisliste muss aus denselben Elementen wie die beiden
     * Eingabelisten bestehen.
     * @param <E>   Der Typ der Werte, die in den Listen gespeichert sind.
     * @param head1 Das erste Element der ersten aufsteigend sortierten Liste.
     *              Anders als bei MergeSort üblich, kann es null sein.
     * @param head2 Das erste Element der zweiten aufsteigend sortierten Liste.
     *              Anders als bei MergeSort üblich, kann es null sein.
     * @return      Eine Liste, die alle Elemente der beiden Eingabelisten
     *              enthält und ebenfalls aufsteigend sortiert ist.
     */
    public static <E extends Comparable<E>> Elem<E> merge(Elem<E> head1, Elem<E> head2)
    {
        // Ein Platzhalter-Element für den Anfang der Ergebnisliste.
        // Das Element selbst ist nicht Teil des Ergebnisses.
        final Elem<E> head = new Elem<>(null, null);

        // Das Ende der Ergebnisliste. Hieran kann angehängt werden.
        Elem<E> tail = head;

        // Die Elemente beider Listen zu einer Liste zusammenfügen.
        // Es bietet sich an, hierfür tail zu benutzen.
        head.setNext(head1);
        head.setNext(head2);


        // Hier implementieren




        // Die Ergebnisliste zurückgeben. Der Platzhalter wird übergangen.
        return head.getNext();
    }
}
