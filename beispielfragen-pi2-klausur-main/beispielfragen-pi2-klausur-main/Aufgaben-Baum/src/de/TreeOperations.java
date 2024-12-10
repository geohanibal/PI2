package de;

/**
 * Hier folgen einige Beispielaufgaben zu Baumoperationen
 * (Ich werde hier Aufgaben, die über den normalen Vorlesungsstoff hinausgehen und eher der Vertiefung dienen, mit
 * einem (***) versehen)
 * (Aufgaben, die etwas schwieriger sind oder nicht so stark in den Übungen vertieft wurden,
 * markiere ich mit (*+))
 * -Hinweis-
 * grundsätzlich sind bei allen Aufgaben KEINE Hilfsmittel erlaubt, die importiert werden müssten.
 * Ausnahmen dazu werde ich in der jeweiligen Aufgabenstellung aufzählen, wenn die betreffenden Aufgaben ohne diese
 * Hilfsmittel nur sehr umständlich zu lösen sind.
 * Eine Ausnahme von dieser Regel stellt hier die Bibliothek Math dar (insbesondere Math.min und Math.max).
 * Die Verwendung beider Methoden sei hier grundsätzlich erlaubt, wenn ihr es für sinnvoll erachtet.
 * <p>
 * Here you will find some exercises dealing with the topic of trees.
 * (Some exercises need knowledge not explicitly taught in the lecture. They are kind of transfer-exercises and therefore
 * marked as (***)).
 * (Exercises which were part of the lecture but might be a bit difficult to solve are marked as (*+))
 * -Attention-,
 * Except for libraries explicitly mentioned in the exercises you are not allowed to import any library to help you
 * solving those exercises. However, the use of Math-library (especially Math.min and Math.max) are always allowed.
  * @author Pascal Himmelmann
 */
public class TreeOperations
{
    /**
     * Hier soll ein neuer Knoten einem Baum hinzugefügt werden. Er soll stets bevorzugt auf der linken Seite des Knotens
     * angehangen werden. Wenn ein Knoten bereits einen linken Nachfolger hat, aber keinen rechten Nachfolger,
     * soll dort angehangen werden. Wenn ein Knoten bereits 2 Nachfolger hat, soll links abgestiegen werden, um
     * eine Einfügestelle zu finden.
     *<p>
     * Here you should add a new node to an existing tree. It should be added at the left side of the node if possible.
     * If there is already a left child but no right one the node should be added there. If a node has already two
     * children you should look for a place to add the node in the left subtree.
     * @param root Die Wurzel des Baums
     *    <p>
     *             The root-node of the tree
     * @param value Der Wert, der eingefügt werden soll
     *   <p>
     *              The value that should be added
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the tree
     * @return Der veränderte Baum oder der ursprüngliche Baum, falls die Eingabe ungültig war
     * <p>
     *          The updated tree or the unchanged tree if the input was invalid
     */
    public static <E> Node<E> insert(final Node<E> root, final E value)
    {
        return null;
    }

    /**
     * Hier soll ein neuer Knoten einem binären Suchbaum hinzugefügt werden. Hierbei soll die Ordnung erhalten bleiben
     *<p>
     * Here you should add a new node to an existing binary search tree. The order should be preserved.
     * @param root Die Wurzel des Baums
     *    <p>
     *             The root-node of the tree
     * @param value Der Wert, der eingefügt werden soll
     *   <p>
     *              The value that should be added
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the tree
     * @return Der veränderte Baum oder der ursprüngliche Baum, falls die Eingabe ungültig war
     * <p>
     *          The updated tree or the unchanged tree if the input was invalid
     */
    public static <E extends Comparable<E>> Node<E> insertIntoSearchTree(final Node<E> root, final E value)
    {
        return null;
    }

    /**
     * Hier soll ein bestehender Knoten aus einem Baum gelöscht werden. Wenn er nur einen Nachfolger hat,
     * wird er einfach durch seinen Nachfolger ersetzt. Wenn er 2 Nachfolger hat, soll er durch seinen linken Nachfolger
     * ersetzt werden und dieser wird dann an seiner ursprünglichen Position analog zu diesem Vorgehen ebenfalls ersetzt.
     * Sind mehrere Knoten mit diesem Element vorhanden, sollen alle gelöscht werden.
     * <p>
     * Here you should delete an existing node out of a tree. If it has a single child you should replace it by its child.
     * If it has two children it should be replaced by the left one while this one gets deleted at its old position by
     * the same rule. In case of multiple nodes containing the value to be deleted all of them should get deleted as well
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param value Der Wert, der gelöscht werden soll
     *              <p>
     *              The value which should be deleted
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The value of the elements in the tree
     * @return Der veränderte Baum oder der ursprüngliche Baum, falls das Element nicht enthalten war.
     * -Hinweis-
     * in dieser Aufgaben bietet sich die Verwendung einer Hilfsmethode an, um den Löschvorgang vom Suchvorgang
     * zu trennen und den Code somit übersichtlicher zu halten
     * <p>
     *     The updated tree or the unchanged tree if the element was not part of the tree.
     *     -Attention-,
     *     in this exercise it might be helpful to define a second function to separate the search from the
     *     actual delete-process
     */
    public static <E> Node<E> delete(final Node<E> root, final E value)
    {
        return null;
    }

    /**
     * Hier soll gezählt werden, wie viele Blätter in einem Baum enthalten sind. Als Blatt zählen hier NULL-Knoten.
     * Die Wurzel kann ebenfalls ein Blatt sein.
     * <p>
     * Here you should count the amount of leaves existing in a given tree. We define a leaf to be a NULL-node.
     * Note that the root could also be a leaf.
     * @param root Die Wurzel des Baums
     *  <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the tree
     * @return Die Anzahl der Blätter innerhalb des Baums
     * <p>
     *          The amount of leaves existing in the tree
     */
    public static <E> int countLeaves(final Node<E> root)
    {
        return 0;
    }

    /**
     * Hier soll gezählt werden, wie viele Knoten in einem Binärbaum enthalten sind.
     * <p>
     * Here you should count the amount of nodes existing in a given tree.
     * @param root Die Wurzel des Baums
     *  <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the tree
     * @return Die Anzahl der Knoten innerhalb des Baums
     * <p>
     *          The amount of nodes existing in the tree
     */
    public static <E> int countNodes(final Node<E> root)
    {
        return 0;
    }

    /**
     * Hier soll die Höhe eines Binärbaums berechnet werden, also die Länge des längsten Pfades von der Wurzel zu
     * einem Blatt.
     * <p>
     * Here you should calculate the height of a tree, which is the length of the longest path from the root to a leaf.
     * @param root Die Wurzel des Baums
     *  <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     * <p>
     *           The type of the elements in the tree
     * @return Die Höhe des Baums
     * <p>
     *          The height of the tree
     */
    public static <E> int getHeight(final Node<E> root)
    {
        return 0;
    }

    /**
     * Hier soll die Länge des Pfads (Anzahl Kanten) von der Wurzel des
     * Baums bis zu einem bestimmten Knoten ermittelt werden.
     * Es darf angenommen werden, dass der Baum keine Duplikate enthält.
     * <p>
     * Here you should calculate the length (In terms of the amount of edges) of a path from the
     * root to a specific node in the tree. We assume the tree to not contain duplicates.
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param value Der gesuchte Knoten
     *              <p>
     *              The node which should be found
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements
     * @return Die Länge des Pfads zu dem Knoten oder -1, falls dieser Knoten nicht enthalten ist
     * -Hinweis-
     * soll der Fehlerfall hier abgefangen werden, bietet sich die Verwendung einer Hilfsmethode sehr an.
     * <p>
     *      The length of the path to the node or -1 in case the node is not part of the tree.
     * -Attention-,
     * if you plan to catch the error case here it is very helpful to use a second method to help you
     *
     */
    public static <E> int getPath(final Node<E> root, final E value)
    {
        return -1;
    }

    /**
     * Hier soll der längste mögliche Pfad (hier definiert als Anzahl der Kanten ohne Beachtung der Richtung) (***)
     * von einem Knoten zu einem anderen Knoten in einem Baum ermittelt werden,
     * wobei keine Kante mehrfach verwendet werden darf.
     * <p>
     * Here you should calculate the length of the longest possible path (again defined as number of edges) from any
     * node to another node in the given tree while ignoring the direction. No edge must be used more than once.
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements in the tree
     * @return Die Länge des längsten Pfades im Baum oder -1, falls die Eingabe leer ist
     * <p>
     *     The length of the longest path in the tree or -1 in case the input is empty.
     */
    public static <E> int longestPath(final Node<E> root)
    {
        return -1;
    }

    /**
     * Hier soll überprüft werden, ob der Baum einem Sortierkriterium genügt.
     * Wenn für jeden Knoten gilt, dass dieser größer oder gleich seinen beiden Kindknoten ist,
     * dann sei der Baum hier sortiert. Außerdem sei ein Baum hier sortiert, wenn für jeden Knoten gilt,
     * dass dieser kleiner oder gleich seinen beiden Kindknoten ist.
     * Leere Bäume oder einzelne Knoten zählen ebenfalls als sortiert.
     * <p>
     * Here you should check whether a given tree fulfills any sort-criteria.
     * We define this to be the case if for every node holds that its value is higher or equal than the values of all
     * its children. Further we define a tree to be sorted if for every node holds that its value is equal or lower than
     * the values of all its children.
     * Note that empty trees or single nodes fulfill this criteria.
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *            The type of the elements in the tree
     * @return True, falls der Baum sortiert ist, andernfalls false
     * <p>
     *          True if the tree is sorted otherwise False
     * -Hinweis-
     * in dieser Aufgabe bietet sich die Verwendung einer oder mehrerer Hilfsmethoden an, da hier sowohl
     * das Vorliegen eines MinHeap als auch das Vorliegen eines MaxHeap zu prüfen ist. Somit sollte der
     * Einfachheit wegen zu Beginn eine entsprechende Differenzierung erfolgen.
     * -Hinweis2-
     * um Verwirrungen vorzubeugen sei hier erwähnt, dass kein Sortierkriterium im Sinne eines Suchbaums
     * zu prüfen ist, sondern das Vorliegen eines MaxHeap beziehungsweise MinHeap.
     * <p>
     * -Attention-,
     * in this exercise it is very helpful to use more than one method because you need to check for the
     * existence of a MinHeap as well as for a MaxHeap. It will be easier to separate these processes.
     * -Attention2-,
     * to avoid confusion I want to clarify that you should not check the sorting-criteria like it is used in a search-tree
     * but rather check for the existence of a MinHeap or MaxHeap.
     */
    public static <E extends Comparable<E>> boolean isSortedTree(final Node<E> root)
    {
        return false;
    }

    /**
     * Hier soll überprüft werden, ob ein Baum balanciert ist.
     * Wenn für jeden Knoten gilt, dass die Höhe des linken Teilbaums sich um höchstens 1 von der Höhe des rechten
     * Teilbaums unterscheidet, sei ein Baum hier als balanciert zu bewerten. Leere Bäume oder einzelne Knoten zählen
     * ebenfalls als balanciert.
     * <p>
     * Here you should check if a tree is balanced.
     * We define a tree to be balanced if for every node holds that the height of the left subtree is at maximum 1
     * node higher than the right subtree. Note that empty trees and single nodes fulfill this criteria.
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements in the tree
     * @return True, falls der Baum balanciert ist, ansonsten False
     * <p>
     *     True if the tree is balanced otherwise False
     * <p>
     * -Hinweis-
     * hier bietet es sich an, eine Hilfsmethode zu verwenden, um die Berechnung der Slopes vorzunehmen.
     * <p>
     * -Attention-,
     * it might be helpful to use a second method to calculate the slopes.
     */
    public static <E> boolean balanced(final Node<E> root)
    {
        return false;
    }

    /**
     * Hier soll die Variabilität der Werte innerhalb des Baums berechnet werden.
     * Hierzu muss der größte Wert innerhalb des Baums sowie der kleinste Wert gefunden werden und ihre Differenz
     * zurückgegeben werden. Ein leerer Baum hat nach Definition die Variabilität -1
     * <p>
     * Here you should calculate the variability of values used in a given tree.
     * To do this you have to find the maximum value as well as the minimum value in the tree and calculate their difference.
     * We define the variability of an empty tree to be -1
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of elements used in the tree
     * @return Die Variabilität des Baums
     * <p>
     *     The variability of the tree
     *     <p>
     * -Hinweis-
     * soll der Fehlerfall hier abgedeckt werden, bietet sich die Verwendung einer Hilfsmethode an.
     * -Hinweis2-
     * achtet hier auf den richtigen Umgang mit den Rechenoperatoren. Würdigt insbesondere, dass alle
     * Klassen, die von Number erben, über eine Methode ''.doubleValue()'' verfügen (Nähere
     * Informationen entnehmt hier gerne der JavaDoc ;)
     * <p>
     * -Attention-,
     * to effectively catch the error case it might be helpful to use a second method.
     * -Attention2-,
     * be careful with which operations can be performed on certain datatypes. Remember also that for all classes
     * which inherit from Number a method called ''.doubleValue()'' can be performed (More information you could find in
     * the JavaDoc ;)
     */
    public static <E extends Number> int variability(final Node<E> root)
    {
        return -1;
    }

    /**
     * Hier sollen 2 verschiedene Binärbäume zu einem neuen Baum vereinigt werden. (*+).
     * Der neue Wurzelknoten soll das übergebene Element als Wert besitzen und beide Bäume als Kindknoten,
     * wobei das erste Argument den linken Kindknoten bestimmt. Das übergebene Element darf NULL sein, in diesem
     * Fall müssen beide Bäume den gleichen Wert im Wurzelknoten gespeichert haben und dürfen jeweils nur einen
     * Nachfolgeknoten besitzen. Dieser Knoten wird in diesem Fall die neue Wurzel. Beachtet hierbei,
     * dass die Node-Klasse lediglich eine Implementierung von Equals besitzt, welche ganze Bäume auf Gleichheit prüft,
     * diese darf nicht verändert werden.
     * <p>
     * Here you should merge two binary trees into a single tree.
     * The root of the new tree should contain the given element if one was given and the children should be the
     * two original trees with the first tree being the left child. If the given element is NULL then both trees must
     * have the same value in their roots and are only allowed to contain a single child each. Their mutual root will
     * then be the new root of the tree and the child of the first tree will be the left child and the child of the right
     * tree the new right child. The Node-class has implemented a equals-method to compare nodes which should not be
     * changed.
     *
     * @param root1 Die Wurzel des ersten Baums
     *              <p>
     *              The root of the first tree
     * @param root2 Die Wurzen des zweiten Baums
     *              <p>
     *              The root of the second tree
     * @param newRoot Der neue Wurzelknoten. Darf NULL sein, wenn die Wurzeln der Bäume im obigen Sinne ''kompatibel'' sind
     *                <p>
     *                The element for the new root. If it is NULL than the trees need to be compatible like described above.
     *
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements of the trees
     * @return Der neue Baum, falls eine Vereinigung möglich war, andernfalls NULL
     * <p>
     *     The new tree if merging was successful otherwise NULL
     *     <p>
     * -Hinweis-
     * in dieser Aufgabe sind sehr viele Sonderfälle zu bedenken. Bei Problemen könnt ihr hier gerne
     * den Fall auslassen, dass ''newRoot=NULL'' übergeben wird.
     * <p>
     * -Attention-,
     * there are a lot of possible special cases in this exercise. If you got problems you could leave our the case that
     * newRoot is NULL
     */
    public static <E> Node<E> merge(final Node<E> root1, final Node<E> root2, final E newRoot)
    {
        return null;
    }

    /**
     * Hier soll ein Knoten innerhalb eines Binärbaums gefunden werden. Wenn ein Knoten enthalten ist, der den
     * gesuchten Wert enthält, dann soll dieser Knoten zurückgegeben werden, andernfalls NULL. Es darf hier der Einfachheit
     * wegen angenommen werden, dass der Baum keine Duplikate enthält.
     * Der Baum darf bei der Suche nicht verändert werden!
     * <p>
     * Here you should find a specific node in a binary tree. If there is a node contained in the tree with the given
     * value you should return that node otherwise NULL. It can be assumed that the tree does not contain duplicates.
     * The tree should not change while searching!
     * @param root Der zu durchsuchende Baum
     *             <p>
     *             The tree in which the value should be found
     * @param value Der zu suchende Wert
     *              <p>
     *              The value to be found
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements in the tree
     * @return Der Knoten, der den gesuchten Wert enthält, oder NULL, falls der Wert im Baum nicht vorkommt
     * <p>
     *     The node containing the given value or NULL if there is no such node.
     */
    public static <E> Node<E> search(final Node<E> root, final E value)
    {
        return null;
    }

    /**
     * Hier soll ein Knoten mittels binärer Suche innerhalb eines binären Suchbaums gefunden werden.
     * Wenn ein Knoten enthalten ist, der den gesuchten Wert enthält, dann soll dieser Knoten zurückgegeben werden,
     * andernfalls NULL. Es darf hier der Einfachheit wegen angenommen werden, dass der Baum keine Duplikate enthält.
     * Der Baum darf bei der Suche nicht verändert werden!
     * <p>
     * Here you should find a specific node in a binary search tree by using binary search algorithm.
     * If there is a node contained in the tree with the given value you should return that node otherwise NULL.
     * It can be assumed that the tree does not contain duplicates. The tree should not change while searching!
     * @param root Der zu durchsuchende binäre Suchbaum. Es kann angenommen werden, dass ein gültiger Suchbaum vorliegt.
     *             Also für jeden Knoten gilt, dass das linke Kind einen kleineren Wert hat und das rechte Kind einen
     *             größeren Wert.
     *             <p>
     *             The search tree in which the value should be found. It can be assumed that the input is a valid
     *             search tree. I.e. it holds for every node that the left child has a smaller value and the right child
     *             has a higher value.
     * @param value Der zu suchende Wert
     *              <p>
     *              The value to be found
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements in the tree
     * @return Der Knoten, der den gesuchten Wert enthält, oder NULL, falls der Wert im Baum nicht vorkommt
     * <p>
     *     The node containing the given value or NULL if there is no such node.
     */
    public static <E extends Comparable<E>> Node<E> searchInSearchTree(final Node<E> root, final E value)
    {
        return null;
    }

    /**
     * Hier soll die Rotation eines Knotens implementiert werden. Diese sei hier analog zur einfachen Rotation in
     * der Vorlesung definiert. Hier darf der Einfachheit wegen angenommen werden, dass unser Baum keine Duplikate enthält
     * <p>
     *     Here you should implement the rotation of a node inside a tree. The rotation should happen in a way similar
     *     to the definition of a simple rotation in the lecture. You can assume the tree to not contain duplicates.
     * @param root Die Wurzel des Baums
     *             <p>
     *             The root of the tree
     * @param value Der Wert des Knotens, an dem rotiert werden soll
     *              <p>
     *              The value of the node which should be the base of the rotation
     * @param direction True, falls nach rechts rotiert werden soll, andernfalls False
     *                  <p>
     *                  True if it should be rotated right, otherwise False
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of the elements in the tree
     * @return Der neue Baum nach ausgeführter Rotation oder der unveränderte Baum, falls die Rotation nicht möglich war
     * <p>
     *     The updated tree after the rotation or the unchanged tree if the rotation was impossible.
     *     <p>
     * -Hinweis_
     * in dieser Aufgabe muss der zu rotierende Knoten zu Beginn erst gefunden werden. Hier bietet sich daher die
     * Verwendung einer Hilfsmethode zur Suche an. Danach müsst ihr euch nur noch um die eigentliche Rotation kümmern.
     * Es ist hier jedoch hilfreich, eine Suchmethode zu verwenden, die den Elternknoten des zu rotierenden Knotens sucht,
     * um den Baum danach korrekt zurückgeben zu können.
     * <p>
     * -Attention,
     * To actually perform the rotation you first have to locate the node in the tree. This is easier if done in a
     * different method and afterwards perform the rotation. Your method to search the node should actually find the
     * parent node of the node to rotate so you can easily return the changed tree later.
     */
    public static <E> Node<E> rotate(final Node<E> root, final E value, final boolean direction)
    {
        return null;
    }


    /**
     * Hier soll die Summe aller Werte in den Knoten berechnet werden.
     * <p>
     * Here you should determine the sum of all values in the nodes of a tree.
     * @param root Wurzel des übergebenen Baumes
     *             <p>
     *             The root of the tree
     * @param <E> Der Typ der Elemente. Muss mindestens numerisch sein
     *           <p>
     *           The type of the elements. Must be numerical at least.
     * @return Die Summe der Werte in den Knoten des Baumes oder -1, falls der Baum NULL war.
     * <p>
     *     The sum of all values in the nodes of a tree or -1 if the tree was NULL.
     *  <p>
     * -Hinweis-
     * soll der Fehlerfall behandelt werden, bietet sich die Verwendung einer Hilfsmethode an
     * -Hinweis2-
     * achtet hier auf den richtigen Umgang mit den Rechenoperatoren. Würdigt insbesondere, dass alle
     * Klassen, die von Number erben, über eine Methode ''.doubleValue()'' verfügen (Nähere
     * Informationen entnehmt hier gerne der JavaDoc ;)
     * <p>
     * -Attention-,
     * if you want to deal with the error case it is helpful to use a second function.
     * -Attention2-,
     * be careful with which operations can be performed on certain datatypes. Remember also that for all classes
     * which inherit from Number a method called ''.doubleValue()'' can be performed (More information you could find in
     * the JavaDoc ;)
     */
    public static <E extends Number> double sumNodes(final Node<E> root)
    {
        return -1;
    }

    /**
     * Hier soll die Wurzel einer UnionFind-Struktur ermittelt werden. Der darin gespeicherte Wert soll dann als
     * Rückgabe dieser Funktion zurückgegeben werden.
     * <p>
     * Here you should find the root of a UnionFind-structure. The value inside the root should be the value
     * returned by this method
     * @param node Ein Knoten einer UnionFind-Struktur
     *             <p>
     *             A node in a UnionFind-structure
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of elements in the structure
     * @return Der Wert, der in der Wurzel der UnionFind-Struktur gespeichert ist, oder NULL, falls keine Wurzel existiert
     * <p>
     *     The value in the root of the UnionFind-structure or NULL if no root exists.
     */
    public static <E> E getUnionRoot(final UnionFindNode<E> node)
    {
        return null;
    }

    /**
     * Hier soll der maximale Verzweigungsgrad eines variadischen Baums ermittelt werden. Der Grad ist hierbei definiert
     * als die Anzahl der Kinder eins bestimmten Knotens. In variadischen Bäumen können alle Knoten unterschiedlich (***)
     * viele Kinder besitzen. Ein Blatt hat hier nach Definition den Verzweigungsgrad 0.
     * <p>
     * Here you should determine the maximum degree of branching of a variadic tree.
     * The degree of a node is defined as the amount of children a node has. Note that in variadic tree every node can have
     * a different amount of children. We define the degree of a leaf to be 0
     * @param root Die Wurzel des variadischen Baums
     *             <p>
     *             The root of the variadic tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of elements in the tree
     * @return Der maximale Verzweigungsgrad des Baums oder -1, falls NULL die Eingabe war
     * <p>
     *     The maximum degree of branching in the tree or -1 if NULL was the input
     */
    public static <E> int maximumDegree(final VariadicTreeNode<E> root)
    {
        return -1;
    }

    /**
     * Hier soll die Anzahl aller Knoten in einem variadischen Baum ermittelt werden. (***).
     * In variadischen Bäumen können alle Knoten unterschiedlich viele Kinder besitzen.
     * <p>
     * Here you should count the amount of nodes in a variadic tree.
     * Note that in variadic tree every node can have a different amount of children.
     * @param root Die Wurzel des variadischen Baums
     *             <p>
     *             The root of the variadic tree
     * @param <E> Der Typ der Elemente
     *           <p>
     *           The type of elements in the tree
     * @return Die Anzahl Knoten des Baums oder -1, falls NULL die Eingabe war
     * <p>
     *     The amount of nodes in the tree or -1 if NULL was the input
     */
    public static <E> int countVariadicNodes(final VariadicTreeNode<E> root)
    {
        return -1;
    }

    /**
     * Beim Spiel Nim gibt es eine Menge Streichhölzer, von denen zwei Spieler:innen
     * abwechselnd immer 1 bis 3 wegnehmen. Wer das letzte Streichholz nimmt, hat
     * gewonnen. Löst das Spiel mit dem NegaMax-Algorithmus. Interessant ist hierbei,
     * dass für die Bewertung gar nicht bekannt sein muss, wer gerade am Zug ist,
     * sondern lediglich, wie viele Streichhölzer noch übrig sind.
     * <p>
     *     In the game Nim, there are a number of matches, from which two players
     *     alternately remove between 1 and 3 matches. The player wins, who removes
     *     the last match. Solve the game with the NegaMax algorithm. An interesting
     *     fact is that it is not necessary to know who is performing the current move,
     *     only how many matches are left.
     * @param matches Die Anzahl der Streichhölzer, die noch vorhanden sind.
     *                <p>
     *                The number of matches that are still present.
     * @return Ein Paar von zwei Werten. Der erste ist die Anzahl der Streichhölzer,
     * die genommen werden sollen (1-3). Der zweite ist die Bewertung, die dadurch erreicht
     * wird (1: Die Aufrufer:in wird gewinnen; -1: Die Aufrufer:in wird verlieren).
     * <p>
     *     A pair of two values. The first one is the number of matches to pick up (1-3).
     *     The second one is the assessment of the result that is achieved by this
     *     (1: The caller will win; -1: The caller will lose).
     */
    public static int[] nimNegaMax(final int matches)
    {
        return new int[]{/*Bester Zug:*/ -1, /*Bewertung des Zugs:*/ -1};
    }
}
