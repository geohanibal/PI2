package P1Vorbereitung.src.Lore;

import java.time.Duration;
import java.time.Instant;

public record Tree(Instant birthday) {
    public Tree{
        if(getAge() > 25){
            throw new IllegalArgumentException();
        }
        }
        public  float getAge(){
        return Duration.between(birthday, Instant.now()).toDays() / 365.24f;
        }
}
