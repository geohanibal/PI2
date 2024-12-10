package de.uni_bremen.pi2;

import java.util.Arrays;

/**
 * Die Klasse implementiert eine Lösung für das n-Damen-Problem
 * durch Backtracking.
 * @author Thomas Röfer
 */
public class Queens
{
    /**
     * Lösen des n-Damen-Problems.
     * @param numOfQueens Die Anzahl der Damen.
     * @return Ein Array, das für jede Zeile des Bretts enthält,
     *         in welcher Spalte sich die Dame befindet. Alternativ
     *         null, wenn es keine Lösung gibt.
     */
    public static int[] solve(final int numOfQueens)
    {
        // Die Spaltenposition der Damen pro Zeile.
        final int[] columnInRows = new int[numOfQueens];
        Arrays.fill(columnInRows, -1);

        // Für alle Zeilen bzw. Damen
        for (int row = 0; row < columnInRows.length;) {
            // Nächste Spalte ausprobieren
            ++columnInRows[row];

            // Wurde rechter Rand erreicht?
            if (columnInRows[row] == numOfQueens) {
                // Ja, Backtracking (vorherige Zeile bzw. Dame)
                columnInRows[row--] = -1;
                if (row < 0) {
                    return null; // Erste Dame fand keinen Platz mehr: keine Lösung
                }
            }
            // Wurde ein sicherer Platz gefunden?
            else if (isSafe(columnInRows, row)) {
                // Ja, weiter mit nächster Zeile bzw. Dame
                ++row;
            }
        }
        return columnInRows;
    }

    /**
     * Ist die Position eine Dame vor den vorher platzierten sicher?
     * @param columnInRows Die Spaltenpositionen der Damen pro Zeile. Nur die
     *                     Einträge vor der aktuellen Zeile sind relevant.
     * @param row Die Zeile, in der die aktuelle Dame platziert wurde.
     * @return Ist die Position der aktuellen Dame sicher?
     */
    private static boolean isSafe(final int[] columnInRows, final int row)
    {
        for (int other = 0; other < row; ++other) {
            // Test auf selbe Spalte, eine Diagonale und andere Diagonale
            if (columnInRows[row] == columnInRows[other]
                    || Math.abs(columnInRows[row] - columnInRows[other]) == row - other) {
                return false;
            }
        }
        return true;
    }

    /**
     * Gibt das Schachbrett aus.
     * @param columnInRows Die Spaltenpositionen der Damen pro Zeile.
     *                     Alternativ null, wenn es keine Lösung gab.
     */
    public static void draw(final int[] columnInRows)
    {
        if (columnInRows == null) {
            System.out.println("Keine Lösung!");
        }
        else {
            for (final int column : columnInRows) {
                System.out.println(". ".repeat(column) + "Q " + ". ".repeat(columnInRows.length - column - 1));
            }
        }
    }
}
