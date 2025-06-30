class KnapsackDP {
    public static int knapsack(int[] w, int[] v, int B, int n) {
        int[][] M = new int[n + 1][B + 1];

        // DP-Tabelle füllen
        for (int i = 1; i <= n; i++) {
            for (int b = 1; b <= B; b++) {
                if (w[i - 1] <= b) {
                    M[i][b] = Math.max(M[i - 1][b], v[i - 1] + M[i - 1][b - w[i - 1]]);
                } else {
                    M[i][b] = M[i - 1][b];
                }
            }
        }

        // Rückgabe des maximal erreichbaren Werts
        System.out.println("Dynamische Programmierung Tabelle:");
        for (int i = 0; i <= n; i++) {
            for (int b = 0; b <= B; b++) {
                System.out.printf("%4d", M[i][b]); // Formatierter Abstand für bessere Lesbarkeit
            }
            System.out.println();
        }
        return M[n][B];
    }

    public static void main(String[] args) {
        int[] w = {3, 2, 4};   // Gewichte der Gegenstände
        int[] v = {60, 100, 120};  // Werte der Gegenstände
        int B = 5;  // Maximale Rucksackkapazität
        int n = w.length;  // Anzahl der Gegenstände

        int maxValue = knapsack(w, v, B, n);
        System.out.println("Maximal erreichbarer Wert: " + maxValue);
    }
}
