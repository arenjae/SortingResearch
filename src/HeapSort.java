import java.util.ArrayList;
import java.util.NoSuchElementException;

class PriorityQueue<E extends Comparable<E>> extends ArrayList<E> {
   
   public void put(E obj) {
      add(obj);
      rotateUp(size() - 1);
   }
   
   public Integer get() {
      if (isEmpty()) throw new NoSuchElementException();
      Integer temp = (Integer) get(0);
      set(0, get(size() - 1));
      remove(size() - 1);
      rotateDown(0);
      return temp;
   }
   
   public void rotateUp(int index) {
      if (index == 0) return;
      int parent = (index - 1)/2;
      if (get(parent).compareTo(get(index)) <= 0) return;
      swap(index, parent);
      rotateUp(parent);
   }
   
   public void rotateDown(int index) {
      int child = 2*(index + 1); //right child
      if (child >= size() || get(child - 1).compareTo(get(child)) < 0) child -= 1;
      if (child >= size()) return;
      if (get(index).compareTo(get(child)) <= 0) return;
      swap(index, child);
      rotateDown(child);
   }
   
   public void swap(int index1, int index2) {
      E temp = get(index1);
      set(index1, get(index2));
      set(index2, temp);
   }      
}

public class HeapSort {
   public static void main(String[] args, ArrayList heapTest) {
        Integer[] a = new Integer[20];
//      java.util.Random random = new java.util.Random();
//      for (int i = 0; i < a.length; i++) {
//         a[i] = new Integer(random.nextInt(100));
//         System.out.print(a[i] + " ");
//      }
//      System.out.println();
      heapSort(heapTest);
//      for (Integer x : heapTest) {
//         System.out.print(x + " ");
//      }
      System.out.println();
   }
   
   public static <E extends Comparable<E>> void heapSort(ArrayList<Integer> a) {
      PriorityQueue<E> pq = new PriorityQueue<E>();
      for (Integer x : a) pq.put((E) x);
      for (int i = 0; i < a.size(); i++) a.set(i, pq.get());
   }
}
