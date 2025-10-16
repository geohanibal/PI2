package de;

import static de.uni_bremen.pi2.Sudoku.Result;
import static de.uni_bremen.pi2.Sudoku.Result.*;

import java.util.List;
import java.util.Stack;

/**
 * Aufgabe 1: Sudoku lösen mit Backtracking (20 %).
 *
 * Es dürfen keine Klassen der Laufzeitbibliothek verwendet werden,
 * außer denen, die in dieser Klasse bereits verwendet werden.
 */
public class Backtracking
{
    /**
     * Löse ein 4x4-Sudoku-Puzzle mit Backtracking.
     * @param sudoku Das Puzzle. Wichtig ist hier nur die Methode
     *         check mit ihren drei möglichen Ergebnissen INVALID,
     *         VALID und COMPLETE.
     * @return Eine Folge aus den Zahlen 1 bis 4, die in die freien
     *         Felder des Sudoku-Puzzles eingetragen werden kann, um
     *         das Puzzle zu lösen. Wenn das Puzzle nicht lösbar ist,
     *         wird null zurückgegeben.
     */
    public static List<Integer> solve(final Sudoku sudoku)
    {
        // Die Zahlenfolge, die in die Lücken des Sudoku-Puzzles
        // eingetragen wird.
        final Stack<Integer> numbers = new Stack<>();

        // Eine Zahl eintragen. 0 ist unmittelbar vor der ersten
        // erlaubten Zahl.
        numbers.push(0);

        // In jedem Durchlauf der Schleife wird versucht, für das
        // letzte Element der Zahlenfolge (numbers.peek()) einen
        // gültigen Wert zu finden.
        do {

            // Die letzte Zahl muss um 1 erhöht werden (mithilfe von
            // numbers.pop() und numbers.push()).
            // Dann sind vier Fälle zu beachten, wobei die letzten drei
            // vom Ergebnis der Methode sudoku.check(numbers) abhängen:
            // 1. Die Zahl verlässt den gültigen Bereich → Backtracking.
            // 2. Das Puzzle wurde gelöst (COMPLETE) → Zahlenfolge
            //    zurückgeben.
            // 3. Die Zahlenfolge ist gültig (VALID) → nächste Zahl
            //    hinzufügen (mit push(), startet wie oben mit 0).
            // 4. Die Zahlenfolge ist ungültig (INVALID) → nichts tun,
            //    d.h. die Schleife geht in die nächste Runde, wodurch
            //    die Zahl weitergezählt wird.

            break; // Ersetzen

        } while (!numbers.isEmpty());

        // Backtracking über den Anfang der Zahlenfolge hinaus → Puzzle
        // ist unlösbar.
        return numbers;
    }


}
