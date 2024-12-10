package de.uni_bremen.pi2;

/**
 * Ein Gepäckstück für das Rucksackproblem.
 * @param gewicht Das Gewicht des Gepäckstücks.
 * @param wert Der Wert (d.h. die Nützlichkeit) des Gepäckstücks.
 * @author Thomas Röfer
 */
public record Gepaeck(int gewicht, int wert)
{
    public static void main(String[] args) {
        final Gepaeck[] klein = {
                new Gepaeck(2,6),
                new Gepaeck(2,3),
                new Gepaeck(6,5),
                new Gepaeck(5,4),
        };
        Rucksack.rucksack(klein,10);

        System.out.println(Rucksack.rucksack(klein,10));
    }
}


