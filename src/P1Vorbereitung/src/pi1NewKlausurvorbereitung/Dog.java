package P1Vorbereitung.src.pi1NewKlausurvorbereitung;

import java.time.Instant;

public class Dog extends Animal{
    protected Dog(Instant birthday) {
        super(birthday);
    }

    @Override
    protected void makeNose() {
        System.out.println("Wau wau");
    }

    /**    es ist Protected, weil
     *     erbende Klassen auf jeden Fall auf sie zugreifen können, aber nicht pauschal alle Klassen.
     */

    public boolean isPuppy(){
        return getAge() < 0.25f;
    }
}