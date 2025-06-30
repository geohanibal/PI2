package P1Vorbereitung.src.nurKlausur;

import java.time.Instant;

public class Cat extends Animal{

    public Cat(Instant birthday) {
        super(birthday);
        if(getAge() > 20){
            throw new  IllegalArgumentException();
        }
    }

    @Override
    protected void makeNoise() {
        System.out.println("Miau");
    }
}
