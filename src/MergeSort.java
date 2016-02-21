import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {
	
	public static void sort(List<Integer> values){
		mergeSort(0, values.size() - 1, values, new ArrayList<Integer>(values));
	}

	private static void mergeSort(int low, int high, List<Integer> values, ArrayList<Integer> arrayList) {
		
		if(low < high){
			int mid = low + (high - low) / 2;
			mergeSort(low, mid, values, arrayList); 
			mergeSort(mid+1, high, values, arrayList);
			merge(low, mid, high, values, arrayList);
		}
	}

	private static void merge(int low, int mid, int high, List<Integer> values, ArrayList<Integer> arrayList) {

		int left = low;
		int right = mid + 1;

		for(int i = low; i <= high; i++){
			arrayList.set(i, values.get(i));
		}

		while(left <= mid && right <= high){
			values.set(low++, arrayList.get(left).compareTo(arrayList.get(right)) < 0 ? arrayList.get(left++) : arrayList.get(right++));
		}

		while(left <= mid){
			values.set(low++, arrayList.get(left++));
		}
	}
}




