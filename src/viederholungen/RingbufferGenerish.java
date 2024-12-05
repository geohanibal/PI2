package viederholungen;

public class RingbufferGenerish<E>{
    /*um werte zu speichern*/
    private final Object  [] buffer;

    private int head;
    private int entries;

    public RingbufferGenerish (final  int capacity){
        buffer = new Object[capacity];
    }


    public void push(final E value)
    {
        if(buffer.length > 0){
            if(entries == buffer.length){
                pop();
            }
            buffer[(head + entries++)% buffer.length]= value;
        }

    }

    /**
     *
     *
     * @return älteste element von buffer
     */
    public E peek()
    {
        return  (E) buffer[head];
    }

    public E pop()
    {
        final E value = peek();
        head = (head + 1) % buffer.length;
        --entries;
        return value;

    }

    public int size()
    {
        return entries;
    }

    public static void main(String[] args) {
        RingbufferGenerish<Integer> ring = new RingbufferGenerish<>(3);
        ring.push(10);
        ring.push(20);
        ring.push(31);
        System.out.println(ring.pop());

        RingbufferGenerish<String> ringString = new RingbufferGenerish<>(3);
        ringString.push("sergi");
        ringString.push("gia");
        ringString.push("mayvala");
        ringString.push("ggela");
        System.out.println(ringString.pop());

    }



}
