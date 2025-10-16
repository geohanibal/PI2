package de;

/**
 * Aufgabe 2: Umdrehen einer einfach verketteten Liste (20 %).
 *
 * Es dürfen keine Klassen der Laufzeitbibliothek verwendet werden.
 */
public class LinkedList
{
    /**
     * Die Methode erzeugt eine einfach verkettete Liste, in der alle Elemente
     * der Eingabeliste in der umgekehrten Reihenfolge stehen.
     * @param first Das erste Element der einfach verketteten Liste. Ist die
     *              Liste leer, ist es null.
     * @return      Das erste Element der Liste, in der alle Elemente in
     *              umgekehrter Reihenfolge stehen. War die Eingabeliste null,
     *              ist auch die Rückgabe null.
     */
    public static <E> Elem<E> reverse(final Elem<E> first)
    {

        if(first == null){
            return  null;
        }
        first.getValue();

        return first.getNext(); // Ersetzen
    }
}
