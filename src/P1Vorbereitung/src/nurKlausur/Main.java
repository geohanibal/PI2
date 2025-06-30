package P1Vorbereitung.src.nurKlausur;

import java.time.Instant;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;


public class Main {

    public record Tree(Instant plantingDay){
        public double getAge(){
            return Duration.between(plantingDay, Instant.now()).toDays() / 365.24;
        }
    }
    public static void main(String[] args) {

        // Erstelle einen Baum mit Pflanzdatum
        Tree oak = new Tree(Instant.parse("2010-05-15T00:00:00Z"));

        // Berechne und gebe das Alter des Baumes aus
        System.out.println("Der Baum ist " + oak.getAge() + " Jahre alt.");

        Cat cat1 = new Cat(Instant.parse("2025-04-13T00:00:00Z"));
        Cat cat2 =  new Cat(Instant.parse("2012-01-01T00:00:00Z"));
        Dog dog1 = new Dog(Instant.parse("2015-04-13T00:00:00Z"));
        Dog dog2 = new Dog(Instant.parse("2025-04-13T00:00:00Z"));

        cat1.disLikes= null;
        cat2.disLikes=dog1;
        dog1.disLikes=cat1;
        dog2.disLikes=null;

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);

        for (Animal animal : animals){
            animal.makeNoise();
        }

        System.out.println("Cat2 dislikes Dog1: " + (cat2.disLikes == dog1));


    }
}
