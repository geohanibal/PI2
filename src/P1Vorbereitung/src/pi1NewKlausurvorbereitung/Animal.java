package P1Vorbereitung.src.pi1NewKlausurvorbereitung;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public abstract class Animal{
    private final Instant birthday;
    public Animal dislikes;


    protected Animal(Instant birthday ) {
        this.birthday = birthday;
    }

    protected abstract void makeNose();

    protected float getAge(){
        return (float) (Duration.between(birthday, Instant.now()).toDays() / 365.24);
    }


    public static  Optional<Dog> puppy(List<Animal> animals){
        for (Animal animal : animals){
            if( animal instanceof Dog dog && dog.isPuppy() ){
               return Optional.of(dog);
            }
        }
        return Optional.empty();
    }

    public static List<Animal> olderAnimals(List<Animal> animals, double minAge){
        return animals.stream().filter(animal -> animal.getAge() > minAge).collect(Collectors.toList());
    }

    public static double averageAgeOfCats(List<Animal> animals){
            return animals.stream()
                    .filter(animal -> animal instanceof Cat)
                    .mapToDouble(animal -> ((Cat)animal).getAge() )
                    .average()
                    .orElse(-1);
    }

    public static Animal oldestDog(List<Animal> animals){
        return animals.stream().filter(animal -> animal instanceof Dog).max(Comparator.comparingDouble(Animal::getAge)).orElse(null);
    }




}

