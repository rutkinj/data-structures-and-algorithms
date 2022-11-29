package sorts;

import org.junit.jupiter.api.Test;
import sorts.insert.InsertSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static sorts.insert.InsertSort.insertionSort;

public class SortTests {

  @Test void simpleInsertSort(){
    int[] sut = new int[]{8, 4, 23, 42, 16, 15};
    int[] sorted = new int[]{4, 8, 15, 16, 23, 42};
    insertionSort(sut);
    assertTrue(Arrays.equals(sut, sorted));
  }

  @Test void reversedInsertSort(){
    int[] sut = new int[]{20,18,12,8,5,-2};
    int[] sorted = new int[]{-2,5,8,12,18,20};
    insertionSort(sut);
    assertTrue(Arrays.equals(sut, sorted));
  }

  @Test void fewUniqueInsertSort(){
    int[] sut = new int[]{5,12,7,5,5,7};
    int[] sorted = new int[]{5,5,5,7,7,12};
    insertionSort(sut);
    assertTrue(Arrays.equals(sut, sorted));
  }

  @Test void nearlySortedInsertSort(){
    int[] sut = new int[]{2,3,5,7,13,11};
    int[] sorted = new int[]{2,3,5,7,11,13};
    insertionSort(sut);
    assertTrue(Arrays.equals(sut, sorted));
  }

}
