package P1Vorbereitung.src.nurKlausur;

import java.time.Instant;

public class Dog extends Animal{
    protected Dog(Instant birthday){
        super(birthday);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Waf Waf Waf");
    }
    public boolean isPuppy(){
       return getAge() < 0.25;

    }
}
