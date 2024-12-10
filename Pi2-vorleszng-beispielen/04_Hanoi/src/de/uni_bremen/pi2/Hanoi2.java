package de.uni_bremen.pi2;

import java.util.Stack;

public class Hanoi2 {
    /** Die Anzahl der Scheiben. */
    private final int anzahlScheiben;

    /** Die Stapel(სვეტი) der drei Säulen (სვეტი).jede geschpeicherte zahl
     * repräsentiert eine Scheibe(დისკი, ან ფილა) einer bestimten Größe.
     */
    private Stack<Integer>[] stapel = new Stack[3];

    /**
     *  Initialisiert die drei Stapel. Alle Scheiben sind zu
     * Beginn auf dem rechten Stapel.
     * @param anzahlScheiben Die Anzahl der Scheiben.
     */

    public Hanoi2(final int anzahlScheiben)
    {
        assert anzahlScheiben > 0;
        this.anzahlScheiben = anzahlScheiben;

        // 3 Stapel anlegen(შექმნა)
        for (int i = 0; i <stapel.length ; i++) {
            stapel[i] = new Stack<>();
        }
        // Den rechten Stapel füllen, von groß nach klein.
        for (int i = anzahlScheiben; i > 0 ; --i) {
            stapel[2].add(i);
        }
    }


    private void anzeige(){
        // Stangen und Scheiben darstellen.
        //რამდენი ფილაცაა იმდენჯერ დატრიალდება ეს ციკლი
        for (int y = anzahlScheiben; y >= 0; --y){
            //
            for(final var s : stapel){
                if (y < s.size()){
                    final int scheibe = s.elementAt(y);
                }
            }
        }
    }
}
