package P1Vorbereitung.src.nurKlausur;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public abstract class  Animal {
    private  final Instant  birthday;
    public Animal disLikes;


    protected Animal(Instant birthday) {
        this.birthday = birthday;
    }

    public float getAge(){
        return (float) (Duration.between(birthday, Instant.now()).toDays() / 365.24);
    }


    /**
     * Wählt deren Zugriffsrecht so, dass
     * erbende Klassen auf jeden Fall auf sie zugreifen können, aber nicht pauschal alle Klassen.
     * - განსაზღვრავს აბსტრაქტულ მეთოდს `void makeNoise()`. აირჩიეთ მათი წვდომის უფლებები ისე, რომ
     *  მემკვიდრეობით კლასებს ნამდვილად შეუძლიათ მათზე წვდომა, მაგრამ არა ყველა კლასში.
     */
    protected void makeNoise(){};

    public static Optional<Dog> puppy(List<Animal> animals){
        for(Animal animal : animals){
            if (animal instanceof Dog dog && dog.isPuppy()){
                return Optional.of(dog);
            }
        }
        return Optional.empty();
    }
    public static List<Animal> olderAnimals(List<Animal> animals, double minAge){
        return animals.stream()
                .filter(animal -> animal.getAge() >= minAge)
                .collect(Collectors.toList());
    }
    public static double averageAgeOfCats(List<Animal> animals){
        OptionalDouble avarage = animals.stream()
                .filter(animal -> animal instanceof Cat)
                .mapToDouble(animal -> animal.getAge())
                .average();

        return avarage.orElse(-1);
    }

    public static Animal oldestDog(List<Animal> animals){
        return animals.stream().filter(animal -> animal instanceof Dog)
                .max(Comparator.comparingDouble(Animal::getAge)).orElse(null);
    }
}
