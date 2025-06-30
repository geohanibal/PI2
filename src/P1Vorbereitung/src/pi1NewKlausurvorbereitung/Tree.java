package P1Vorbereitung.src.pi1NewKlausurvorbereitung;

import java.time.Duration;
import java.time.Instant;

public record Tree(Instant plantingDay) {

    public float getAge() {
        return (float) (Duration.between(plantingDay, Instant.now()).toDays() / 365.24);
    }
}