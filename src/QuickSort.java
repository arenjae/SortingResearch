

import java.util.ArrayList;
public class QuickSort
{
    public static void main(String[] args)
    {
        int first = 0;
        int last = 8;
        ArrayList<Integer> list = new ArrayList <Integer> ();
        list.add(1);
        list.add(22);
        list.add(34);
        list.add(28);
        list.add(19);
        list.add(84);
        list.add(11);
        list.add(92);
        list.add(1);
        System.out.println("CONFIGURATION BEFORE CALL TO QUICKSORT");
        print (list, first, last);
        quickSort (list, first, last);
        System.out.println("CONFIGURATION AFTER CALL TO QUICKSORT");
        print (list, first, last);
    }
    public static void quickSort (ArrayList<Integer> quickTest, int first, int last)
    {
        int g = first, h = last;

        int midIndex = (first + last) / 2;
        Comparable dividingValue = quickTest.get(midIndex);
        do
        {
            while (quickTest.get(g).compareTo((Integer) dividingValue) < 0) g++;
            while (quickTest.get(h).compareTo((Integer) dividingValue) > 0) h--;
            if (g <= h)
            {
                //swap(list[g], list[h]);
                swap(quickTest,g,h);
                g++;
                h--;
            }
        }

        while (g < h);

        if (h > first) quickSort (quickTest,first,h);
        if (g < last) quickSort (quickTest,g,last);
    }

    public static void swap (ArrayList<Integer> quickTest, int g, int h)
    {
        Integer temp = quickTest.get(g);
        quickTest.set(g, quickTest.get(h));
        quickTest.set(h, temp);
    }

    public static void print (ArrayList<Integer> list, int first, int last)
    {
        for (int i = 0; i<9;i++)
        System.out.println(list.get(i));
    }
}





//following takes in int[]
//import java.util.List;
//import java.util.ArrayList;
//
//public class QuickSort {
//
//	// Swapping two elements
//		static void swap(int[] array, int a, int b){
//			int temp = array[a];
//			array[a] = array[b];
//			array[b] = temp;
//		}
//
//	
//private static int[] quickSort(int[] array, int start, int end){
//		if (end - start <= 1) {
//			if((end-start ==1) && array[start] > array[end]){
//				swap(array, start, end);
//			}
//			return array;
//		}
//
//		int pivot = pivot(array, start);
//		int med = partition(array, start, end, pivot);
//		quickSort(array, start, med-1);
//		quickSort(array, med+1, end);
//		return array;
//	}
//
//	private static int pivot(int[] array, int start){
//		return start;
//	}
//
//	private static int partition(int[] array, int start, int end, int pivot){
//		swap(array, end, pivot);
//		int place = end;
//
//		for (int i = start; i< end; i++) {
//			if(array[i] > array[end]){
//				boolean ordered = true;
//				for (int j = i+1; j<end; j++) {
//					if(array[j]<=array[end]){
//						ordered = false;
//						swap(array, j, i);
//						break;
//					}
//				}
//				if(ordered){
//					place = i;
//					break;
//				}
//			}
//		}
//		swap(array, place, end);
//		return place;
//	}
//
//}


//following compiles, just doesn't sort, returns unsorted

///**
// * Quick sort algorithm (simple)
// * based on pseudo code on Wikipedia "Quick Sort" aricle
// * 
// * @see http://en.wikipedia.org/wiki/Quicksort#Simple_version
// * @author djitz
// *
// */
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//
//public class QuickSort {
//
//	/**
//	 * Main method.
//	 * @param args
//	 */
////	public static void main(String[] args) {
////
////		QuickSort app = new QuickSort();
////		
////		 //Generate an integer array of length 7
////	    List<Integer> input = app.generateRandomNumbers(7);
////		
////	    //Before sort
////	    System.out.println(input);
////		
////	    //After sort
////	    System.out.println(app.quickSort(input));
////	    
////	}
//	
//	/**
//	 * This method sort the input ArrayList using quick sort algorithm.
//	 * @param input the ArrayList of integers.
//	 * @return sorted ArrayList of integers.
//	 */
//	static List<Integer> quickSort(List<Integer> input){
//		
//		if(input.size() <= 1){
//			return input;
//		}
//		
//		int middle = (int) Math.ceil((double)input.size() / 2);
//		int pivot = input.get(middle);
//
//		List<Integer> less = new ArrayList<Integer>();
//		List<Integer> greater = new ArrayList<Integer>();
//		
//		for (int i = 0; i < input.size(); i++) {
//			if(input.get(i) <= pivot){
//				if(i == middle){
//					continue;
//				}
//				less.add(input.get(i));
//			}
//			else{
//				greater.add(input.get(i));
//			}
//		}
//		
//		return concatenate(quickSort(less), pivot, quickSort(greater));
//	}
//	
//	/**
//	 * Join the less array, pivot integer, and greater array
//	 * to single array.
//	 * @param less integer ArrayList with values less than pivot.
//	 * @param pivot the pivot integer.
//	 * @param greater integer ArrayList with values greater than pivot.
//	 * @return the integer ArrayList after join.
//	 */
//	private static List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater){
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for (int i = 0; i < less.size(); i++) {
//			list.add(less.get(i));
//		}
//		
//		list.add(pivot);
//		
//		for (int i = 0; i < greater.size(); i++) {
//			list.add(greater.get(i));
//		}
//		
//		return list;
//	}
//	
//	/**
//	 * This method generate a ArrayList with length n containing random integers . 
//	 * @param n the length of the ArrayList to generate.
//	 * @return ArrayList of random integers with length n. 
//	 */
//	private List<Integer> generateRandomNumbers(int n){
//		
//	    List<Integer> list = new ArrayList<Integer>(n);
//	    Random random = new Random();
//		
//	    for (int i = 0; i < n; i++) {
//		    list.add(random.nextInt(n * 10));
//	    }
//	
//	    return list;
//	}
//
//}
