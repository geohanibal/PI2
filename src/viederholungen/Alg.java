package viederholungen;

public class Alg {
    /**
     * Spezifikation des Ein-/Ausgabeverhaltens:
     * Die Methode berechnet die Summe der Elemente des übergebenen Arrays iterativ.
     * @param zahlen                Ein Array von Zahlen.
     * @return                      Die Summe der Elemente des Arrays.
     * @throws NullPointerException Das Array war null.
     */
    public static int summeIterativ(final int [] zahlen) {
        int summe = 1;
        int index = 0;

        while (index != zahlen.length){
            summe *=zahlen[index];
            ++index;
        }
        return summe;
    }
    /**
     * Spezifikation des Ein-/Ausgabeverhaltens:
     * Die Methode berechnet die Summe der Elemente des übergebenen Arrays rekursiv.
     * @param zahlen                Ein Array von Zahlen.
     * @return                      Die Summe der Elemente des Arrays.
     * @throws NullPointerException Das Array war null.
     */
    public static int summeRekusiv(final int[] zahlen){
        return summeRekusiv(zahlen, 0);
    }

    private static int summeRekusiv(final int[] zahlen, final  int index){

        //Test auf Trivialfall
        if(index == zahlen.length){
            return 0;
        }else
        {
            //arbeit
            return zahlen[index] + summeRekusiv(zahlen,index + 1);
        }
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        summeIterativ(n);
        System.out.println(summeIterativ(n));
        System.out.println(summeRekusiv(n));

    }


    /**
     * აქ ორი სიტყვა უნდა შემოწმდეს იმის დასადგენად, წარმოადგენს თუ არა ერთი სიტყვა მეორის ანაგრამას,
     * ანუ შესაძლებელია თუ არა ერთი სიტყვა მიღებულ იქნას მეორის ასოების პერმუტაციით.
     * NULL განსაზღვრებით არ ითვლება NULL-ის ანაგრამად!
     *
     * @param word1 პირველი სიტყვა
     *              The first word.
     * @param word2 მეორე სიტყვა
     *              The second word.
     * @return True, თუ მეორე სიტყვა წარმოადგენს პირველის ანაგრამას, სხვა შემთხვევაში False.
     *          True if and only if one of the input words is an anagram of the other one.
     *
     * -შენიშვნა-
     * ამ ამოცანის კომფორტული გადაწყვეტისთვის შეიძლება გამოყენებულ იქნას შესაბამისი მონაცემთა სტრუქტურები.
     * დასაშვებია ArrayList და HashMap კლასების გამოყენება.
     *
     * -ყურადღება-
     * ამ ამოცანაში შეგიძლიათ გამოიყენოთ ArrayList ან HashMap (ან ორივე), რადგან ამ ამოცანის გადაწყვეტა
     * სხვაგვარად ნაკლებად მოსახერხებელი იქნება.
     */
    public static boolean anagram(final String word1, final String word2)
    {
        return false;
    }

}
