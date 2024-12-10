package de.uni_bremen.pi2;

import java.util.Stack;

/** 2 ორი იპლიმენტირება ჰანოის
 * @author Sergi
 */
public class AxaliHanoi {
    /** ნაჭრების რაოდენობა. */
    private final int anzahlScheiben;

/**
 * სამი სვეტის დასტა. ნებისმიერი შენახული ნომერი
 * წარმოადგენს გარკვეული ზომის დისკს.
 */
private final Stack<Integer>[] stapel = new Stack[3];

    /**
     * Initialisiert die drei Stapel. Alle Scheiben sind zu
     * Beginn auf dem rechten Stapel.
     * @param anzahlScheiben Die Anzahl der Scheiben.
     */
public AxaliHanoi(final int anzahlScheiben)
{
    // tu 0 ze naklebia mashin Fehlermeldungi gveqneba
    assert anzahlScheiben > 0;
    this.anzahlScheiben = anzahlScheiben;

    //di drei Stapel anlegen.
    for (int i = 0; i <stapel.length ; i++) {
        stapel[i] = new Stack<>();
    }
    // Den rechten Stapel füllen, von groß nach klein.
    for (int i =  anzahlScheiben; i > 0  ; --i) {
        stapel[2].add(i);
    }
}

    /**
     * Greedy-Implementierung der Türme von Hanoi. Bewegt den
     * Stapel von rechts zur Mitte.
     * Achtung: Kann nur unmittelbar nach der Konstruktion
     * des Objekts aufgerufen werden.
     */
    public void gierig()
    {
        anzeigen();

        // Abhängig von der Anzahl der Scheiben (gerade/ungerade) muss die
        // kleinste Scheibe immer nach rechts oder links bewegt werden.
        final int schritt = anzahlScheiben % 2 == 0 ? 1 : 2;

        //Die kleinste Scheibe befindet sich auf dem Rechten Stapel
        int k = 2;

        while (true){
            final int i = k;
            k = (k + schritt) % stapel.length;
            stapel[k].push(stapel[i].pop());
            anzeigen();


            //Fertig, wenn kleinste Schreibe wieder auf vollem Stapel.
            if(stapel[k].size() == anzahlScheiben){
                break;
            }

            // Ansonsten kleinere Schreibe zwischen anderen beiden Stapeln bewegen.
            final int j = 3 - k - 1;
            if (stapel[i].empty() || (!stapel[j].empty() && stapel[j].peek() <stapel[i].peek())){
                stapel[i].push(stapel[j].pop());
            }
            else {
                stapel[j].push(stapel[j].pop());
            }
            anzeigen();
        }
    }

    /**
     * Dividing-and-Conquer- "დაყავი და იბატონე"Implimentirung der Türme von Hanoi
     * bewegt den Stampel von Reschts zur Mitte.
     * Achtung! : kann nur unmitelbar nach der Konstruktion
     * des Objekts aufgerufen werden
     */

    public void teileUndHerrsche()
    {
        anzeigen();
        teileUndHerrsche(2,1,anzahlScheiben);
    }

    /**
     * bewegen der oberste "höhe" Scheibe von einem Stapel zu einem andere
     *  @param i Der Index des Stapels, von dem die Scheiben entnommen werden.
           * @param j Der Index des Stapels, auf den die Scheiben gelegt werden.
           * @param höhe Die Anzahl der oberen Scheiben, die bewegt werden.
     */

    private void teileUndHerrsche(final int i,final int j, final int höhe)
    {
        //Um etwas zu veschieben, muss ein Stapel mindestens Höhe 1 haben.
        if (höhe > 0){
            final int t = 3 - i - j;
            //
            teileUndHerrsche(i,t,höhe - 1);
            //die nun oberste Scheibe verschieben
            stapel[j].push(stapel[i].pop());

            anzeigen();

            // Die Scheiben vom Ausweichplatz zum ziel bewegen
            teileUndHerrsche(t,j,-1);
        }
    }

    /**
     *Anzeige der Stapel
     */
    public void anzeigen()
    {
        //Stangen und Schieben darstellen.
        for (int y = anzahlScheiben; y >= 0 ; --y){
            for (final var s : stapel){
                if(y < s.size()){
                    final int schieben = s.elementAt(y);
                    System.out.println(" ".repeat(anzahlScheiben - schieben ) + "=".repeat(2* schieben -1)
                    + " ".repeat(anzahlScheiben  -schieben+1) );
                }
                else {
                    System.out.println(" ".repeat(anzahlScheiben -1 ) + "|" + " ".repeat(anzahlScheiben));
                }
            }
            System.out.println();
        }
        // Sockel darstellen
        for ( final var s : stapel){
        System.out.println("-".repeat(anzahlScheiben *2 - 1) + " ");
    }
        System.out.println("\n");
    }

}

