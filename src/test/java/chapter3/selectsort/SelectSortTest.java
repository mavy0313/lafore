package chapter3.selectsort;

import chapter3.bubblesort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectSortTest {

  @Test
  public void shouldReturnSortedArray() {
    //given
    SelectSort selectSort = new SelectSort(4);
    selectSort.insert(4);
    selectSort.insert(3);
    selectSort.insert(2);
    selectSort.insert(1);

    //when
    int[] result = selectSort.sort();

    //then
    assertArrayEquals(new int[]{1,2,3,4}, result);
  }
}
