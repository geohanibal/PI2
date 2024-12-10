package de.uni_bremen.pi2;

/**
 * Die Klasse implementiert einen Ringpuffer, d.h. einen Puffer, der eine
 * bestimmte Menge von Werten zwischenspeichern kann. Man kann mit
 * {@link #push(int)} Werte hinzufügen und mit {@link #pop()} wieder entnehmen.
 * Dabei liefert {@link #pop()} die Werte in derselben Reihenfolge zurück, in
 * der sie mit {@link #push(int)} eingefügt wurden, d.h. {@link #pop()} liefert
 * immer das Element zurück, das schon am längsten im Puffer gespeichert ist.
 * Wird ein neues Element in den Puffer eingefügt, wenn seine Kapazität bereits
 * erreicht ist, geht das älteste Element verloren. Es ist nicht erlaubt, auf
 * ein Element zuzugreifen, wenn der Puffer leer ist. In dem Fall ist das
 * Verhalten undefiniert.
 */


import java.util.Arrays;

/**
 *  Werte hinzufügen
 * {@link #pop()} wieder entnehmen und liefertdie Werte in derselben Reihenfolge zurücK
 * ანუ   იმ თანმიმდევრობით აბრუნებს რითიც დაემატა
 *ასე იმპლემენტირებს რგოლის ბუფერს, რაც ნიშნავს, რომ იგი შუალედური ბუფერია,
 *რომელიც გარკვეული რაოდენობის მნიშვნელობებს ინახავს. თქვენ შეგიძლიათ დაამატოთ
 *მნიშვნელობები {@link #push(T)} მეთოდის გამოყენებით და {@link #pop()}
 *მეთოდის გამოყენებით ამოიღოთ. {@link #pop()} მეთოდი აბრუნებს მნიშვნელობებს იმავე თანმიმდევრობით,
 *რომელშიც ისინი {@link #push(T)} მეთოდის გამოყენებით დაემატა,
 *ანუ {@link #pop()} ყოველთვის აბრუნებს ელემენტს,
 *რომელიც ბუფერში ყველაზე დიდი ხნის განმავლობაში ინახებოდა.
 *როდესაც ახალი ელემენტი ემატება ბუფერში, როდესაც მისი ტევადობა უკვე მიღწეულია,
 *უძველესი ელემენტი იკარგება. არ არის ნებადართული ელემენტზე წვდომა, როდესაც ბუფერი ცარიელია.
 *ასეთ შემთხვევაში ქცევა გაურკვეველია.
 */
public class RingBuffer<T>
{
    /** Der eigentliche Puffer, der die Werte speichert. */
    private final T[] buffer;

    /** Der Kopf des Ringpuffers, d.h. die Stelle, an der als Nächstes etwas gelesen wird. */
    private int head = 0;

    /** Der Füllstand des Puffers - ბუფერი. */
    private int entries = 0;

    /**
     * Erzeugt einen Ringpuffer.
     * @param capacity Die maximale Anzahl von Einträgen, die gepuffert werden können.
     */
    public RingBuffer(final int capacity)
    {
        buffer = (T[]) new Object[capacity];
    }

    /**
     * Fügt ein neues Element in den Ringpuffer ein.
     * @param value Der Wert, der eingefügt werden soll.
     */
    public void push(final T value)
    {
        if (buffer.length > 0) {
            if (entries == buffer.length) {
                pop();
            }
            buffer[(head + entries++) % buffer.length] = value;
        }
    }

    /**
     * Liefert das älteste Element aus dem Ringpuffer zurück, ohne es zu entnehmen.
     * @return Das älteste Element im Ringpuffer.
     */
    public T peek()
    {
        return buffer[head];
    }

    /**
     * Entnimmt das älteste Element aus dem Ringpuffer.
     *
     * @return Das Element, das entnommen wurde.
     */
    public T pop()
    {
        final T value = peek();
        head = (head + 1) % buffer.length;
        --entries;
        return value;
    }

    /**
     * Liefert die Anzahl der Elemente zurück, die sich im Puffer befinden, d.h. die
     * mit {@link #pop()} entnommen werden könnten.
     * @return Die Anzahl der belegten Einträge im Puffer.
     */
    public int size()
    {
        return entries;
    }

    @Override
    public String toString() {
        return "RingBuffer{" +
                "buffer=" + Arrays.toString(buffer) +
                ", head=" + head +
                ", entries=" + entries +
                '}' + "size = " + size();
    }


}