//source: dreamincode.net/forums

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tester {
	static int LIST_SIZE = 100;
	static int INT_SIZE = 1000;
	
	public static void main(String[] args) {
		ArrayList<Integer> insertTest = new ArrayList<Integer>();
		ArrayList<Integer> selectTest = new ArrayList<Integer>();
		ArrayList<Integer> bucketTest = new ArrayList<Integer>();
		ArrayList<Integer> quickTest = new ArrayList<Integer>();
		ArrayList<Integer> mergeTest = new ArrayList<Integer>();
		ArrayList<Integer> heapTest = new ArrayList<Integer>();
		ArrayList<Integer> javaTest = new ArrayList<Integer>();
				
//create list, SIZE is number of elements, 
//100 is element value range		
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
		
//merge sort		
		System.out.println(" \ninsertSort:");
		long startInsTime = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime = System.nanoTime();
		System.out.println("Took "+(endInsTime - startInsTime) + " ns"); 
		System.out.println(insertTest);
		MessUpSort.messUpSort(insertTest);
		System.out.println(insertTest);
		long startInsTime_m = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime_m = System.nanoTime();
		System.out.println("Took "+(endInsTime_m - startInsTime_m) + " ns"); 
		System.out.println(insertTest);
		Collections.reverse(insertTest);
		System.out.println(insertTest);
		long startInsTime_r = System.nanoTime();
		InsertionSort.insertionSort(insertTest);
		long endInsTime_r = System.nanoTime();
		System.out.println("Took "+(endInsTime_r - startInsTime_r) + " ns"); 
		
//selection sort		
		System.out.println(" \nselectionSort:");
		long startSelTime = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime = System.nanoTime();
		System.out.println("Took "+(endSelTime - startSelTime) + " ns"); 
		System.out.println(selectTest);
		MessUpSort.messUpSort(selectTest);
		System.out.println(selectTest);
		long startSelTime_m = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime_m = System.nanoTime();
		System.out.println("Took "+(endSelTime_m - startSelTime_m) + " ns"); 
		System.out.println(selectTest);
		Collections.reverse(selectTest);
		System.out.println(selectTest);
		long startSelTime_r = System.nanoTime();
		SelectionSort.selectionSort(selectTest);
		long endSelTime_r = System.nanoTime();
		System.out.println("Took "+(endSelTime_r - startSelTime_r) + " ns"); 		
		System.out.println(selectTest);
//bucket sort	
		System.out.println(" \nbucketSort:");
		BucketSort buc = new BucketSort();
		long startBucTime = System.nanoTime();
		BucketSort.sort(bucketTest);
		long endBucTime = System.nanoTime();
		System.out.println("Took "+(endBucTime - startBucTime) + " ns");
		System.out.println(bucketTest);
		MessUpSort.messUpSort(bucketTest);
		System.out.println(bucketTest);
		BucketSort buc_m = new BucketSort();
		long startBucTime_m = System.nanoTime();
		BucketSort.sort(bucketTest);
		long endBucTime_m = System.nanoTime();
		System.out.println("Took "+(endBucTime_m - startBucTime_m) + " ns");
		System.out.println(bucketTest);
		Collections.reverse(bucketTest);
		System.out.println(bucketTest);
		long startBucTime_r = System.nanoTime();
		BucketSort.sort(bucketTest);
		long endBucTime_r = System.nanoTime();
		System.out.println("Took "+(endBucTime_r - startBucTime_r) + " ns");
		System.out.println(bucketTest);

//quick sort		
		System.out.println(" \nquickSort:");
		long startQuiTime = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime = System.nanoTime();
		System.out.println("Took "+(endQuiTime - startQuiTime) + " ns"); 
		System.out.println(quickTest);
		MessUpSort.messUpSort(quickTest);
		System.out.println(quickTest);
		long startQuiTime_m = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime_m = System.nanoTime();
		System.out.println("Took "+(endQuiTime_m - startQuiTime_m) + " ns"); 
		System.out.println(quickTest);
		Collections.reverse(quickTest);
		System.out.println(quickTest);
		long startQuiTime_r = System.nanoTime();
		QuickSort.quickSort(quickTest, 0, quickTest.size()-1);
		long endQuiTime_r = System.nanoTime();
		System.out.println("Took "+(endQuiTime_r - startQuiTime_r) + " ns"); 
		System.out.println(quickTest);
//merge sort		
		System.out.println(" \nmergeSort:");
		long startMerTime = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime = System.nanoTime();
		System.out.println("Took "+(endMerTime - startMerTime) + " ns"); 
		System.out.println(mergeTest);
		MessUpSort.messUpSort(mergeTest);
		System.out.println(mergeTest);
		long startMerTime_m = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime_m = System.nanoTime();
		System.out.println("Took "+(endMerTime_m - startMerTime_m) + " ns"); 
		System.out.println(mergeTest);
		Collections.reverse(mergeTest);
		System.out.println(mergeTest);
		long startMerTime_r = System.nanoTime();
		MergeSort.sort(mergeTest);
		long endMerTime_r = System.nanoTime();
		System.out.println("Took "+(endMerTime_r - startMerTime_r) + " ns"); 
		System.out.println(mergeTest);
//heap sort		
		System.out.println(" \nheapSort:");
		long startHeaTime = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime = System.nanoTime();
		System.out.println("Took "+(endHeaTime - startHeaTime) + " ns"); 
		System.out.println(heapTest);
		MessUpSort.messUpSort(heapTest);
		System.out.println(heapTest);
		long startHeaTime_m = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime_m = System.nanoTime();
		System.out.println("Took "+(endHeaTime_m - startHeaTime_m) + " ns"); 
		System.out.println(heapTest);
		Collections.reverse(heapTest);
		System.out.println(heapTest);
		long startHeaTime_r = System.nanoTime();
		HeapSort.heapSort(heapTest);
		long endHeaTime_r = System.nanoTime();
		System.out.println("Took "+(endHeaTime_r - startHeaTime_r) + " ns"); 
		System.out.println(heapTest);
//java collections sort		
		System.out.println(" \njavaCollectionsSort:");
		long startJavTime = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime = System.nanoTime();
		System.out.println("Took "+(endJavTime - startJavTime) + " ns");
		//System.out.println(javaTest);
		MessUpSort.messUpSort(javaTest);
		//System.out.println(javaTest);
		long startJavTime_m = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime_m = System.nanoTime();
		System.out.println("Took "+(endJavTime_m - startJavTime_m) + " ns"); 
		System.out.println(javaTest);
		Collections.reverse(javaTest);
		System.out.println(javaTest);
		long startJavTime_r = System.nanoTime();
		Collections.sort(javaTest);
		long endJavTime_r = System.nanoTime();
		System.out.println("Took "+(endJavTime_r - startJavTime_r) + " ns"); 
		System.out.println(javaTest);
	}
}
