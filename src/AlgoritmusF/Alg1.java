package AlgoritmusF;

public class Alg1 {
    /**
     * Alg zum Sortieren Zahlen
     *
     * */


    public static void sort (final int [] zahl){
         int i = 1;
         int counter = 1;
        while (i < zahl.length){
            counter ++;
            int j = i;
            while ((j > 0) && zahl[j-1] > zahl[j] ){
                int temp = zahl[j];
                zahl[j] = zahl[j -1];
                zahl[j -1] = temp;
                j --;
                counter ++;
            }
            i ++;
        }

        System.out.println(counter);
        for (int c : zahl){
            System.out.println(c);
        }
    }

    /**
     * algorithm für rekusiv
     * Ein Algorithmus ist rekursiv, wenn er sich selbst auf kleinere Teilprobleme aufruft, bis eine Abbruchbedingung erreicht ist.
     * @param n
     * @return n!
     */
      int alg_rekusiv(int n){
        if (n == 1){
            return 1;
        }
        return n + alg_rekusiv(n -1);
    }


    /**
     * Ein Algorithmus ist iterativ, wenn er Schleifen (z. B. for, while) verwendet, um das Problem schrittweise zu lösen.
     * @param n
     * @return n!
     */
    int alg_Iterativ(int n){
        int ergebnis = 0;
        for (int i = 0; i < n+1; i++) {
            ergebnis += i;
        }
        return ergebnis;
    }

    /**
     * ein method um min Wert zu finden
     * @param a
     * @return min Wert von Array
     */

    int min(int [] a){
        if (a == null|| a.length == 0) {
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");
        }

        int m = a[0];

        if(a.length > 0){
            for (int i = 0; i < a.length ; i++) {
                if(m > a[i]){
                    m = a[i];
                }
            }
        }
        return m;
    }

    int min2(int []a){
        if (a == null|| a.length == 0) {
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");
        }
        return Math.min(min2(a),a[a.length]);
    }

}

