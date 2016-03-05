import java.util.ArrayList;
public class QuickSort
{
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
}
