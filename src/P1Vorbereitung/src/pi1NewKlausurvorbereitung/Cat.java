package P1Vorbereitung.src.pi1NewKlausurvorbereitung;

import java.time.Instant;

public class Cat extends Animal {
    protected Cat(Instant birthday) {
        super(birthday);
        if(getAge() > 20f){
            throw new IllegalArgumentException("es ist zu alt");
        }
    }

    @Override
    protected void makeNose() {
        System.out.println("miau");
    }

}