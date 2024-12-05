package viederholungen;

public class Ringbuffer
{
    /*um werte zu speichern*/
    private final int[] buffer;

    private int head;
    private int entries;

    public Ringbuffer (final int capacity){
        buffer = new int[capacity];
    }


    public void push(final int value)
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
    public int peek()
    {
        return buffer[head];
    }

    public int pop()
    {
        final int value = peek();
        head = (head + 1) % buffer.length;
        --entries;
        return value;

    }

    public int size()
    {
        return entries;
    }

    public static void main(String[] args) {





    }
}



