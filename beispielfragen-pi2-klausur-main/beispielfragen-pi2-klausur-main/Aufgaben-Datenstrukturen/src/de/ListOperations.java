package de;

/**
 * Hier folgen einige Beispielaufgaben zu Listenoperationen
 * (Schwierigere Aufgaben habe ich mit drei Sternen (***) markiert. Diese gehen etwas über den Stoff der
 * Veranstaltung hinaus und richten sich somit in erster Line an Interessierte, die ihr Wissen vertiefen möchten)
 * -Hinweis-
 * grundsätzlich sind bei allen Aufgaben KEINE Hilfsmittel erlaubt, die importiert werden müssten.
 * Ausnahmen dazu werde ich in der jeweiligen Aufgabenstellung aufzählen, wenn die betreffenden Aufgaben ohne diese
 * Hilfsmittel nur sehr umständlich zu lösen sind.
 * <p>
 * Here you will find some exercises to perform on the topic of lists.
 * (More difficult exercises are marked with three stars (***). These are a bit more complex and you need to think about
 * the topics more deeply than covered by the lecture. Hence these exercises are especially designed for people who
 * want to advance their knowledge)
 *-Attention-
 * It is not allowed to import any libraries besides the one mentioned in the text of the exercises.
 *
 * @author Pascal Himmelmann
 */
public class ListOperations
{
    /**
     * Hier soll ein neuer Knoten an das Ende einer LinkedList eingefügt werden
     * <p>
     * Here you should add a new node to the end of a existing LinkedList
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The Head of the list
     * @param value Der Wert, der in die Liste eingefügt werden soll
     * <p>
     *              The value which should be included into the list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           Type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste
     * <p>
     *          The head of the updated list containing the new element
     */
    public static <E> Node<E> insert(Node<E> head, E value)
    {
        return null;
    }

    /**
     * Hier soll ein neuer Knoten hinter einem bestehenden Knoten einer LinkedList eingefügt werden. Sollte der
     * Ankerknoten mehrfach enthalten sein, soll hinter dem ersten Vorkommen eingefügt werden.
     * <p>
     * Here you should add a new node behind an existing node in a specific LinkedList. If the node behind which
     * the new value should be inserted exists multiple times the new value should be inserted behind the first appearance
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The Head of the list
     * @param value Der Wert, der in die Liste eingefügt werden soll
     * <p>
     *              The value which should be included into the list
     * @param anchor Der Wert, hinter den in der Liste eingefügt werden soll. Ist dieser Wert NULL, so soll am Anfang
     *               der Liste eingefügt werden
     *       <p>
     *               The value behind which the new value should be included into the list. The element should
     *               be put at the start of the list if this is NULL
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           Type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste. Sollte der Ankerknoten nicht in der Liste enthalten sein oder
     *          das einzufügende Element ist NULL, soll die Liste unverändert zurückgegeben werden.
     * <p>
     *          The head of the updated list containing the new element. If the anchor is not part of the list or
     *          NULL is used as value to insert, the list should be returned unchanged
     */
    public static <E> Node<E> insertAt(Node<E> head, E value, E anchor)
    {
        return null;
    }

    /**
     * Hier soll eine neue Teilliste in eine LinkedList eingefügt werden (***)
     * <p>
     * Here you should insert a list into another existing LinkedList
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The head of the list
     * @param head2 Der Kopf der einzufügenden Teilliste
     * <p>
     *              The head of the list to be inserted
     * @param anchor Die Stelle, hinter die eingefügt werden soll
     * <p>
     *               The index behind which the list should be inserted
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> insertPart(Node<E> head, Node<E> head2, E anchor)
    {
        return null;
    }

    /**
     * Hier soll ein bestehender Knoten aus einer LinkedList gelöscht werden.
     * Wenn dieser nicht enthalten ist, soll die Liste unverändert bleiben.
     * <p>
     * Here you should delete a specific node in a existing LinkedList.
     * If the node to delete does not exist nothing should be changed.
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The head of the list
     * @param value Der Wert, der aus der Liste gelöscht werden soll
     * <p>
     *              The value to be deleted out of the list
     * @param <E> Der Typ der Listenelemente
     * @return Der Listenkopf der aktualisierten Liste
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> delete(Node<E> head, E value)
    {
        return null;
    }

    /**
     * Hier soll ein bestehender Abschnitt aus einer LinkedList gelöscht werden.(***)
     * Wenn dieser nicht enthalten ist, soll die Liste unverändert bleiben.
     * <p>
     * Here you should delete a whole sublist out of a given LinkedList.
     * If the sublist to delete does not exist in the list, nothing should be changed.
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The head of the existing LinkedList
     * @param head2 Die Teilliste, die aus der Liste gelöscht werden soll
     * <p>
     *              The list that should be deleted.
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           Type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> deletePart(Node<E> head, Node<E> head2)
    {
        return null;
    }

    /**
     * Hier sollen die Positionen von 2 Elementen innerhalb der LinkedList ausgetauscht werden. (***).
     * Ist mindestens eines der Elemente nicht enthalten, ist das Ergebnis die unveränderte Eingabeliste.
     * Der Einfachheit halber darf hier angenommen werden, dass keine Duplikate in der Eingabe enthalten sind.
     * (Hinweis: Hier sollen die Listenknoten ausgetauscht werden, nicht nur der Inhalt !)
     * <p>
     * Here you should change the positions of two nodes inside of a given LinkedList.
     * If at least one of the elements is not existing in the list nothing should be changed.
     * To make things less hard you can assume that the list does not contain duplicates.
     * -Attention-
     * It is not the goal to just swap the contents of the nodes, the positions of the nodes itself should be changed !
     * @param head Der Kopf der bestehenden Liste
     * <p>
     *             The head of the existing list
     * @param value Das erste Element, das getauscht werden soll
     * <p>
     *              The first element which should be swapped
     * @param value2 Das zweite Element, das getauscht werden soll
     * <p>
     *               The second element which should be swapped
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste
     *
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> swap(Node<E> head, E value, E value2)
    {
        return null;
    }

    /**
     * Hier sollen zwei LinkedList konkateniert werden, also hintereinander gehangen werden, sodass eine einzige Liste entsteht
     * <p>
     * Here you should concatenate two lists i.e. put one list at the end of another one so that they become one
     * @param head Der Listenkopf der ersten Liste
     * <p>
     *             The head of the first list
     * @param head2 Der Listenkopf der zweiten Liste
     * <p>
     *              The head of the second list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Der Listenkopf der aktualisierten Liste
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> concatenate(Node<E> head, Node<E> head2)
    {
        return null;
    }

    /**
     * Hier soll der Index eines Elements innerhalb einer LinkedList ermittelt werden
     * <p>
     * Here you should determine the index of an element in a given list
     * @param head Der Listenkopf der Liste
     * <p>
     *             The head of the list
     * @param value Der zu suchende Eintrag in der Liste
     * <p>
     *              The element that should be find in the list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Der Index des gesuchten Elements in der Liste, beginnend bei 0,
     *          oder -1, falls das Element nicht enthalten ist
     * <p>
     *          The index of the element in the list counted from zero or
     *          -1 if the element is not part of the list
     */
    public static <E> int search(Node<E> head, E value)
    {
        return 0;
    }

    /**
     * Hier soll die Anzahl der Vorkommen eines Elements innerhalb einer LinkedList ermittelt werden
     * <p>
     * Here you should determine the number of occurrences of an element in a given list
     * @param head Der Listenkopf der Liste
     * <p>
     *             The head of the list
     * @param value Der zu zählende Eintrag in der Liste
     * <p>
     *              The element that should be counted in the list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Die Anzahl der Vorkommen eines Elementes in der Liste
     * <p>
     *          The number of occurrences of the element in the list
     */
    public static <E> int countOccurrences(Node<E> head, E value)
    {
        return -1;
    }

    /**
     * Hier soll überprüft werden, ob eine LinkedList aufsteigend sortiert ist. Eine leere Liste gilt als sortiert.
     * <p>
     * Here you should determine if a LinkedList is sorted in ascending order. An empty list is considered as sorted.
     * @param head Der Listenkopf der Liste
     * <p>
     *             The head of the list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return True wenn die Liste aufsteigend sortiert ist, sonst False
     * <p>
     *          True if the list is sorted in ascending order, otherwise False
     */
    public static <E extends Comparable<E>> boolean isSorted(Node<E> head)
    {
        return false;
    }

    /**
     * Hier soll die übergebene LinkedList mehrfach dupliziert werden.
     * Entsprechend dem zweiten Parameter wird die Liste hier loop-mal dupliziert.
     * Bei loop == 0 bleibt die Eingabe unverändert, bei negativen Zahlen wird sie gelöscht.
     * <p>
     * Here you should provide an algorithm to duplicate a given LinkedList.
     * The second parameter specifies how many times the first list should be concatenated to itself.
     * If loop == 0 nothing should happen and negative numbers should result in an empty list in this case a null value
     * @param head Der Listenkopf
     * <p>
     *             The head of the list
     * @param loop Gibt an, wie oft dupliziert werden soll
     * <p>
     *             This parameter specifies how many times the list should be duplicated
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of the elements in the list
     * @return Der neue Listenkopf oder null, falls loop negativ war
     * <p>
     *          The head of the updated list or null if loop was negative
     * -Hinweis-,
     * wenn euch diese Aufgabe Probleme bereitet, so versucht es zuerst einmal mit einem konstanten Wert für
     * Loop und versucht dann, euer Vorgehen zu verallgemeinern.
     * Entsprechende Tests, die explizit beliebige, große Werte fordern, sind in den Testfällen markiert und können dann
     * zu Beginn ausgelassen werden.
     * <p>
     * -Attention-,
     * If you got problems solving this exercise you could start by assuming a constant value for loop first ( e.g. 2 )
     * and afterwards generalize your algorithm.
     * I will provide specific tests which need your algorithm to be applicable to every value of loop, but these will
     * be marked in the tests so you could leave them out in the beginning.
     */
    public static <E> Node<E> duplicate(Node<E> head, int loop)
    {
        return null;
    }

    /**
     * Hier soll eine Liste umgekehrt werden, das erste Element wird das letzte, das Zweite das Vorletzte, usw.
     * <p>
     * Here you should reverse a given list i.e. the first element will be the last, the second the second last and so on.
     * @param head Der Kopf der ursprünglichen Liste
     * <p>
     *             The head of the given list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of elements in the list
     * @return Der neue Listenkopf nach der Operation
     *
     * <p>
     *         The head of the updated list containing the new list
     *
     */
    public static <E> Node<E> reverse(Node<E> head)
    {
        return null;
    }

    /**
     * Hier soll die Länge einer Liste ermittelt werden
     * <p>
     * Here you should determine the length of a given list
     * @param head Der Kopf der Liste
     * <p>
     *             The head of the list
     * @param <E> Der Typ der Listenelemente
     * <p>
     *           The type of elements in the list
     * @return Die Länge der Liste
     *<p>
     *          The length of the list
     */
    public static <E> int length(Node<E> head)
    {
        return 0;
    }

    /**
     * Hier sollt ihr eine sortedSet-Klasse implementieren, die einigen Bedingungen genügt. (***).
     * Es soll hier Mengensemantik gelten, also dürfen keinerlei Elemente mehrfach enthalten sein.
     * Zusätzlich sollen die Elemente aufsteigend sortiert sein, sodass also first das kleinste Element
     * des sortedSet ist und für alle Nodes in der Liste gilt, dass sie größer oder gleich ihrem Vorgänger sind.
     * <p>
     * Here you should implement a data structure based on a LinkedList which fulfills some requirements.
     * The structure should behave like a set in maths and should not contain or save duplicates.
     * Further all elements should be sorted in ascending order i.e. for all elements it should hold that they
     * are equal or larger than the element before.
     * @param <E> Der Typ der Elemente. Muss Comparable sinnvoll implementieren.
     * <p>
     *           The type of elements in the list. You can assume this to have implemented a working
     *           Comparable
     */
    public static class SortedSet<E extends Comparable<E>>
    {
        /**
         * Das erste Element im sortedSet
         * <p>
         * The first element in the sortedSet
         */
        final Node<E> first;

        /**
         * Hier sollt ihr den Konstruktor der Klasse so implementieren, dass er eine beliebige LinkedList als
         * Eingabe erhält und diese in ein gültiges SortedSet umwandelt. Der Beginn des SortedSet soll sich zum
         * Schluss in der Variable first befinden. Wenn die Eingabe NULL ist, ist first NULL.
         * <p>
         * Here you should implement a constructor for the sortedSet so a given LinkedList can be converted into a
         * correct sortedSet. The smallest element of the set should be saved in ''first'' later. If NULL is input
         * the sortedSet should also be NULL
         * @param head Der Kopf der Liste.
         * <p>
         *             The head of the list
         * <p>
         * -Hinweis-
         * diese Aufgabe ist ohne Hilfsmittel nur sehr umständlich zu lösen und es bietet sich daher an, hier
         * geeignete Datenstrukturen zu verwenden. Hier sind also alle in der Vorlesung vorgestellten
         * Datenstrukturen als Hilfsmittel zugelassen
         * <p>
         * -Attention-,
         * This exercise can be tricky to solve without help of external libraries. Because of this you are allowed
         * to use any data structure presented in the lecture to help you here.
         */
        public SortedSet(final Node<E> head)
        {
            first = null;
        }

        /**
         * Gibt das erste Element des sortedSet zurück
         * <p>
         * Gives the first element of the sortedSet
         * @return das erste Element im sortedSet
         * <p>
         * First element of the sortedSet
         */
        public Node<E> getFirst()
        {
            return first;
        }
    }
}
