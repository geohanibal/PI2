package viederholungen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence implements Iterable<Integer> {
 private final int start;
 private final int end;

 public Sequence (final int start, final int end){
           this.start = start;
  this.end = end;
 }

 public Iterator<Integer> iterator()
 {

  return new Iterator<Integer>() {
   private int current = start;

   @Override
   public boolean hasNext() {
    return current <= end;
   }

   @Override
   public Integer next() {
    if(!hasNext()){
     throw new NoSuchElementException(" No more element");
    }
    return current ++;
   }
  };
 }
 public static void main(String[] args) {


  for ( final int i : new Sequence (5, 10) ) {
   System.out.print (i + " ");
  }
 }

}
