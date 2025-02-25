package AlgoritmusF;

/**
 * Method zum Sortieren
 * Worst-Kase O(nlongn)
 */
public class MergeSort {
    // Methode zum Sortieren
    public static void mergeSort(int[] array, int links, int rechts) {
        if (links < rechts) {
            int mitte = links + (rechts - links) / 2; // Vermeidet Overflow

            // Teile das Array in zwei Hälften
            mergeSort(array, links, mitte);
            mergeSort(array, mitte + 1, rechts);

            // Füge die sortierten Hälften zusammen
            merge(array, links, mitte, rechts);
        }
    }

    // Methode zum Mergen
    public static void merge(int[] array, int links, int mitte, int rechts) {
        int n1 = mitte - links + 1;
        int n2 = rechts - mitte;

        int[] linksArray = new int[n1];
        int[] rechtsArray = new int[n2];

        // Daten kopieren
        for (int i = 0; i < n1; i++)
            linksArray[i] = array[links + i];
        for (int j = 0; j < n2; j++)
            rechtsArray[j] = array[mitte + 1 + j];

        int i = 0, j = 0, k = links;

        // Mergen der beiden Arrays
        while (i < n1 && j < n2) {
            if (linksArray[i] <= rechtsArray[j]) {
                array[k] = linksArray[i];
                i++;
            } else {
                array[k] = rechtsArray[j];
                j++;
            }
            k++;
        }

        // Restliche Elemente kopieren
        while (i < n1) {
            array[k] = linksArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rechtsArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 8, 5, 2, 7, 4, 1};
        System.out.println("Unsortiertes Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sortiertes Array:");
        printArray(array);
    }

    // Hilfsmethode zum Drucken des Arrays
    public static void printArray(int[] array) {
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
    }
}