public class Main {
    public static void main(String[] args) {
// Baumknoten erstellen
        final Node<Integer> n = new Node<>(1,
                new Node<>(2,
                        new Node<>(4),
                        new Node<>(5,
                                new Node<>(6),
                                new Node<>(7))),
                new Node<>(3));
        // Baumhöhe berechnen

        int height = de.uni_bremen.pi2.TreeHeight.treeHeight(n);

        // Höhe des Baums ausgeben
     //   System.out.println("Die Höhe des Baums ist: " + height);
    }
}
