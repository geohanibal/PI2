package P1Vorbereitung.src.pi1NewKlausurvorbereitung;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class mainVonAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog(Instant.parse("2025-04-13T00:00:00Z"));
        Cat cat1= new Cat(Instant.parse("2021-04-13T00:00:00Z"));
        Cat cat2= new Cat(Instant.parse("2012-04-13T00:00:00Z"));
        Dog dog1= new Dog(Instant.parse("2025-04-13T00:00:00Z"));
        Dog dog2= new Dog(Instant.parse("2012-04-13T00:00:00Z"));

         cat2.dislikes = dog1;
         dog1.dislikes = cat2;

        System.out.println("cat2 dislike dog1  "+ cat2.dislikes.getAge());
        System.out.println("dog1  "+dog1.dislikes.getAge());

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);
        dog.makeNose();

        Optional<Dog> puppy = Animal.puppy(animals);
        if(!Animal.puppy(animals).isEmpty()){
            System.out.println("eyes");
        }else{
            System.out.println("no");
        }

        System.out.println("katzen sind im durschnitt:"+Animal.averageAgeOfCats(animals));
        System.out.println("oldeste Dog" + Animal.oldestDog(animals));
        System.out.println("older Animal " + Animal.olderAnimals(animals,30));

       Tree oak = new Tree(Instant.parse("2010-03-01T00:00:00Z"));
        System.out.println("Der Baum ist " + oak.getAge() + " Jahre alt.");
    }
}