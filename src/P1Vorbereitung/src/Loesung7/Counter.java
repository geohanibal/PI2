package P1Vorbereitung.src.Loesung7;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }

    public static Counter createWithInitialValue(int  initialValue) {
       Counter counter = new Counter();
       counter.count = initialValue;
       return counter;
    }

    public int getCount() {
        return count;
    }
}
