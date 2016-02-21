import java.util.ArrayList;

public class MessUpSort {
	public static void messUpSort(ArrayList<Integer> testA){
		int k = 0;
		while (k < (testA.size()-5)){
			int temp = testA.get(k);
			int b = testA.get(k+5);
			//set(index,element)
			testA.set(k, b);
			testA.set(k+5, temp);
			k = k + 5;
		}
	}
}
