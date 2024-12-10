package de.uni_bremen.pi2;

import java.util.Arrays;

/**
 * Ein Beispiel für dynamisches Programmieren.
 * @author Thomas Röfer
 */
public class Rucksack
{
    /**
     * Löst das Rucksackproblem.
     * @param gepäck    Die Gepäckstücke, die mitgenommen werden könnten.
     * @param kapazität Das Gewicht, das maximal in den Rucksack gepackt werden kann.
     * @return          Der optimale Gesamtwert des Rucksackinhalts.
     */
    public static int rucksack(final Gepaeck[] gepäck, final int kapazität)
    {
        final int[][] tabelle = new int[gepäck.length][kapazität + 1];
        for (final int[] zeile : tabelle) {
            Arrays.fill(zeile, -1);
        }
        return rucksack(gepäck, 0, kapazität, tabelle);
    }

    /**
     * Löst das Rucksackproblem ab einem bestimmten Gepäckstück.
     * @param gepäck    Die Gepäckstücke, die mitgenommen werden könnten.
     * @param i         Der Index des aktuell betrachteten Gepäckstücks.
     * @param kapazität Das Gewicht, das maximal noch in den Rucksack gepackt werden kann.
     * @param tabelle   Eine Tabelle, die an [i][kapazität] bereits das Ergebnis der
     *                  Berechnung enthält, oder -1, wenn es noch nicht ausgerechnet wurde.
     *                  In letzterem Fall wird die Methode das Ergebnis an dieser Stelle
     *                  eintragen.
     * @return          Der optimale Gesamtwert des restlichen Rucksackinhalts.
     */
    private static int rucksack(final Gepaeck[] gepäck, final int i, final int kapazität,
            final int[][] tabelle)
    {
        if (i == gepäck.length) { // Keine weiteren Gepäckstücke
            return 0;
        }
        else if (tabelle[i][kapazität] != -1) { // Ergebnis schon mal berechnet
            return tabelle[i][kapazität];
        }
        else if (kapazität < gepäck[i].gewicht()) { // Gepäckstück zu schwer
            return tabelle[i][kapazität] = rucksack(gepäck, i + 1, kapazität, tabelle);
        }
        else { // Maximum aus Gepäckstück nicht mitnehmen und mitnehmen
            return tabelle[i][kapazität] = Math.max(rucksack(gepäck, i + 1, kapazität, tabelle),
                     gepäck[i].wert()
                     + rucksack(gepäck, i + 1, kapazität - gepäck[i].gewicht(), tabelle));
        }
    }
 }
