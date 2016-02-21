import java.util.ArrayList;
import java.util.List;

public class BucketSort {
  private static final int DEFAULT_BUCKET_SIZE = 5;

  public static void sort(ArrayList<Integer> bucketTest) {
      sort(bucketTest, DEFAULT_BUCKET_SIZE);
  }

  public static void sort(ArrayList<Integer> bucketTest, int bucketSize) {
      if (bucketTest.size() == 0) {
          return;
      }

      // Determine minimum and maximum values
      Integer minValue = bucketTest.get(0);
      Integer maxValue = bucketTest.get(0);
      for (int i = 1; i < bucketTest.size(); i++) {
          if (bucketTest.get(i) < minValue) {
              minValue = bucketTest.get(i);
          } else if (bucketTest.get(i) > maxValue) {
              maxValue = bucketTest.get(i);
          }
      }

      // Initialize buckets
      int bucketCount = (maxValue - minValue) / bucketSize + 1;
      List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
      for (int i = 0; i < bucketCount; i++) {
          buckets.add(new ArrayList<Integer>());
      }

      // Distribute input array values into buckets
      for (int i = 0; i < bucketTest.size(); i++) {
          buckets.get((bucketTest.get(i) - minValue) / bucketSize).add(bucketTest.get(i));
      }

      // Sort buckets and place back into input array
      int currentIndex = 0;
      for (int i = 0; i < buckets.size(); i++) {
          ArrayList<Integer> bucketArray = new ArrayList<Integer>();
          bucketArray = (ArrayList<Integer>) buckets.set(i, bucketArray);
          InsertionSort.insertionSort(bucketArray);
          for (int j = 0; j < bucketArray.size(); j++) {
              bucketTest.set(currentIndex++, bucketArray.get(j));
          }
      }
  }
}

