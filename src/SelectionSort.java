//source java2novice.com

import java.util.ArrayList;
import java.util.Vector;

public class SelectionSort {
	public static void selectionSort(ArrayList<Integer> arr) { 
		for (int i = 0; i < arr.size() - 1; i++)
		{
			int minPos = i;
			for (int j = i + 1; j < arr.size(); j++)
				if (arr.get(j).compareTo(arr.get(minPos))< 0)
					minPos = j;
			
			Integer smallerElement = arr.get(minPos);
			arr.set(minPos, arr.get(i));
			arr.set(i, smallerElement);
		}
	}
}

