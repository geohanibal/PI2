package aufgabe4;

public class Aufgaeb4 {


    public static void main(String[] args) {

        // 1. Variablen erstellen und Werte zuweisen
        int ganzeZahl = 42;
        double kommazahl = 3.14;
        char buchstabe = 'A';
        boolean wahrheitswert = true;

        // 2. Werte ausgeben
        System.out.println("Integer: " + ganzeZahl);
        System.out.println("Double: " + kommazahl);
        System.out.println("Char: " + buchstabe);
        System.out.println("Boolean: " + wahrheitswert);

        //3 String
        String greeting = "Hello, World!" + " How are you?";
        System.out.println(greeting);

        //4 Aufzählungen enum

        enum Wochentag {
            MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
        }
        Wochentag heute = Wochentag.DIENSTAG;
        System.out.println(heute);

        // 4 return-Anweisung
        System.out.println(add(5,10));
        //5 Lokale Konstanten und Variablen
        System.out.println(calculateArea(10));

        //Methode, Signatur und Methodenaufruf
        System.out.println(greet("sergi"));
        System.out.println(multiply(10,10));

    }
    // 4 return-Anweisung
    public static int add(int a,int b){
        return a + b;
    }
    public static double calculateArea( double r){
        final double PI= 3.1415159;
        return r * r * PI;
    }
    public static String greet(String greetName){
        return "Hi "+ greetName +" gut und du?";
    }
    public static int multiply(int x, int y){
        return x * y;
    }

}
