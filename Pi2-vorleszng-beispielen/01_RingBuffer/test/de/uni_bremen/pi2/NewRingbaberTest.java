package de.uni_bremen.pi2;

import org.junit.jupiter.api.Test;

public class NewRingbaberTest {
    @Test
    public void main() {
        final  RingBuffer<String> ringbuffer = new RingBuffer<String>(5);
        ringbuffer.push("Sergi");
        ringbuffer.push("gia");
        ringbuffer.push("Misho");
        ringbuffer.push("Levabni");
        for (int i = 0; i < ringbuffer.size(); i++) {
            System.out.println(ringbuffer);

        }

    }

}
