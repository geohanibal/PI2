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

        HashMap<String,Double> essenPreisZuordnung = new HashMap<>();
        essenPreisZuordnung.put("Piza Funghi", 9.50);
        essenPreisZuordnung.put("Pommes", 8.50);
        essenPreisZuordnung.put("Döner", 9.90);
        essenPreisZuordnung.put("Margarita", 11.50);

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
}


}
