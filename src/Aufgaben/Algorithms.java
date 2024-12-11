package Aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Hier folgen einige Beispielaufgaben zu Algorithmen
 * -Hinweis-
 * <p>
 * Grundsätzlich sind bei allen Aufgaben KEINE Hilfsmittel erlaubt, die importiert werden müssten.
 * Ausnahmen dazu werde ich in der jeweiligen Aufgabenstellung aufzählen, wenn die betreffenden Aufgaben ohne diese
 * Hilfsmittel nur sehr umständlich zu lösen sind.
 * <p>
 * English version will always be below the german text.
 * <p>
 * Here you will find some possible exercises which allow you to improve your skills with constructing algorithms
 * <p>
 * Attention:
 * <p>
 * It is not allowed to import libraries which help you solving the exercises. This should only happen if
 * explicitly stated in the assignment.
 * @author Pascal Himmelmann
 */
public class Algorithms
{
    /**
     * Hier soll mittels des bekannten Cashier Algorithmus berechnet werden, wie viele Scheine
     * beziehungsweise Münzen welcher Stelligkeit zur Bezahlung eines Preises nötig sind.
     * Der höchste verfügbare Schein sei hier der 100-Euro-Schein, die kleinste Münze sei die 1-Euro-Münze.
     * <p>
     * Here you should use the well known cashier-algorithm to calculate how to best pay a specific
     * price using as few notes and coins as possible. The largest available note should be the 100 euro note,
     * the smallest one should be the 1 Euro coin.
     * <p>
     * @param price Der zu zahlende Preis in ganzen Euro. Dieser kann nicht negativ sein
     *              <p>
     *              The price that should be paid. This will not be negative.
     * <p>
     * @return Ein Array mit 7 Einträgen, dass die Menge jedes Scheins und jeder Münze angibt,
     *          die zur Begleichung des Preises benötigt werden, beginnend bei dem 100-Euro-Schein.
     *          Folgende Scheine und Münzen sind möglich:
     *          100 Euro
     *          50 Euro
     *          20 Euro
     *          10 Euro
     *          5 Euro
     *          2 Euro
     *          1 Euro
     * <p>
     *  Beispiel: Für die Eingabe 144 sollte (1, 0, 2, 0, 0, 2, 0) die Ausgabe sein da:
     *            1 x 100
     *            0 x 50
     *            2 x 20
     *            0 x 10
     *            0 x 5
     *            2 x 2
     *            0 x 1
     * <p>
     *          An array containing the information about which of the notes and coins should be
     *          used how many times. The indices are representing the notes and coins in the following order
     *          100 Euro
     *          50 Euro
     *          20 Euro
     *          10 Euro
     *          5 Euro
     *          2 Euro
     *          1 Euro
     * <p>
     * Example: If the input is 144, the output should be (1, 0, 2, 0, 0, 2, 0) because we need the following notes and coins:
     *      1 x 100
     *      0 x 50
     *      2 x 20
     *      0 x 10
     *      0 x 5
     *      2 x 2
     *      0 x 1
     */
    public static int[] cashier(final int price )
    {

        int [] price1 = {100,50,20,10,5,2,1};
        int [] ausgabe = new int[price1.length];
         int preis = price;
        if (price < 0) {
        throw new IllegalArgumentException("Price cannot be negativ.");
        }
        for (int i = 0; i < price1.length ; i++) {

            ausgabe[i] = preis / price1[i];
            preis %= price1[i];

        }

        return ausgabe;

    }

    /**
     * Hier soll ein Algorithmus implementiert werden, der ein beliebiges generisches Array als Eingabe
     * erhält und alle doppelt vorkommenden Elemente innerhalb des Arrays entfernt. Die Reihenfolge anderer
     * Elemente soll hierbei nicht verändert werden
     * <p>
     * Here you should implement an algorithm that gets a generic array as an input and should remove all
     * duplicates existing in that array. All other elements and especially the order of all elements should
     * stay unchanged.
     * <p>
     * @param list Das Array, welches gefiltert werden soll
     *             <p>
     *             The array, which should be checked for duplicates
     *
     * @param <E> Der Typ der Elemente. Hier muss Equals sinnvoll implementiert sein
     *           <p>
     *            The generic type of the elements. You can presume that equals is implemented correctly for this type
     *
     * @return Das Eingabearray in dem alle Duplikate entfernt wurden
     *          <p>
     *          The input array without duplicates
     */
    public static <E> E[] filter(final E[] list )
    {
        if (list == null || list.length == 0) {
            return list;
        }
       int uniKeyCounter = 1 ;

        for (int i = 1; i < list.length; i++) {

            int j;
            for ( j = 0; j < uniKeyCounter; j++) {
                if (list[i].equals(list[j])){
                    break;
                }
            }

                if (j == uniKeyCounter ){
                    list[uniKeyCounter] = list[i];
                    uniKeyCounter++;
                }
        }
        return Arrays.copyOf(list,uniKeyCounter);

    }



    /**
     * Hier soll ein Algorithmus implementiert werden, der die ersten n Catalan-Zahlen berechnet.
     * Ihr sollt Fakultäten hier manuell berechnen und nicht mittels einer Laufzeitbibliothek.
     * Die erste Catalan-Zahl sei hier:
     *                  C(0) = 1
     * Die n-te Catalan-Zahl ist dabei wie folgt definiert:
     *                  C(n) = (2·n)! / ((n+1)!·n!)
     * <p>
     * Here you should implement an algorithm that calculates the first n catalan-numbers.
     * In order to do this you will need to use faculties which should here be calculated manually
     * without importing some libraries.
     * We define the first catalan-number to be:
     *                  C(0) = 1
     * All other catalan-numbers are defined as follows:
     *                  C(n) = (2·n)! / ((n+1)!·n!)
     *
     * @param n Die Anzahl auszugebender Catalan-Zahlen
     *          <p>
     *          The amount of catalan-numbers to calculate
     * @return Ein Array bestehend aus den ersten n-Catalan Zahlen oder NULL, falls n kleiner als 1 ist
     *          <p>
     *         An array containing the first n catalan numbers or NULL if n is less than 1
     * <p>
     * -Hinweis-
     * je nachdem, wie die Implementierung dieser Aufgabe erfolgt, kann es bei der Berechnung der Zwischenergebnisse
     * (insbesondere der Fakultäten) zu sehr großen Zahlen kommen, die den Zahlbereich eines Integers verlassen.
     * Die Tests sind so ausgelegt, dass solche großen Zahlen auch bei naiver Implementierung nicht auftreten.
     * Ihr seid aber frei darin, den Algorithmus auch so zu verändern, dass ihr größere Werte berechnen könnt,
     * müsst es aber nicht machen :)
     * <p>
     * -Attention-
     * Depending on your implementation there can be very huge faculties to calculate which may even exceed the
     * possible range of integers. The tests are designed so that even with a naive implementation this should never
     * happen. You do not need to find a solution to get this algorithm working with such high faculties, but you may
     * do it if you like to.
     */
    public static int[] catalan(final int n)
    {
        if (n < 1){
           return null;
        }
        int [] output = new int[n];
        output[0] = 1;
        for (int i = 1 ; i < n; i++) {

            int factorial2N = factorial(2* i);
            int factorialNPlus1= factorial(i + 1);
            int factorialN = factorial(i);
            int sum = factorial2N / (factorialNPlus1 * factorialN) ;

            output[i] = sum  ;
        }
        return output ;
    }

    private   static int factorial(final int a ){
        int result = 1;
        for (int i = 1; i < a + 1; i++) {
            result = result * i;
        }
        if(a < 1 ){
            result = 1;
        }
        return result ;
    }
    /**
     * Hier sollen 2 Wörter dahingehend untersucht werden, ob es sich bei einem der Wörter um ein Anagramm des
     * anderen Wortes handelt, also ob sich das erste Wort als Permutation des anderen Wortes ergibt.
     * NULL sei hier nach Definition kein Anagramm von NULL!
     * <p>
     * Here you should check if two given words are anagrams of each other i.e. one of the words can be creating by
     * permuting the letters of the other one.
     * @param word1 Das erste Wort
     * <p>
     *              The first word.
     * @param word2 Das zweite Wort
     * <p>
     *              The second word
     * @return True, falls es sich bei dem zweiten Wort um ein Anagramm des ersten handelt, andernfalls False
     * <p>
     *          True if and only if one of the input words is an anagram of the other one.
     * <p>
     * -Hinweis-
     * hier bietet sich die Verwendung einer geeigneten Datenstruktur an um diese Aufgabe angenehm lösen zu.
     * Als Hilfsmittel wären hier also die Klassen ArrayList und HashMap erlaubt.
     * <p>
     * -Attention-
     * <p>
     * In this exercise you are allowed to import and use either ArrayList or Hashmap (or both) because
     * the exercise is otherwise not very nice to solve.
     */
    public static boolean anagram(final String word1, final String word2)
    {
        // NULL oder ungleiche Längen können keine Anagramme sein
        if(word1 == null || word2 == null || word1.length() != word2.length()){
            return false;
        }
      //  HashMap<Character,Integer> charCount = new HashMap<>();
       ArrayList<Character> word1List = new ArrayList<>();

        for (char c : word1.toCharArray()){
            word1List.add(c);
        }

        for (char c : word2.toCharArray()){
            if(word1List.contains(c)){
                word1List.remove((Character) c);
            }else {
                return false;
            }
        }
return word1List.isEmpty();
    }

    /**
     * diese Method ist Rekusiv
     * @param n
     * @return fibonachi zahlen
     */
    public static long fibonachiRekusiv(int n){
        return n < 2 ? n : fibonachiRekusiv(n-1) + fibonachiRekusiv(n-2) ;
    }




    /**
     * Hier soll ein Wort dahingehend untersucht werden, ob es sich an endlich vielen Stellen teilen lässt, sodass
     * dann alle Teilwörter identisch sind. Zum Beispiel lässt sich "ABAABAABA" so zerteilen, dass sich 3 Mal
     * das Teilwort "ABA" ergibt, daher wäre hier eine solche Zerlegung in endlich viele Teilwörter möglich.
     * Hier sei definiert, dass mindestens eine Zerlegung in 2 Teilwörter möglich sein muss, einzelne Zeichen haben
     * daher keine gültige Zerlegung.
     * <p>
     * Here you should check if a given string can be divided into a finite amount of substrings so that all substrings
     * are equal. E.g. the string "ABAABAABA" can be divided into the three substrings "ABA". We define that a string
     * has to be divided into at least two substrings for the output of this function to be true i.e. single letters or
     * the empty string are not considered to be dividable into finite substrings.
     *
     * @param word Das zu testende Wort
     * <p>
     *             The word that should be checked
     * @return True, falls sich eine Zerlegung in endlich viele identische Teilwörter finden lässt, andernfalls False
     * <p>
     *          True if and only if the input string can be divided into a finite amount of identical substrings
     *          <p>
     * -Hinweis-
     * <p>
     * Bei dieser Aufgabe wäre die Verwendung einer ArrayList erlaubt.
     * <p>
     * -Attention-
     * <p>
     * You are allowed to import and use ArrayList for this exercise.
     */
    public static boolean identicalParts(final String word)
    {
        if (word.length() < 2 || word == null){
            return false;
        }

        int length = word.length();

        for (int i = 1 ; i <= length / 2 ; i++){
            if (length % i == 0){
                String substring = word.substring(0,i); //შესაძლო სიტყვის ვარიანტი
                StringBuilder builder = new StringBuilder();
                // erzeuge das wort und wiederhole des Teilworts
                for (int j = 0; j < length /i; j++) {
                    builder.append(substring);
                }
                if(builder.toString().equals(word)){
                    return true;
                }
            }
        }



        return false;
    }


    public static void main(String[] args) {


        String word= "ABCABCABC";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <3 ; i++) {
            System.out.println(builder.append(word));
        }

        //System.out.println(word.substring(0,3));


    }

    /**
     * Hier soll eine Datenstruktur implementiert werden, die analog zur in der Vorlesung vorgestellten Queue
     * funktioniert und somit nach dem FIFO (first-in-first-out)-Prinzip arbeitet. Unsere Queue ist beschränkt.
     * Wir nehmen der Einfachheit halber an, dass nur positive Zahlen und keine 0 der Queue hinzugefügt werden können.
     * Der Eintrag 0 kann daher als Indikator für eine nicht belegte Zelle aufgefasst werden
     * <p>
     * Here you should implement your own data structure which should behave exactly like the Queue data structure which
     * was introduced in the lecture and works according to the FIFO (first-in-first-out)-principle. Your Queue should
     * be restricted. We assume that neither 0 nor negative numbers can be added to the queue. Hence 0 can be interpreted as
     * indicator that a cell is not used
     */

    public static class DataQueue
    {


        /**
         * Die interne Speicherverwaltung der Queue
         * <p>
         * The internal storage of the Queue
         */
        private final int[] store;

        int head = 0;
        /**
         * Erzeugt ein neues Objekt vom Datentyp DataQueue
         * <p>
         * Creates a new Queue-object
         * @param limit Der maximale Füllstand der Queue. Wir nehmen an, dass negative Werte nicht übergeben werden können
         *              <p>
         *              The maximum capacity of your Queue. You can assume it to be not negative.
         */
        public DataQueue(int limit)
        {
            if(limit < 0){
                throw new IllegalArgumentException("es kann nicht negativ oder 0 sein ");
            }

            store = new int[limit];
        }

        /**
         * Hier sollt ihr eine Möglichkeit implementieren, unserer Queue Elemente hinzuzufügen.
         * Dabei muss der Füllstand beachtet werden.
         * <p>
         * Here you should implement a function that allows us to put elements into the Queue.
         * Take care of the maximum capacity of the Queue
         * @param value Der hinzuzufügende Wert.
         * <p>
         *           The value that should be added.
         * @return True, falls der Wert erfolgreich hinzugefügt werden konnte.
         *          False, falls kein Platz in der Queue vorhanden war.
         *          <p>
         *          True if the value could be added successfully.
         *          False if there was no space left in the Queue to add the value
         */
        public boolean put(final int value)
        {
            if (value <= 0) { // Nur positive Werte erlaubt
                throw new IllegalArgumentException("Nur positive Zahlen erlaubt.");
            }
            if(head < store.length ){
                store[head] = value ;
                head ++ ;
                return true;
            }
            return false;
        }

        /**
         * Hier sollt ihr eine Möglichkeit implementieren, Elemente aus unserer Queue zu entnehmen.
         * Beachtet hierbei das FIFO-Prinzip. Aus einer leeren Queue darf nichts entnommen werden,
         * in diesem Fall soll -1 zurückgegeben werden. Entnommene Elemente müssen aus der Queue gelöscht werden.
         * <p>
         * Here you should implement a function that allows us to take values out of the Queue.
         * Take care of the FIFO-principle and remove elements from your Queue after they are taken.
         * It is not allowed to take elements out of an empty Queue. In this case you should return -1
         * @return Der nächste verfügbare Wert nach dem FIFO-Prinzip oder -1, falls die Queue leer war
         * <p>
         *     The next value in the Queue according to the FIFO-principle or -1 if the Queue was empty
         */
        public int get()
        {
            int ergebnis = store[0];

            if(head == 0){
                return -1;
            }
            if (head == 1){

                 store[0] = -1;
            }

                for (int i = 0; i < head + 1; i++) {

                    store[i] = store[i + 1];
            }
            head --;
            return ergebnis;

        }

    }

    /**
     * Hier soll eine Datenstruktur implementiert werden, die analog zum in der Vorlesung vorgestellten Stack
     * funktioniert und somit nach dem LIFO (last-in-first-out)-Prinzip arbeitet. Unser Stack ist beschränkt.
     * Wir nehmen der Einfachheit halber an, dass nur positive Zahlen und keine 0 dem Stack hinzugefügt werden können.
     * Der Eintrag 0 kann daher als Indikator für eine nicht belegte Zelle aufgefasst werden
     * <p>
     * Here you should implement your own data structure which should behave exactly like the Stack data structure which
     * was introduced in the lecture and works according to the LIFO (last-in-first-out)-principle. Your Stack should
     * be restricted. We assume that neither 0 nor negative numbers can be added to the stack. Hence 0 can be interpreted as
     * indicator that a cell is not used
     */
    public static class DataStack
    {
        /**
         * Die interne Speicherverwaltung des Stack
         * <p>
         * The internal storage of the Queue
         */
        private final int[] store;
        int head;
        /**
         * Erzeugt ein neues Objekt vom Datentyp DataStack
         * <p>
         * Creates a new Stack-object
         * @param limit Der maximale Füllstand des Stack. Wir nehmen an, dass keine negativen Eingaben möglich sind.
         *              <p>
         *              The maximum capacity of your Queue. You can assume it to be not negative.
         */
        public DataStack(int limit)
        {
            if(limit < 0){
                throw new IllegalArgumentException("limit muss mehr als 0 sein");
            }

            head = 0;

            store = new int[limit];
        }

        /**
         * Hier sollt ihr eine Möglichkeit implementieren, unserem Stack Elemente hinzuzufügen.
         * Dabei muss der Füllstand beachtet werden.
         * <p>
         * Here you should implement a function that allows us to put elements into the Stack.
         * Take care of the maximum capacity of the Stack
         * @param value Der hinzuzufügende Wert.
         * <p>
         *              The value that should be added
         * @return True, falls der Wert erfolgreich hinzugefügt werden konnte.
         *          False, falls kein Platz auf dem Stack vorhanden war.
         *          <p>
         *          True if the value could be added successfully.
         *          False if there was no space left in the Stack to add the value
         */
        public boolean push(final int value)
        {
            if(value < 0){
                throw new IllegalArgumentException("limit muss mehr als 1 sein");
            }else if (head < store.length) {
                store[head] = value;
                head++;
                return true;
            }
            return false;
        }

        /**
         * Hier sollt ihr eine Möglichkeit implementieren, Elemente von unserem Stack zu entnehmen.
         * Beachtet hierbei das LIFO-Prinzip. Aus einem leeren Stack darf nichts entnommen werden,
         * in diesem Fall soll -1 zurückgegeben werden. Entnommene Elemente werden vom Stack gelöscht.
         * <p>
         * Here you should implement a function that allows us to take values out of the Stack.
         * Take care of the LIFO-principle and remove elements from your Stack after they are taken.
         * It is not allowed to take elements out of an empty Stack. In this case you should return -1
         * @return Der nächste verfügbare Wert nach dem LIFO-Prinzip oder -1, falls der Stack leer war
         * <p>
         *     The next value in the Stack according to the LIFO-principle or -1 if the Stack was empty
         */
        public int pop()
        {
            if (head == 0){
                return -1;
            }
            if (store[head -1 ] == 0){
                head --;
                return -1;
            }
            int ergebnis = store[head -1];
            store[head -1] = 0;

            head--;
            return ergebnis;
        }
    }

    /**
     * ეს კლასი წარმოადგენს მრავალფენოვან სიმრავლეს მათემატიკის გაგებით.
     * იგი ინიციალიზდება გენერიკული მასივის გამოყენებით და ამჟამად მხოლოდ მას ინახავს.
     * თქვენი ამოცანაა, რომ სწორად იმპლემენტიროთ მეთოდი `equals`, რათა ორი სიმრავლე ჩაითვალოს ტოლად,
     * თუ მათი შიგთავსი ტოლია.
     * მაგალითად, [1, 2, 3]-ის შემცველი სიმრავლე ტოლია [3, 1, 2, 1]-ის შემცველი სიმრავლეს, რადგან ორივე
     * შეიცავს ერთსა და იმავე მნიშვნელობებს.
     *
     * This class represents a mathematical set. It can be initialized using a generic array and only saves it by now.
     * Your exercise here is to implement equals for this class so that two sets are seen as equal when their contents
     * are equal. E.g. a set with content [1, 2, 3] should be equal to a set with content [3, 1, 2, 1] because they both contain
     * same values.
     * <p>
     * Diese Klasse stellt eine Menge im mathematischen Sinne dar. Sie wird mit beliebigen Arrays initialisiert und speichert
     * diese vorerst einfach. Eure Aufgabe ist es, die Methode ''equals'' für diese Klasse sinnvoll zu implementieren, sodass
     * 2 Mengen mit gleichem Inhalt auch gleich sind. Zum Beispiel ist ein Set mit dem Inhalt [1, 2, 3] äquivalent zu einem
     * Set mit [3, 1, 2, 1] da beide die gleichen Elemente enthalten
     *
     */
    public static class SpecialSet<E extends Number  >
    {
        /**
         * The content of our set
         * <p>
         * Die Werte im Set
         */
        private final E[] content;


        /**
         * Initializes a new set with a given content
         * <p>
         * Initialisiert eine Menge mit einem spezifizierten Inhalt
         * @param content The Content
         *                <p>
         *                Der Inhalt
         */
        SpecialSet(final E[] content )
        {
            this.content = content;
        }



    }



    /**
     * Diese Methode findet das zusammenhängende Teilarray eines Eingabearrays, welches sich zur größten
     * Summe aufaddieren lässt und berechnet diese Summe.
     * Die Eingabe darf sowohl negative als auch positive ganzzahlige Werte enthalten.
     * Die Ausgabe kann die Summe über dem leeren Array sein, falls nur negative Werte enthalten sind.
     * <p>
     *     * ეს მეთოდი პოულობს მოცემული მასივის ისეთ მეზობლად განლაგებულ ქვემასივს, რომლის ელემენტების ჯამი მაქსიმალურია,
     *  * და გამოთვლის ამ ჯამს.
     *  * შესასვლელ მონაცემად შეიძლება იყოს როგორც დადებითი, ისე უარყოფითი მთელი რიცხვები.
     *  * შედეგი შეიძლება იყოს ცარიელი მასივის ჯამიც, თუ მასივი მხოლოდ უარყოფით რიცხვებს შეიცავს.
     *  *
     * This method calculates the subarray of an input array which contains the highest sum and calculates this sum.
     * The input can contain positive numbers as well as negative integer numbers.
     *  The output can be the sum over the empty array if there are only negative numbers.
     * @param array Ein Array aus ganzzahligen, nicht notwendigerweise positiven Werten.
     * <p>
     *              An array of integer numbers which can be positive or negative.
     * @return Die Summe des größten zusammenhängenden Teilarrays innerhalb des Eingabearrays oder 0, falls das
     *          Eingabearray ausschließlich negative Werte enthält.
     *   <p>
     *          The highest sum of a subarray which is contained in the input-array or 0 if there were
     *          only negative numbers in the array
     * @throws IllegalArgumentException Wenn die Eingabe leer ist oder null ist
     * <p>
     *                               if the input array was empty or null
     */
    public static int maxSubArraySum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Das array darf nicht leer sein");
        }
        int maxSam = 0;
        int curentSum = 0;


        for (int sum : array){
            curentSum += sum;
            if(curentSum < 0){
                curentSum = 0;
            }
            if (curentSum > maxSam){
                maxSam = curentSum;
            }

        }
        return maxSam;
    }
}

