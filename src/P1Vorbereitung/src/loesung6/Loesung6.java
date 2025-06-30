package P1Vorbereitung.src.loesung6;

public class Loesung6 {

    public static void main(String[] args)
    {

        System.out.println(multiplyDivide(32,2,true)); // ergebnis muss 2 sein
        System.out.println(multiplyDivide(8,2,false)); // ergebnis muss 8 sein

        System.out.println("aufgabe 3 = " + sumMultiples(2,20,5,100) );
    }

    public static int multiplyDivide(int input, int shift, boolean divide)
    {
        // >> divide
        if(divide){
            return input >> shift ;
        }
        // << multiplikation
        else {
            return input << shift ;
        }
    }


    /**
     *
     * @param flags ein ganze Zahl aber kann auch ein Binärzahl sein
     * @param position welche position muss bearbeitet werden
     * @param action String nimmt ein instruction ein
     * @return flags
     */
    public static int manipulateFlags(int flags, int position, String action)
    {
        int mask = 1 << position;  // Erstellen Sie eine Maske mit einem 1-Bit an der angegebenen Position
        // Ihr Code hier
         switch (action){
             case "set"   : flags |= mask;   break;
             case "clear" : flags &= ~mask; break;
             case "toggle": flags ^= mask; break;
             case "check" : return (flags & mask) != 0 ? 1 : 0;
             default: break;
         }
        return flags;
    }

    public static int sumMultiples(int multipleOf, int limit, int skipMultiple, int stopThreshold)
    {
        int sum = 0;
        // Ihr Code hier
        for (int i = 0; i < limit; i++) {

            if ((i % multipleOf) == 0){
                if (i % skipMultiple ==0){
                    continue;
                }
                sum += i;
                if(sum >= stopThreshold){
                    break;
                }

            }

        }
        return sum;
    }


}
