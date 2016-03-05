//source: dreamincode.net/forums

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tester {
	static int LIST_SIZE = 100000;
	static int INT_SIZE = 100;

    public static void main(String[] args) {
		ArrayList<Integer> insertTest = new ArrayList<>();
		ArrayList<Integer> selectTest = new ArrayList<>();
		ArrayList<Integer> bucketTest = new ArrayList<>();
		ArrayList<Integer> quickTest = new ArrayList<>();
		ArrayList<Integer> mergeTest = new ArrayList<>();
		ArrayList<Integer> heapTest = new ArrayList<>();
		ArrayList<Integer> javaTest = new ArrayList<>();
				
//create list, SIZE is number of elements,
		Random random = new Random();
		for (int i = 0; i < LIST_SIZE; i++) {
            int testB = random.nextInt(INT_SIZE);
            insertTest.add(testB);
            selectTest.add(testB);
            bucketTest.add(testB);
            quickTest.add(testB);
            mergeTest.add(testB);
            heapTest.add(testB);
            javaTest.add(testB);
        }
		
//insertion sort
		/*
		System.out.println(" \ninsertSort:");
		long startInsTime = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime = System.nanoTime();
		System.out.println((endInsTime - startInsTime));
		MessUpSort.messUpSort(insertTest);
		long startInsTime_m = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime_m = System.nanoTime();
		System.out.println((endInsTime_m - startInsTime_m));
		Collections.reverse(insertTest);
		long startInsTime_r = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime_r = System.nanoTime();
		System.out.println((endInsTime_r - startInsTime_r)); 
		
//selection sort
		/*
		System.out.println(" \nselectionSort:");
		long startSelTime = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime = System.nanoTime();
		System.out.println((endSelTime - startSelTime));
		MessUpSort.messUpSort(selectTest);
		long startSelTime_m = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime_m = System.nanoTime();
		System.out.println((endSelTime_m - startSelTime_m));
		Collections.reverse(selectTest);
		long startSelTime_r = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime_r = System.nanoTime();
		System.out.println((endSelTime_r - startSelTime_r));
		*/
//bucket sort	
		System.out.println(" \nbucketSort:");
		long startBucTime = System.nanoTime();
		BucketSort.sort(bucketTest);
		long endBucTime = System.nanoTime();
		System.out.println((endBucTime - startBucTime));
		MessUpSort.messUpSort(bucketTest);
        long startBucTime_m = System.nanoTime();
        BucketSort.sort(bucketTest);
		long endBucTime_m = System.nanoTime();
		System.out.println((endBucTime_m - startBucTime_m));
		Collections.reverse(bucketTest);
		long startBucTime_r = System.nanoTime();
		BucketSort.sort(bucketTest);
		long endBucTime_r = System.nanoTime();
		System.out.println((endBucTime_r - startBucTime_r));

//quick sort		
		System.out.println(" \nquickSort:");
		long startQuiTime = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime = System.nanoTime();
		System.out.println((endQuiTime - startQuiTime));
		MessUpSort.messUpSort(quickTest);
		long startQuiTime_m = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime_m = System.nanoTime();
		System.out.println((endQuiTime_m - startQuiTime_m));
		Collections.reverse(quickTest);
		long startQuiTime_r = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime_r = System.nanoTime();
		System.out.println((endQuiTime_r - startQuiTime_r));
//merge sort		
		System.out.println(" \nmergeSort:");
		long startMerTime = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime = System.nanoTime();
		System.out.println((endMerTime - startMerTime));
		MessUpSort.messUpSort(mergeTest);
		long startMerTime_m = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime_m = System.nanoTime();
		System.out.println((endMerTime_m - startMerTime_m));
		Collections.reverse(mergeTest);
		long startMerTime_r = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime_r = System.nanoTime();
		System.out.println((endMerTime_r - startMerTime_r));

//heap sort
		System.out.println(" \nheapSort:");
		long startHeaTime = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime = System.nanoTime();
		System.out.println((endHeaTime - startHeaTime));
		MessUpSort.messUpSort(heapTest);
		long startHeaTime_m = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime_m = System.nanoTime();
		System.out.println((endHeaTime_m - startHeaTime_m));
		Collections.reverse(heapTest);
		long startHeaTime_r = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime_r = System.nanoTime();
		System.out.println((endHeaTime_r - startHeaTime_r));

//java collections sort
		System.out.println(" \njavaCollectionsSort:");
		long startJavTime = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime = System.nanoTime();
		System.out.println((endJavTime - startJavTime));
		MessUpSort.messUpSort(javaTest);
		long startJavTime_m = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime_m = System.nanoTime();
		System.out.println((endJavTime_m - startJavTime_m));
		Collections.reverse(javaTest);
		long startJavTime_r = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime_r = System.nanoTime();
		System.out.println((endJavTime_r - startJavTime_r));
	}
}
