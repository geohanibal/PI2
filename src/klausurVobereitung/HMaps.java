package klausurVobereitung;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMaps sind geeignet für die Verwaltung von Schlüsseö-Wert-Paaren
 * Schlüssel → Wert
 * Martikelnummer → Notespiegel
 */
public class HMaps {
    public static void main(String[] args) {

        //Hashmap hesrtellen
        HashMap<String,Double> kokteilPreisZuordnung = new HashMap<>();
        kokteilPreisZuordnung.put("RadMary", 10.10);
        kokteilPreisZuordnung.put("wisky", 5.50);
        kokteilPreisZuordnung.put("ColaWithWisky", 7.0);
        kokteilPreisZuordnung.put("wodaSoda", 4.0);




        //მთლიანი მონაცემების გამოტანა
        System.out.println(kokteilPreisZuordnung);

        //გასაღებით გამოტანა
        System.out.println("Wisky's Preis ist  --->"  + kokteilPreisZuordnung.get("wisky"));

        //მონაცემის არსებობის გასაღებით შემოწმება
        System.out.println("prüft es mit Kay ob -wodaSoda-in Hashmap gibt. Ergebnis ---> "+ kokteilPreisZuordnung.containsKey("wodaSoda"));
        //იმპლიმენტირება და გამოტანა

        System.out.println("\n-------------იმპლიმენტირება და გამოტანა----------\n");

        for(Map.Entry<String,Double> entry : kokteilPreisZuordnung.entrySet()){
            System.out.println("Das Kokteil " + entry.getKey() + "  Preis ist " + entry.getValue());
        }

        // მონაცემის განახლება
        System.out.println("\n------ მონაცემის განახლება --------\n");

        kokteilPreisZuordnung.replace("wisky",11.0);
        System.out.println(kokteilPreisZuordnung);


        HashMap<String,Double> essenPreisZuordnung = new HashMap<>();
        essenPreisZuordnung.put("Piza Funghi", 9.50);
        essenPreisZuordnung.put("Pommes", 8.50);
        essenPreisZuordnung.put("Döner", 9.90);

        essenPreisZuordnung.put("Margarita", 11.50);

        /*
        //მთლიანი მონაცემების გამოტანა
        System.out.println(essenPreisZuordnung);
        // გასაღებით მონაცემის გამოტანა
        System.out.println(essenPreisZuordnung.get("Piza Funghi"));
        //მონაცემის არსებობის შემოწმება
        System.out.println(essenPreisZuordnung.containsKey("Döner"));
        //იმპლიმენტირება და გამოტანა
        System.out.println("-------------------------");
        for (Map.Entry<String,Double> eintrag : essenPreisZuordnung.entrySet()){
            System.out.println("Das Gericht " + eintrag.getKey() + " kostet " + eintrag.getValue());
        }

        //
        essenPreisZuordnung.entrySet().stream().forEach(x -> System.out.println("Das Gericht " + x.getKey() + " kostet " + x.getValue()));
        // მონაცემის განახლება
        essenPreisZuordnung.replace("Döner",7.00);
        System.out.println(essenPreisZuordnung);

         */
}


}
